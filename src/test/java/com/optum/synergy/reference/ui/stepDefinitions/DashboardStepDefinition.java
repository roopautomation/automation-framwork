package com.optum.synergy.reference.ui.stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.DashboardPageObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDefinition {
    
	CommonHelper helper = new CommonHelper();
	DashboardPageObject Page = new DashboardPageObject(helper);
	
	@Given("^Dashboard opens$")
	public void landingPageDisplays() throws Throwable {
		Page.openPage();
	}
	
	@Then ("^user sees a banner$")
	public void userSeesBanner() throws Throwable {
		Assert.assertTrue(Page.verifyBannerDisplays());
	}
	
	@And ("^user sees a component overlaying the banner image that contains text")
	public void usersSeesBannerText() throws Throwable {
		
	}


	
	
	
}
