package com.optum.synergy.reference.ui.stepDefinitions;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.FAQ_UpdatesPageObject;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

      
public class FAQ_UpdatesStepDefination {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	FAQ_UpdatesPageObject faqPage = new FAQ_UpdatesPageObject(helper);
	
	String defaultColor;
	String aterExpandColor;
	
	@When("^User scroll to footer$")
	public void user_scroll_to_footer() throws Throwable {
		faqPage.scroolToFooterSection();
	}

	@When("^User click on FAQ link$")
	public void user_click_on_FAQ_link() throws Throwable {
		faqPage.clickOnFAQLink();
	}
	@Then("^Default FAQs are closed with Text color \"([^\"]*)\"$")
	public void default_FAQs_are_closed_with_Text_color(String color) throws Throwable {
		System.out.println(faqPage.openCloseButtonStatus());
		//Assert.assertThat(faqPage.openCloseButtonStatus(), CoreMatchers.containsString("false"));
		 Assert.assertThat(faqPage.openCloseButtonStatus(), is(not("true")));
		defaultColor=faqPage.textColor();
		Assert.assertThat("Color of text is not as expected ",faqPage.textColor(), CoreMatchers.containsString(color));
		
	}
	@Then("^FAQ page displayed with title \"([^\"]*)\"$")
	public void faq_page_displayed_with_title(String title) throws Throwable {
		helper.mediumWait.until(helper.numberOfWindowsToBe(2));
		faqPage.verifyNewTabTitle(title);
	}
	@When("^User click on open/close button$")
	public void user_click_on_open_close_button() throws Throwable {
		faqPage.clickOnOpenCloseArrow(); 
	}
	@Then("^FAQ open and text color is changed$")
	public void FAQ_open_and_text_color_is_changed() throws Throwable {
	   System.out.println(faqPage.textColor());
	   System.out.println(faqPage.openCloseButtonStatus());
	   Assert.assertThat(faqPage.openCloseButtonStatus(), is("true"));
	 Assert.assertThat(faqPage.textColor(), is(not(defaultColor)));
	}

	
}
