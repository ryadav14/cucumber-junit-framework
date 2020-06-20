package com.api.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/main/java/com/api/cucumber/featurefile/CheckDay.feature"},
        glue = {"com.api.cucumber.stepdefinition","com.api.cucumber.hooks"},
        monochrome = true,

     plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/reports/cucumber-reports.html","json:target/cucumber.json","html:target/reports/cucumber.html"}


)
public class PostRunner {

}
