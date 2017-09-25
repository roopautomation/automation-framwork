package com.optum.synergy.reference.ui.stepDefinitions;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;
import com.optum.synergy.reference.ui.pageobjects.VideoTranscriptAndPrintPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrintVideoTranscriptStepDefination {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	VideoTranscriptAndPrintPageObject printVideo = new VideoTranscriptAndPrintPageObject(helper);
	
	
	@Given("^Transcript link is displayed$")
	public void transcript_link_is_displayed() throws Throwable {
		printVideo.verifyDisplayedViewTranscript();
		ExtentCucumberFormatter.setTestRunnerOutput("INFO: View Transcript link is displayed");
	}

	@When("^User scroll to video component$")
	public void user_scroll_to_video_component() throws Throwable {
		printVideo.scroolToVideoSection();
	}

	@When("^User click on \"([^\"]*)\" link$")
	public void user_click_on_link(String arg1) throws Throwable {
		printVideo.clickOnViewTranscript();
	}

	@Then("^A Link \"([^\"]*)\" displayed$")
	public void a_Link_displayed(String arg1) throws Throwable {
		printVideo.verifyDisplayedPrintTranscript();
		ExtentCucumberFormatter.setTestRunnerOutput("INFO:Print Transcript link is displayed");
	}

	@When("^User click on PRINT TRANSCRIPT link$")
	public void user_click_on_PRINT_TRANSCRIPT_link() throws Throwable {
		printVideo.clickOnPrintTranscript();
	}

	@Then("^PDF of transcript open in new TAB$")
	public void pdf_of_transcript_open_in_new_TAB() throws Throwable {
	    helper.mediumWait.until(helper.numberOfWindowsToBe(2));
	    ExtentCucumberFormatter.setTestRunnerOutput("INFO:New TAB opened");
	}
	@Then("^User Verify title of new TAB \"([^\"]*)\"$")
	public void user_Verify_title_of_new_TAB(String title) throws Throwable {
	   helper.newTabOpenAndTitleVerifyAndClose(title);
	   ExtentCucumberFormatter.setTestRunnerOutput("INFO:New TAB Title verified");
	   Thread.sleep(1000);
	}

}
