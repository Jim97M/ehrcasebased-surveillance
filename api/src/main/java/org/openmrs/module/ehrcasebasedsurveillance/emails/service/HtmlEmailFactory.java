package org.openmrs.module.ehrcasebasedsurveillance.emails.service;

import org.apache.commons.mail.HtmlEmail;

public class HtmlEmailFactory {
    public static HtmlEmail getHtmlEmail(){
        return new HtmlEmail();
    }
}
