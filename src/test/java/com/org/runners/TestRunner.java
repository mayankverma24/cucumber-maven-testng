package com.org.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
/*
 * @CucumberOptions(tags = "@mayank", features = "src/test/java/features/", glue
 * = "stepDefinitions", plugin = { "pretty",
 * "json:target/cucumber-reports/Cucumber.json",
 * "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"
 * }, monochrome = false)
 */
@CucumberOptions(tags = "@mayank", features = "src/test/java/features/", glue = "stepDefinitions", monochrome = false)
/*
 * public class TestRunner extends AbstractTestNGCucumberTests {
 * 
 * }
 */
public class TestRunner extends AbstractTestNGCucumberTests {

}