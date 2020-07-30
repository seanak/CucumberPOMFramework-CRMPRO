package com.qa.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
		features = "C:/Users/hp-pc/workspace/cucumberBDDPOM/src/main/java/com/qa/features/ClassicCRM.feature",
		glue={"com/qa/stepDefinitions"},
		plugin={"pretty","html:test-output", "junit:junit_xml/cucumber.xml", "json:json_output/cucumber.json"},
		monochrome= true,
		strict= true,
		dryRun= true
		)
public class TestRunner {

}
