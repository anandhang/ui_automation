package com.ant.step_definitions;

import com.ant.constants.Constants;
import com.ant.utilities.CommonUtils;

import com.ant.webdriver_manager.DriverManager;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Common_Step_Definition {

    private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definition.class);

    @Before
    public void beforeScenario(){
        LOGGER.info("Execution Started");
        try {
            LOGGER.info("Instantiation the Common Utilities");
            LOGGER.info("Load config properties file");
            new CommonUtils().loadProperties();
            if(DriverManager.getDriver()==null){
                DriverManager.launchBrowser();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
