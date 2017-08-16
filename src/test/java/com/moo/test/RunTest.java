package com.moo.test;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"},
        glue = {"com.moo.steps"},
        tags = {"@SearchProducts"})
public class RunTest {

}


