package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.optum.synergy.reference.ui.pageobjects.AuthorRecommendedForYouPageObject;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;
import com.optum.synergy.reference.ui.pageobjects.PageObjectBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ErrorMsgPreCallFormStepDefination  {
	
	public static String expectedPhoneNumber;
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	AuthorRecommendedForYouPageObject recomendForyou = new AuthorRecommendedForYouPageObject(helper);
	
	@When("^User click edit phone link$")
	public void user_click_edit_phone_link() throws Throwable {
		recomendForyou.clickOnEditPhoneLink();
		
	}
	@When("^User enter phone number as (.+)$")
	public void user_enter_phone_number_as(String phone) throws Throwable {
		/*recomendForyou.clearPhoneField();
		Thread.sleep(2000);*/
		expectedPhoneNumber=phone;
		
		
		recomendForyou.typePhoneNumber(phone);
		Thread.sleep(2000);
	}
	@Then("^Phone error message displayed$")
	public void phone_error_message_displayed() throws Throwable {
		Assert.assertTrue("Phone error message not displayed",recomendForyou.phoneErrorMsgDisplayed());
	}

	@Then("^Email error message displayed$")
	public void email_error_message_displayed() throws Throwable {
		Assert.assertTrue("Email error message not displayed",recomendForyou.emailErrorMsgDisplayed());
		System.out.println("ERROR MESSAGE DISPLAYES WHEN INVALID EMAIL ENTERED AS >>"+recomendForyou.errorTextOFEmail());
	}

	@When("^User click on edit Email$")
	public void user_click_on_edit_Email() throws Throwable {
		recomendForyou.clickOnEditEmailLink();
	}

	@Then("^Email and confirm Email field displayed$")
	public void email_and_confirm_Email_field_displayed() throws Throwable {
		Assert.assertTrue("Email field not displayed",recomendForyou.emailAddressFieldDisplayed());
		Assert.assertTrue("Phone field not displayed",recomendForyou.confirmEmailAddressFieldDisplayed());
	}

	@When("^User enter invalid Email as \"([^\"]*)\"$")
	public void user_enter_invalid_Email_as(String email) throws Throwable {
		recomendForyou.typeEmailAddress(email);
		
	}
	@When("^User enter Email as \"([^\"]*)\"$")
	public void user_enter_Email_as(String email) throws Throwable {
		recomendForyou.typeEmailAddress(email);
		
	}
	@When("^User enter invalid confirmEmail as \"([^\"]*)\"$")
	public void user_enter_invalid_confirmEmail_as( String confirmEmail) throws Throwable {
		recomendForyou.typeConfirmEmailAddress(confirmEmail);
	}
	@When("^User enter confirmEmail as \"([^\"]*)\"$")
	public void user_enter_confirmEmail_as( String confirmEmail) throws Throwable {
		recomendForyou.typeConfirmEmailAddress(confirmEmail);
	}

	@When("^User click next button on contact page$")
	public void user_click_next_button_on_contact_page() throws Throwable {
		recomendForyou.clickOnContactInfoNextBtn();
	}

	@Then("^ConfirmEmail error message displayed$")
	public void confirmEmail_error_message_displayed() throws Throwable {
		Assert.assertTrue("Confirm email error message not displayed",recomendForyou.confirmEmailErrorMsgDisplayed());
	}
	@Then("^Email not matching error message displayed$")
	public void email_not_matching_error_message_displayed()throws Throwable{
		Assert.assertTrue("Email not maching error message not displayed",recomendForyou.emailNotMatchingErrorMsgDisplayed());
	}
	@Then("^Green check mark displayed$")
    public void green_check_mark_displayed()throws Throwable{
		Assert.assertTrue("Green check mark not displayed",recomendForyou.emailGreenCheckMarkDisplayed());
	}
	
	
}
