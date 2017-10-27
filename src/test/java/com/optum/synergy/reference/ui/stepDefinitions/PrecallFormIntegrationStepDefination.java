package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;

import com.optum.synergy.reference.ui.pageobjects.AuthorRecommendedForYouPageObject;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.*;
public class PrecallFormIntegrationStepDefination {
	
	private LandingFooterPageObject page;
	private AuthorRecommendedForYouPageObject preCallForm;
	
	public PrecallFormIntegrationStepDefination(CommonStepDefinition commonSteps){
	//CommonHelper helper = new CommonHelper();
	page = new LandingFooterPageObject(commonSteps.getCommonHelper());
	preCallForm = new AuthorRecommendedForYouPageObject(commonSteps.getCommonHelper());
	}
	@When("^The user has clicked the CTA to Request A Call$")
	public void the_user_has_clicked_the_CTA_to_Request_A_Call() throws Throwable {
		preCallForm.clickRequestCallButton();
	}

	@When("^The user selects the phone number types as \"([^\"]*)\"$")
	public void the_user_selects_the_phone_number_types_as(String phoneType) throws Throwable {
		preCallForm.selectPhoneTypeAS(phoneType);
	}
	@When("^Member enter new phone number like \"([^\"]*)\"$")
	public void member_enter_new_phone_number_like(String PhNumber) throws Throwable {
		preCallForm.typePhoneNumber(PhNumber);
		
	}


	@Given("^Send email option is default checked$")
	public void send_email_option_is_default_checked() throws Throwable {
		Assert.assertTrue("Send Mail checkbox is not default selected",preCallForm.sendEmailCheckBoxIsDafaultSelected());
	}

	@Given("^Member email is displayed$")
	public void member_email_is_displayed() throws Throwable {
		Assert.assertTrue("Member email not displayed",preCallForm.emailDisplayed());
	}

	@Given("^User complete contact info and is on preferred time page$")
	public void user_complete_contact_info_and_is_on_preferred_time_page() throws Throwable {
		Assert.assertTrue("Preferred time selection option not displayed",preCallForm.preferedTimePageDisplayed());
	}

	@Given("^The user selects their preferred call back time as \"([^\"]*)\"$")
	public void the_member_selects_their_preferred_call_back_time(String time) throws Throwable {
		preCallForm.clickPreferredTimeCheckBoxAs(time);
	}

	@Given("^The user clicks the Next button$")
	public void the_user_clicks_the_Next_button() throws Throwable {
		preCallForm.clickOnNextButtonOfPreferTimePage();
	}

	@Then("^The API should be triggered to save call back data$")
	public void the_API_should_be_triggered_to_save_call_back_data() throws Throwable {
	   
	}

	@Given("^The user has completed  Select Times and is on question page$")
	public void the_member_has_completed_Select_Times_and_is_on_questionpage() throws Throwable {
		Assert.assertTrue("Question section not displayed",preCallForm.questionSectionDisplayed());
	}
	@When("^The user enters data in first answer fields as \"([^\"]*)\"$")
	public void the_user_enters_data_in_first_answer_fields_as(String answerText) throws Throwable {
		preCallForm.enterTextInFirstTextBox(answerText);
		
	}
	@When("^The user enters data in second answer fields as \"([^\"]*)\"$")
	public void the_user_enters_data_in_second_answer_fields_as(String answerText) throws Throwable {
		preCallForm.enterTextInSecondTextBox(answerText);
	}
	@When("^The user enters data in third answer fields as \"([^\"]*)\"$")
	public void the_user_enters_data_in_third_answer_fields_as(String answerText) throws Throwable {
		preCallForm.enterTextInThirdTextBox(answerText);
	}

	@When("^The member clicks the Finish button$")
	public void the_user_clicks_the_Finish_button() throws Throwable {
		preCallForm.clickOnFinishButton();
	}

	@Then("^The API should be triggered to save questionnaire data$")
	public void the_API_should_be_triggered_to_save_questionnaire_data() throws Throwable {
	    
	}
}
