package com.tmos.api.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@CucumberOptions(monochrome = true, plugin = { "html:target/cucumber-html-report",
		"json:target/cucumber.json" }, 
features = "src/main/java/API-Features/Login.feature", 
glue = "com.tmos.api.steps/LoginSteps.java")*/


 @CucumberOptions(monochrome = true, plugin = {
 "html:target/cucumber-html-report", "json:target/cucumber.json" }, features =
 "src/main/java/API-Features/MachineMasterdata", glue = "com.tmos.api.steps", tags={"@RegressionDemo"})


public class APITestRunner extends AbstractTestNGCucumberTests {

}
