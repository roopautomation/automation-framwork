package com.optum.synergy.reference.ui.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.PrivacyPageObject;
import com.optum.synergy.reference.ui.pageobjects.TermsPageObject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepDefinition {

	public CommonHelper helper;
	public PrivacyPageObject privacyPage; 
	public TermsPageObject termsPage;

	public CommonStepDefinition() throws UnsupportedEncodingException {
		this.helper = new CommonHelper();
	}

	public CommonHelper getCommonHelper() {
		return helper;
	}

	/**
	 * ------- New Steps
	 * ------------------------------------------------------------------------
	 * 
	 * @throws IOException
	 */
	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
//			// Take a screenshot...
//			final byte[] screenshot = ((TakesScreenshot) helper.driver).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(screenshot, "image/png"); // ... and embed it in the
//														// report.
//
//			File scrFile = ((TakesScreenshot) helper.driver).getScreenshotAs(OutputType.FILE);
//			// Now you can do whatever you need to do with it, for example copy
//			// somewhere
//
//			FileUtils.copyFile(scrFile, new File("target\\screenshots\\" + scenario.getId() + ".png"));

		}
	}

	/**
	 * --------------------------------------- Givens
	 * -----------------------------------------
	 **/
	@Given("^User not logged in$")
	public void userNotLoggedIn() throws Throwable {
		// To be coded once login solutions is determined
	}

	@Given("^User logged in$")
	public void userLoggedIn() throws Throwable {
		// To be coded once login solutions is implemented		
	}
	
	/**
	 * --------------------------------------- Whens
	 * -----------------------------------------
	 **/	
	
	
	/**
	 * --------------------------------------- Thens
	 * -----------------------------------------
	 **/	
	@Then("^Privacy Policy page loads")
	public void privacyPolicyPageLoads() throws Throwable {
		privacyPage.verifyIfPageLoaded();
	}
	
	@Then("^Terms of Use page loads")
	public void termsOfUsePageLoads() throws Throwable {
		termsPage.verifyIfPageLoaded();
	}
}
