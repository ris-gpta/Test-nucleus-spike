package org.testnucleus.configuration;

import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    static private Properties properties;

    static private void resolveProperties() {
        java.io.InputStream is = PropertiesManager.class.getResourceAsStream("project.properties");
        PropertiesManager.properties = new java.util.Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static public String get(String propertyName)  {
        if (PropertiesManager.properties == null) {
            PropertiesManager.resolveProperties();
        }
        return PropertiesManager.properties.getProperty(propertyName);
    }
}
