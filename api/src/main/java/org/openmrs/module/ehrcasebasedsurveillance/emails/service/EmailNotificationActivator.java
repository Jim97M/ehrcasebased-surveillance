package org.openmrs.module.ehrcasebasedsurveillance.emails.service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.ModuleActivator;

public class EmailNotificationActivator implements ModuleActivator {

    protected Log log = LogFactory.getLog(getClass());
    public void willRefreshContext(){
        log.info("Refreshing Email Notification Module");
    }

    public void contextRefreshed(){

    }

    public void willStart(){

    }

    public void started(){

    }

    public void willStop(){

    }

    public void stopped(){

    }
}
