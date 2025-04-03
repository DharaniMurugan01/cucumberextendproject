package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"pretty",
        "html:target/cucumber-reports/Cucumber.html",
        "json:target/cucum ber-reports/Cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
     features= "src//test//resources//Features//Loginpagepage.feature",
     glue="com.definitions")
public class Runnertestng extends AbstractTestNGCucumberTests{
  
}
