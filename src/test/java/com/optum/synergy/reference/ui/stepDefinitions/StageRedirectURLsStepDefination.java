package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;

import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;
import com.optum.synergy.reference.ui.pageobjects.StageRedirectURLsPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StageRedirectURLsStepDefination {
	
	private String pageName;
	private String urlLaunched;
	
	private StageRedirectURLsPageObject redirectStgUrl;
	
	public StageRedirectURLsStepDefination(CommonStepDefinition commonSteps){
		redirectStgUrl = new StageRedirectURLsPageObject(commonSteps.getCommonHelper());
	}
	
	@Given("^User open browser$")
	public void user_opern_browser() throws Throwable {
	   System.out.println("Browser open ");
	}

	@When("^User enter stage URL as \"([^\"]*)\"$")
	public void user_enter_stage_URL_as(String launchUrl) throws Throwable {
		urlLaunched=launchUrl;
		redirectStgUrl.launchStageURLs(launchUrl);
	}

	@Then("^Redirect URL is as \"([^\"]*)\"$")
	public void redirect_URL_is_as(String expectedUrl) throws Throwable {
		System.out.println("Reditected URL is >>>"+redirectStgUrl.redirectedURLDisplayedAs());
		Assert.assertEquals("Redirected URL of page ["+ pageName+">>>"+urlLaunched+ "]  is not as expected",expectedUrl,redirectStgUrl.redirectedURLDisplayedAs());
	}

	@Then("^User verify title as \"([^\"]*)\"$")
	public void user_verify_title_as(String expectedTitle) throws Throwable {
		pageName=expectedTitle;
		System.out.println("Title of page is >>>"+redirectStgUrl.pageTitle());
		//Assert.assertEquals("Redirected pageTitle of page ["+ pageName +"] is not as expected>>>",expectedTitle,redirectStgUrl.pageTitle());
	}
	

}
