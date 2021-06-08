package Utility;

import java.io.*;
import java.util.Properties;


public class ReadProperties {
    private final String propertyFilePath = "src/config.properties";
    FileInputStream file;
    private Properties prop;

    {
        try {
            file = new FileInputStream("src/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public ReadProperties() {
        prop = new Properties();
        try {
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getUrl(String url) {
        if (url != null) {
            return prop.getProperty(url);
        } else throw new RuntimeException("url not specified in the Config.properties file.");
    }

    public String getBrowser(String browser) {
        if (browser != null) {
            return prop.getProperty(browser);
        } else throw new RuntimeException("browser not specified in config.properties file.");
    }

    public String getBrowserDriverPath(String driverPath) {
        if (driverPath != null) {
            return prop.getProperty(driverPath);
        } else throw new RuntimeException("driverPath not specified in the Config.properties file.");
    }
    
    public String getUserName(String userName) {
        if (userName != null) {
            return prop.getProperty(userName);
        } else throw new RuntimeException("driverPath not specified in the Config.properties file.");
    }
        public String getPassword(String password) {
            if (password != null) {
                return prop.getProperty(password);
            } else throw new RuntimeException("driverPath not specified in the Config.properties file.");
        
    }
    
    
}