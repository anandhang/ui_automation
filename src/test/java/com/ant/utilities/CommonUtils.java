package com.ant.utilities;

import com.ant.constants.Constants;

import java.io.*;
import java.util.Properties;

public class CommonUtils {
    public void loadProperties(){
        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream("/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Constants.APP_URL = properties.getProperty("APP_URL");
        Constants.BROWSER = properties.getProperty("BROWSER");
        Constants.USER_NAME = properties.getProperty("UserName");
        Constants.PASSWORD = properties.getProperty("Password");
        Constants.CHROME_DRIVER_LOCATION = properties.getProperty("CHROME_DRIVER_LOCATION");
        Constants.FIREFOX_DRIVER_LOCATION = properties.getProperty("FIREFOX_DRIVER_LOCATION");
        Constants.IE_DRIVER_LOCATION = properties.getProperty("IE_DRIVER_LOCATION");
    }
}
