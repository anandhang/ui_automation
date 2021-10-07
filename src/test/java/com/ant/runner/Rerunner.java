package com.ant.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed_scenarios.txt",
        glue ="com.ant.step_definitions",
        dryRun = false,
        monochrome = true
)
public class Rerunner {

}
