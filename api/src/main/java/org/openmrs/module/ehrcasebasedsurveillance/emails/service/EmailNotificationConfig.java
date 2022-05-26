package org.openmrs.module.ehrcasebasedsurveillance.emails.service;

import org.openmrs.util.OpenmrsUtil;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Properties;

@Component("emailNotificationConfig")
public class EmailNotificationConfig {
    private Properties properties;

    private void loadProperties() throws IOException{
        String resourceName = "openmrs-runtime.properties";

        final File file = new File(OpenmrsUtil.getApplicationDataDirectory(), resourceName);
        final InputStream inputStream;
        if(file.exists()){
            inputStream = new FileInputStream(file);
        }else{
            inputStream = getClass().getClassLoader().getResourceAsStream(resourceName);
            if (inputStream == null)
                throw new IOException();
        }

        properties.load(inputStream);
    }
    public Properties getProperties() throws IOException {
        if (properties == null || properties.size() == 0) {
            properties = new Properties();
            loadProperties();
        }
        return properties;
    }
}
