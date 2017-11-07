package com.optum.synergy.reference.ui.stepDefinitions;

import org.jsoup.helper.DataUtil;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.optum.synergy.reference.ui.DataUtility;
import com.optum.synergy.reference.ui.pageobjects.AuthorRecommendedForYouPageObject;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrecallFormIntegrationStepDefination {
	
	public static String expectedPhoneType;
	public static String expectedPreferredTime;
	public static String expectedAns1Text;
	
	private LandingFooterPageObject page;
	private AuthorRecommendedForYouPageObject preCallForm;
	
	public PrecallFormIntegrationStepDefination(CommonStepDefinition commonSteps){
	page = new LandingFooterPageObject(commonSteps.getCommonHelper());
	preCallForm = new AuthorRecommendedForYouPageObject(commonSteps.getCommonHelper());
	
	
	}
	@When("^The user has clicked the CTA to Request A Call$")
	public void the_user_has_clicked_the_CTA_to_Request_A_Call() throws Throwable {
		preCallForm.clickRequestCallButton();
	}

	@When("^The user selects the phone number types as (.+)$")
	public void the_user_selects_the_phone_number_types_as(String phoneType) throws Throwable {
		expectedPhoneType=phoneType;
		preCallForm.selectPhoneTypeAS(phoneType);
		
		
		
		
	}
//	@When("^Member enter new phone number like \"([^\"]*)\"$")
//        public void member_enter_new_phone_number_like(String PhNumber) throws Throwable {
//		preCallForm.typePhoneNumber(PhNumber);
//		Thread.sleep(2000);
//	}
	@When("^User enter phone number a(\\d+)$")
	public void user_enter_phone_number_as(String Number) throws Throwable {
		Thread.sleep(2000);
		preCallForm.typePhoneNumber(Number);
		Thread.sleep(2000);
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
		expectedPreferredTime=time;
		preCallForm.clickPreferredTimeCheckBoxAs(time);
	}

	@Given("^The user clicks the Next button$")
	public void the_user_clicks_the_Next_button() throws Throwable {
		preCallForm.clickOnNextButtonOfPreferTimePage();
	}

	@Then("^The API should be triggered to save call back data$")
	public void the_API_should_be_triggered_to_save_call_back_data() throws Throwable {
		
		//DataUtility.connectDatabase("select * from phs_user");
		//DataUtility.getMemberName(222222222);
	   
	}

	@Given("^The user has completed  Select Times and is on question page$")
	public void the_member_has_completed_Select_Times_and_is_on_questionpage() throws Throwable {
		Assert.assertTrue("Question section not displayed",preCallForm.questionSectionDisplayed());
	}
	@When("^The user enters data in first answer fields as \"([^\"]*)\"$")
	public void the_user_enters_data_in_first_answer_fields_as(String answerText) throws Throwable {
		expectedAns1Text=answerText;
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
	
	@When("^user click on show More link$")
	public void user_click_on_show_More_link() throws Throwable {
		preCallForm.clickOnShowMoreLink();
	}

	@Then("^Detail page displayed$")
	public void detail_page_displayed() throws Throwable {
		Assert.assertTrue("Detail page not displayed", preCallForm.detailPageDisplayed());
	}

	@Then("^User verify Phone Type$")
	public void user_verify_Phone_Type() throws Throwable {
		//Assert.assertEquals("phone number type not matching as saved",expectedPhoneType,preCallForm.savedPhoneType());
		System.out.println("Expected==>" + expectedPhoneType);
		System.out.println("Actual==>" +preCallForm.savedPhoneType());
		Assert.assertTrue("phone number type not matching as saved",preCallForm.savedPhoneType().contains(expectedPhoneType));
	}

	@Then("^User verify Phone Number$")
	public void user_verify_Phone_Number() throws Throwable {
		//ErrorMsgPreCallFormStepDefination epcs = new ErrorMsgPreCallFormStepDefination();
		//System.out.println("Expected >>>"+epcs.PhoneNumber);
		System.out.println("New Phone"+ErrorMsgPreCallFormStepDefination.expectedPhoneNumber);
		System.out.println(" Actual  >>>"+preCallForm.savedPhoneNumber());
		//Assert.assertEquals("Phone numbers are not matching ",ErrorMsgPreCallFormStepDefination.expectedPhoneNumber,preCallForm.savedPhoneNumber());
		
		
		
	}
	@Then("^edit link for phone and phoneType displayed$")
	public void edit_link_for_phone_and_phoneType_displayed() throws Throwable {
	   Assert.assertTrue("Edit link for phone and phoneType not displayed", preCallForm.phoneEditLinkDisplayed()); 
	}

	@Then("^User verify Preferred time selected$")
	public void user_verify_Preferred_time_selected() throws Throwable {
		Thread.sleep(2000);
		Assert.assertEquals("Preferred  selected time are not matching ",expectedPreferredTime,preCallForm.preferredSelectedTime());
	}

	@Then("^User verify Answer text$")
	public void user_verify_Answer_text() throws Throwable {
		System.out.println("expected text>>>"+expectedAns1Text);
		System.out.println("Actual text>>>"+preCallForm.savedAnswerOneText());
	Assert.assertEquals(expectedAns1Text,preCallForm.savedAnswerOneText().trim());
	}
	
}
