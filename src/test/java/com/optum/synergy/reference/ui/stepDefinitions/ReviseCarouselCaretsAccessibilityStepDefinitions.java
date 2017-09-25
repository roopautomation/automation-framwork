package com.optum.synergy.reference.ui.stepDefinitions;
import org.junit.Assert;


import com.optum.synergy.reference.ui.pageobjects.CarouselComponentPageObject;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReviseCarouselCaretsAccessibilityStepDefinitions {
	
	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject page = new LandingFooterPageObject(helper);
	CarouselComponentPageObject carousel=new CarouselComponentPageObject(helper);
	
    int positionBeforeEnter;
	int positionAfterEnter;
	int positionBeforeClick;
	int positionAfterClick;
	
	@When("^User navigate to Carousel Component\\.$")
	public void user_navigate_to_Carousel_Component() throws Throwable {
		 carousel.scroolToCarouselSection();
	}
	@Then("^User note sliding indicator position\\.$")
	public void user_note_sliding_indicator_position() throws Throwable {
		Thread.sleep(2000);
		System.out.println("Position is First "+carousel.slidingIndicatorPosition());
	   // positionBeforeEnter=carousel.slidingIndicatorPosition();
		
	}

	@When("^User access Left carets Carousel with TAB key and ENTER\\.$")
	public void user_access_Left_carets_Carousel_with_TAB_key_and_ENTER() throws Throwable {
		carousel.accessLeftCarouselCaretsWithTABandENTER();
		Thread.sleep(1000);
	}

	@Then("^Slide display in carousel is moved to next\\.$")
	public void slide_display_in_carousel_is_moved_to_next() throws Throwable {
		System.out.println("Position is second "+carousel.slidingIndicatorPosition());
		Assert.assertNotEquals(positionBeforeEnter, (carousel.slidingIndicatorPosition()));
	    
	}
	@Then("^User note sliding indicator position again\\.$")
	public void user_note_sliding_indicator_position_again() throws Throwable {
		positionAfterEnter=carousel.slidingIndicatorPosition();
		
	}
	
	@Then("^Slide display in carousel is moved to next again\\.$")
	public void slide_display_in_carousel_is_moved_to_next_again() throws Throwable {
		
		Assert.assertNotEquals(positionAfterEnter, (carousel.slidingIndicatorPosition()));
	    
	}

	@Then("^User access Right carets Carousel with TAB key and ENTER\\.$")
	public void user_access_Right_carets_Carousel_with_TAB_key_and_ENTER() throws Throwable {
		carousel.accessRightCarouselCaretsWithTABandENTER();
		Thread.sleep(1000);
	}

	@When("^User click on Left carets Carousel\\.$")
	public void user_click_on_Left_carets_Carousel() throws Throwable {
		carousel.clickOnLeftCarouselCaret();
	}

	@Then("^User click Right carets Carousel\\.$")
	public void user_click_Right_carets_Carousel() throws Throwable {
		carousel.clickOnRightCarouselCaret();
	}

}
