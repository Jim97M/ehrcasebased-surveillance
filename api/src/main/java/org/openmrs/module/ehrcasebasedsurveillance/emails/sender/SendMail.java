package org.openmrs.module.ehrcasebasedsurveillance.emails.sender;

//
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.AdministrationService;
import org.openmrs.module.ehrcasebasedsurveillance.emails.MailSender;
import org.openmrs.util.OpenmrsUtil;
import org.apache.commons.logging.Log;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

public class SendMail implements MailSender {
	
	private static final String EMAIL_PROPERTIES_FILENAME = "email-notification.properties";
	
	protected Log log = LogFactory.getLog(this.getClass());
	
	public AdministrationService administrationService;
	
	private volatile Session session = null;
	
	public SendMail(AdministrationService administrationService) {
		
		this.administrationService = administrationService;
	}
	
	@Override
	public void send(String subject, String bodyText, String[] to, String[] cc, String[] bcc) {
		try {
			MimeMessage mail = new MimeMessage(getSession());
			mail.setFrom(new InternetAddress(this.administrationService.getGlobalProperty("mail.from", "")));
			Address[] toAddress = new Address[1];
			toAddress[0] = new InternetAddress(to[0]);
			mail.setRecipients(Message.RecipientType.TO, getAddress(to));
			if (cc != null && cc.length > 0) {
				mail.setRecipients(Message.RecipientType.CC, getAddress(cc));
			}
			if (bcc != null && bcc.length > 0) {
				mail.setRecipients(Message.RecipientType.BCC, getAddress(bcc));
			}
			mail.setSubject(subject);
			mail.setSentDate(new Date());
			
			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(bodyText, "text/html");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);
			mail.setContent(multipart);
			Transport.send(mail);
		}
		catch (Exception e) {
			throw new RuntimeException("Email could not be send");
		}
	}
	
	private Address[] getAddress(String[] addrs) throws AddressException {
		if (addrs != null && addrs.length > 0) {
			Address[] addresses = new Address[addrs.length];
			for (int i = 0; i < addrs.length; i++) {
				addresses[i] = new InternetAddress(addrs[i]);
			}
			return addresses;
		}
		return new Address[0];
	}
	
	private Session getSession() {
		if (session == null) {
			synchronized (this) {
				if (session == null) {
					Properties sessionProperties = mailSessionPropertiesFromPath();
					if (sessionProperties == null) {
						
						sessionProperties = mailSessionPropertiesFromOMRS();
					}
					final String user = sessionProperties.getProperty("mail.user");
					final String password = sessionProperties.getProperty("mail.password");
					
					if (StringUtils.isNotBlank(user) && StringUtils.isNotBlank(password)) {
						session = Session.getInstance(sessionProperties, new Authenticator() {
							
							@Override
							public PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication(user, password);
							}
						});
					}
				}
			}
		}
		return session;
	}
	
	/**
	 * To be used as a fallback. Mail properties are visible in openmrs settings
	 */
	
	private Properties mailSessionPropertiesFromOMRS() {
		Properties p = new Properties();
		p.put("mail.transport.protocol", administrationService.getGlobalProperty("mail.transport_protocol", "smtp"));
		p.put("mail.smtp.host", administrationService.getGlobalProperty("mail.smtp_host", ""));
		p.put("mail.smtp.port", administrationService.getGlobalProperty("mail.smtp_port", "25"));
		p.put("mail.smtp.auth", administrationService.getGlobalProperty("mail.smtp_auth", "false"));
		p.put("mail.smtp.starttls.enable", administrationService.getGlobalProperty("mail.smtp.starttls.enable", "true"));
		p.put("mail.debug", administrationService.getGlobalProperty("mail.debug", "false"));
		p.put("mail.from", administrationService.getGlobalProperty("mail.from", ""));
		p.put("mail.user", administrationService.getGlobalProperty("mail.user", ""));
		p.put("mail.password", administrationService.getGlobalProperty("mail.password", ""));
		return p;
	}
	
	private Properties mailSessionPropertiesFromPath() {
		Path propertyFilePath = Paths.get(OpenmrsUtil.getApplicationDataDirectory(), EMAIL_PROPERTIES_FILENAME);
		if (Files.exists(propertyFilePath)) {
			Properties properties = new Properties();
			try {
				properties.load(Files.newInputStream(propertyFilePath));
				return properties;
			}
			catch (IOException e) {
				log.error("Could not load email properties from: + propertyFilePath, e");
			}
		} else {
			log.warn("No mail configuration defined at " + propertyFilePath);
		}
		return null;
	}
}
