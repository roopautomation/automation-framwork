package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;

import com.optum.synergy.reference.ui.pageobjects.AuthorRecommendedForYouPageObject;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.*;
public class AuthorRecommendedForYouStepDefination {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	AuthorRecommendedForYouPageObject recomendForyou = new AuthorRecommendedForYouPageObject(helper);
	
	@Given("^User is on recommended page$")
	public void user_is_on_recommended_page()throws Throwable{
		recomendForyou.launchRecommendedPage();
	}
	
	@Then("^Recommended for you page title verified$")
	public void recommended_for_you_page_title_verified() throws Throwable {
		recomendForyou.recommendedPageTitleVerify("Recommended for you"); 
	}

	@Then("^Tabs like Header,ProgramName, UserName, Tracker CTC and Request call button display$")
	public void tabs_like_Header_ProgramName_UserName_Tracker_CTC_and_Request_call_button_display() throws Throwable {
		recomendForyou.pageHeaderDisplayed();
		
		
		recomendForyou.ctcFuctionFieldDisplayed();
		recomendForyou.requestCallButtonDisplayed();
	}

	@When("^User click on Request call button$")
	public void user_click_on_Request_call_button() throws Throwable {
		recomendForyou.clickRequestCallButton();
		Thread.sleep(2000);
	}

	@Then("^Preferred Time section displayed$")
	public void preferred_Time_section_displayed() throws Throwable {
		recomendForyou.preferedTimePageDisplayed();
	}

	@Then("^First circle of tracker is completed$")
	public void first_circle_of_tracker_is_completed() throws Throwable {
		recomendForyou.firstTrackerCircalComplete();
	}

	@Given("^User is on Preferred time page$")
	public void user_is_on_Preferred_time_page() throws Throwable {
		recomendForyou.preferedTimePageDisplayed();
	}

	@Given("^Landing page tab Header,ProgramName, UserName, Tracker display$")
	public void landing_page_tab_Header_ProgramName_UserName_Tracker_display() throws Throwable {
		recomendForyou.pageHeaderDisplayed();
		recomendForyou.trackerBarDispalyed();
	}

	@Given("^CallBackDetail,displayed and AnyTime is default selected$")
	public void callbackdetail_displayed_and_AnyTime_is_default_selected() throws Throwable {
		recomendForyou.ctcFuctionFieldDisplayed();
		recomendForyou.anyTimeCheckBoxDefaultSelected();
	}

	@When("^User select different time$")
	public void user_select_different_time() throws Throwable {
		recomendForyou.clickOnEveningTimeCheckbox();
	}

	@Then("^AnyTime option is unchecked$")
	public void anytime_option_is_unchecked() throws Throwable {
		recomendForyou.anyTimeCheckBoxIsNotSelected(); 
	}

	@When("^User select all three times and uncheck any one$")
	public void user_select_all_three_times_and_uncheck_any_one() throws Throwable {
		recomendForyou.clickOnMorningTimeCheckbox();
		recomendForyou.clickOnEveningTimeCheckbox();
		recomendForyou.clickOnAfternoonCheckbox();
		recomendForyou.clickOnMorningTimeCheckbox();
	}

	@Then("^Remaining stay selected$")
	public void remaining_stay_selected() throws Throwable {
		recomendForyou.eveningTimeCheckboxIsNotChecked();
		recomendForyou.afternoonTimeCheckboxIsNotChecked();
	}

	@When("^User click CTA button$")
	public void user_click_CTA_button() throws Throwable {
		recomendForyou.clickOnNextButtonOfPreferTimePage();
		Thread.sleep(2000);
	}

	@Then("^The Tracker updates to show progression$")
	public void the_Tracker_updates_to_show_progression() throws Throwable {
		recomendForyou.secondTrackerCircleCompleted();
	}

	@Then("^Contact info section displayed$")
	public void contact_info_section_displayed() throws Throwable {
		Assert.assertTrue("Contact Info Page not displayed ",recomendForyou.contactInfoSectionDisplayed());
	}
	@Given("^User is on Contact info section$")
	public void user_is_on_Contact_info_section() throws Throwable {
	    
	}

	@Given("^User Email and phone Display$")
	public void user_Email_and_phone_Display() throws Throwable {
		recomendForyou.emailDisplayed();
		recomendForyou.PhoneDisplayed(); 
		
	}
	@When("^User click on Edit button$")
	public void user_click_on_Edit_button() throws Throwable {
		recomendForyou.clickOnEditLink();
	}

	@Then("^Phone field and dropdown field displayed$")
	public void phone_field_and_dropdown_field_displayed() throws Throwable {
		Assert.assertTrue("Phone Field not displayed ",recomendForyou.phoneFieldDisplayed());
		Assert.assertTrue("Phone type Dropdown not displayed ",recomendForyou.phoneTypeDropdownFieldDisplayed());
	}

	@Then("^default phone type displayed$")
	public void default_phone_type_displayed() throws Throwable {
	//Assert.	assertEquals(recomendForyou.defaultSelectedOptionInPhoneDD(),anyOf(is("Home"),is("Cell"),is("Work"),is("TTY"))); 
	
	}

	@When("^User edit Phone and phone type from dropdown$")
	public void user_edit_Phone_and_phone_type_from_dropdown() throws Throwable {
	    
	}

	@When("^User click on Next button$")
	public void user_click_on_Next_button() throws Throwable {
		recomendForyou.clickOnContactInfoNextBtn();
	}

	@Then("^Question section tab display$")
	public void question_section_tab_display() throws Throwable {
		recomendForyou.questionSectionDisplayed();
	}

	@Then("^Tracker status updated$")
	public void tracker_status_updated(String arg1) throws Throwable {
		//recomendForyou.thirdTrackerCircalComplete();
	}

	
	
	

}
