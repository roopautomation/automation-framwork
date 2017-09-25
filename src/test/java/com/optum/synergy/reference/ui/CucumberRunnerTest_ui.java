package com.optum.synergy.reference.ui;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.optum.synergy.common.ui.controller.WebController;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	    plugin = { "pretty", "html:target/test-report","com.cucumber.listener.ExtentCucumberFormatter"}, 
		features = { "src/main/resources/ui/features" },
		tags = { "@sprint3" },
		snippets = SnippetType.CAMELCASE
)
public class CucumberRunnerTest_ui {
    @AfterClass
    public static void tearDown()
    {
    	WebController.closebrowser();;
    }
    @BeforeClass
    public static void setup() {
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
        ExtentCucumberFormatter.initiateExtentCucumberFormatter();

        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/main/resources/extent-config.xml"));

        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v52.3");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.4.0");

      
    } 
    
    
}
