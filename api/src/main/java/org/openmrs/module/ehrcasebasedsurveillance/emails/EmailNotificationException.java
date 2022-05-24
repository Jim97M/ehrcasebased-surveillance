package org.openmrs.module.ehrcasebasedsurveillance.emails;

public class EmailNotificationException extends Exception{
    public EmailNotificationException(String message, Throwable cause){
        super(message, cause);
    }
}
