package com.optum.synergy.reference.ui.stepDefinitions;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackToTopButtonKeyAccessibleStepDefinition {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	
	@Given("^User is on PHS page\\.$")
	public void user_is_on_PHS_page() throws Throwable {
		page.openPage();
	
	}

	@When("^User navigate to footer Component\\.$")
	public void user_navigate_to_footer_Component() throws Throwable {
		page.scroolToFooterSection();
		//ExtentCucumberFormatter.setTestRunnerOutput("INFO: Footer section displayed");
	}

	@When("^User access Back to top button with tab key\\.$")
	public void user_access_Back_to_top_button_with_tab_key() throws Throwable {
		page.tabOnBackToTopButton();
		//ExtentCucumberFormatter.setTestRunnerOutput("INFO: Button accessed with TAB key");
	}

	@When("^User press Enter key from keyboard\\.$")
	public void user_press_Enter_key_from_keyboard() throws Throwable {
		page.pressEnterKey();  
	}

	@Then("^User is taken back to top of page\\.$")
	public void user_is_taken_back_to_top_of_page() throws Throwable {
		//ExtentCucumberFormatter.setTestRunnerOutput("INFO: Top page logo displayed"); 
	}
	@When("^User again navigate to footer Component\\.$")
	public void user_again_navigate_to_footer_Component() throws Throwable {
		page.scroolToFooterSection();
		//ExtentCucumberFormatter.setTestRunnerOutput("INFO: Again Footer section displayed");
	}

	@When("^User click on back to top button$")
	public void user_click_on_back_to_top_button() throws Throwable {
		page.clickOnTopButton();
		//ExtentCucumberFormatter.setTestRunnerOutput("INFO: Top button clicked ");
	}


}
