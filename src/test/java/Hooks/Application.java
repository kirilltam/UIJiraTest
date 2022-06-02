package Hooks;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {
        public static final String CONFIGURATION_FILE = "/application.properties";
        public static final Properties properties;


    static {
            properties = new Properties();
            try (InputStream inputStream = Application.class.getResourceAsStream(CONFIGURATION_FILE)) {
                properties.load(inputStream);

            } catch (IOException e) {
                throw new RuntimeException("Failed to read file:" + CONFIGURATION_FILE, e);
            }
        }

        public static String getConfigurationValue(String key) {
            return ((System.getProperty(key) == null) ? properties.getProperty(key) : System.getProperty(key));

        }
    }

