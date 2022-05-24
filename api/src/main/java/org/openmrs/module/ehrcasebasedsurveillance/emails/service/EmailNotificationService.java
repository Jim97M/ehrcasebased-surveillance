package org.openmrs.module.ehrcasebasedsurveillance.emails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("emailnotificationservice")
public class EmailNotificationService {
    @Autowired
    EmailNotificationConfig emailNotificationConfig;

    public EmailNotificationService(){}

}
