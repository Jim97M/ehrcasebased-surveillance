package org.openmrs.module.ehrcasebasedsurveillance.emails.service;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.ImageHtmlEmail;
import org.openmrs.module.ehrcasebasedsurveillance.emails.EmailNotificationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.Properties;

@Service("emailnotificationservice")
public class EmailNotificationService {
    @Autowired
    EmailNotificationConfig emailNotificationConfig;

    public EmailNotificationService(){}

    public EmailNotificationService (EmailNotificationConfig emailNotificationConfig){
        this.emailNotificationConfig = emailNotificationConfig;
    }

    public void send(String body, String subject, String to, String [] cc, String [] bcc) throws EmailNotificationException {
        try{
            Properties properties = emailNotificationConfig.getProperties();
            String htmlEmailTemplate = body;
            ImageHtmlEmail email = new ImageHtmlEmail();
              email.setHostName(properties.getProperty("smtp.host"));

            email.addTo(to);
            if(cc != null){
                email.addCc(cc);
            }

            if(bcc != null){
                email.addBcc(bcc);
            }

            email.setFrom(
                    properties.getProperty("smtp.from.email.address"),
                    properties.getProperty("smtp.from.name")
            );

            email.setSubject(subject);
            email.setHtmlMsg(htmlEmailTemplate);
            email.setAuthentication(
                    properties.getProperty("smtp.username"),
                    properties.getProperty("smtp.password")
            );

            email.setSmtpPort(Integer.parseInt(properties.getProperty("smtp.port")));
            email.send();
        }catch (IOException e){
            throw new EmailNotificationException("Unable To Load Configurations", e);
        }catch (EmailException e){

            throw new EmailNotificationException("SMTP credentials are invalid", e);
        }
    }
}
