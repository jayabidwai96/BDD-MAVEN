package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/main/java/com/features",
		glue="com.stepdefs",
		plugin={"html:target/cucumber/report.html"},
		dryRun= true,// to compile feature file
		monochrome = true, //used for readable output
		tags= "@JBK"  //tags used to run specific scenario
		
		)

public class TestRunner {

}
