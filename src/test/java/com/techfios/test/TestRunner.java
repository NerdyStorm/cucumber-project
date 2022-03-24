package com.techfios.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    tags = {"@BlueScenario, @WhiteScenario"},
    features = {"src/main/java/com/techfios/features/"},
    glue = {"com.techfios.steps"},
    plugin = {
        "pretty"
    }

)


public class TestRunner {
    
}


