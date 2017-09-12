package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;
import com.optum.synergy.reference.ui.pageobjects.VideoTranscriptAndPrintPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class VideoWithTranscriptDrawerStepDefinations {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	VideoTranscriptAndPrintPageObject videoSection = new VideoTranscriptAndPrintPageObject(helper);
	
	
	@Then("^Video component dispayed$")
	public void video_component_dispayed() throws Throwable {
		videoSection.verifyVideoSectionDisplayed();
	}

	@Then("^ViewTranscript not display If No cotent is entered in Transcript$")
	public void viewtranscript_not_display_If_No_cotent_is_entered_in_Transcript() throws Throwable {
		if (videoSection.verifyDisplayedViewTranscript()){
			System.out.println("View Transcript link displayed");
		}
		else {
			System.out.println("View Transcript link NOT displayed ");
		}
	}

	@Then("^If time and videoName display, a verticle bar is display$")
	public void if_time_and_videoName_display_a_verticle_bar_is_display() throws Throwable {
		if(videoSection.videoTimeDisplayStatus()&&videoSection.videoNameDisplayStatus()){
			System.out.println("VideoTime and VideoName are displayed ");
			Assert.assertTrue(videoSection.verticalBarDisplayStatus());
			System.out.println("Vertical bar is present");
		}
		else{
			System.out.println("VideoTime and VideoName are not displayed ");
			Assert.assertFalse(videoSection.verticalBarDisplayStatus());
			System.out.println("Vertical bar is not present");
		}
		
	}

	@Given("^View transcript link displayed\\.$")
	public void view_transcript_link_displayed() throws Throwable {
		videoSection.verifyDisplayedViewTranscript();
		System.out.println("View transcript link displayed");
	}

	@When("^User click on view Transcript link$")
	public void user_click_on_view_Transcript_link() throws Throwable {
		videoSection.clickOnViewTranscript();
		System.out.println("view Transcript linked");
	}

	@Then("^Print transcript link displayed$")
	public void print_transcript_link_displayed() throws Throwable {
		videoSection.verifyDisplayedPrintTranscript();
		System.out.println("Print transcript link displayed");
	}

	@Then("^A drawer is open$")
	public void a_drawer_is_open() throws Throwable {
		Assert.assertTrue(videoSection.verifyDrawerTextDisplayed()); 
		System.out.println("A drawer is open");
	}

	@Then("^A cross sign displaye to close drawer$")
	public void a_cross_sign_displaye_to_close_drawer() throws Throwable {
		videoSection.verifyCrossSignBtnDisplayed();
		System.out.println("A cross sign displaye to close drawer");
	}

	@Then("^A scroll bar present in drawer$")
	public void a_scroll_bar_present_in_drawer() throws Throwable {
	   videoSection.scrollInsideTranscriptMessage();
	   System.out.println("A scroll bar present in drawer");
	}

	@When("^User click on cross sign button$")
	public void user_click_on_cross_sign_button() throws Throwable {
		Thread.sleep(2000);
		videoSection.clickOnCrossSignBtn();
		Thread.sleep(2000);
	}

	@Then("^Drawer get closed$")
	public void drawer_get_closed() throws Throwable {
		Assert.assertFalse(videoSection.verifyDrawerIsNOTDisplayed()); 
		
		
	}
	
	
}
