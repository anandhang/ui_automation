package com.ant.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="com.ant.step_definitions",
        dryRun = false,
        monochrome = true,
        plugin={"rerun:target/failed_scenarios.txt"}
)
public class TestRunner {

}
