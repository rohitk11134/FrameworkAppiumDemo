package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features/LandingScreen.feature",
		"src/test/resources/features/LoginScreen.feature" }, plugin = { "pretty", "json:target/cucumber.json",
				"html:target/site/cucumber-pretty" }, monochrome = false, dryRun = false, glue = { "stepDefinitions",
						"hooks" }, tags = { "@sanity, @regression"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
