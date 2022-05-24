package org.openmrs.module.ehrcasebasedsurveillance.emails;

public interface MailSender {
	
	void send(String subject, String body, String[] to, String[] cc, String[] bcc);
}
