package com.optum.synergy.reference.ui;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	    plugin = { "pretty", "html:target/test-report" }, 
		features = { "src/main/resources/ui/features" },
		tags = { "@TryIt" },
		snippets = SnippetType.CAMELCASE
)
public class CucumberRunnerTest_ui {
    @AfterClass
    public static void tearDown(){

    }
}
