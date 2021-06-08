package Runner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Runner class to run the cucumber test
 * @author TMOS
 * @version 1.0
 */

@CucumberOptions(monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"},
        features="src/test/java/Features", glue="Steps")

//To run Scenarios based on tags
/*@CucumberOptions(monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"},
        features="src/test/java/Features", glue="Steps", tags={ "@Regression or @Smoke"})*/

public class TestRunner extends AbstractTestNGCucumberTests {
}

