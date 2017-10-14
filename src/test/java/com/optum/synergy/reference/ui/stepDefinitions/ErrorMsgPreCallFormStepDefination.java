package com.optum.synergy.reference.ui.stepDefinitions;

import com.optum.synergy.reference.ui.pageobjects.AuthorRecommendedForYouPageObject;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ErrorMsgPreCallFormStepDefination {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	AuthorRecommendedForYouPageObject recomendForyou = new AuthorRecommendedForYouPageObject(helper);
	
	@When("^User click edit phone link and enter invalid phone as \"([^\"]*)\"$")
	public void user_click_edit_phone_link_and_enter_invalid_phone_as(String phone) throws Throwable {
	    
	}

	@Then("^Error message displayed$")
	public void error_message_displayed() throws Throwable {
	    
	}

	@When("^User click on edit Email$")
	public void user_click_on_edit_Email() throws Throwable {
	    
	}

	@Then("^Email and confirm Email field displayed$")
	public void email_and_confirm_Email_field_displayed() throws Throwable {
	    
	}

	@When("^User enter invalid Email as \"([^\"]*)\" and click next button$")
	public void user_enter_invalid_Email_as_and_click_next_button(String email) throws Throwable {
	   
	}

	@When("^User enter email as \"([^\"]*)\"and confirm as \"([^\"]*)\"$")
	public void user_enter_email_as_and_confirm_as(String email, String confirmEmail) throws Throwable {
	   
	}

	@When("^User click next button$")
	public void user_click_next_button() throws Throwable {
	    
	}

	@Then("^Error message displayed with confirm field$")
	public void error_message_displayed_with_confirm_field() throws Throwable {
	    
	}

}
