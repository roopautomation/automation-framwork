package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageStepDefinition {

	CommonHelper helper = new CommonHelper();
	LandingPageObject Page = new LandingPageObject(helper);
	
	@Given("^Landing Page opens$")
	public void landingPageDisplays() throws Throwable {
		Page.openPage();
	}
	
	/**@Todo After AEM controls are coded, code needs to be added to 
	 * 		check for image **/
	@Then ("^user sees a Landing banner$")
	public void userSeesLandingBanner() throws Throwable {
		Assert.assertTrue(Page.verifyLandingBannerDisplays());
	}
		
	@When ("^User clicks Terms of Use$")
	public void userClicksTermsOfUse() throws Throwable {
		helper.clickLink("Terms of Use");
	}

	@When ("^User clicks Privacy Policy$")
	public void userClicksPrivacyPolicy() throws Throwable {
		helper.clickLink("Privacy Policy");
	}

	@And ("^user sees a component overlaying the Landing banner that contains text$")
	public void userSeesLandingBannerText() throws Throwable {
		Assert.assertTrue(Page.verifyLandingBannerTextDisplays());
	}
	
	@And ("^user sees a video section with a discription text on the left side$")
	public void userSeesVideoDesc() throws Throwable {
		Assert.assertTrue(Page.verifyVideoDescDisplays());
	}
	
	@And ("^user sees a video preview image in right side of video section$")
	public void userSeesVideoPrev() throws Throwable {
		Assert.assertTrue(Page.verifyVideoControlDisplays());
	}
	
	@And ("^user sees information tiles and content$")
	public void userSeesInfoTiles() throws Throwable {
		Assert.assertTrue(Page.verifyInfoContainerDisplays());
	}
	
	@And ("^user sees additional registration and login section$")
	public void userSeesAddReg() throws Throwable {
		Assert.assertTrue(Page.verifySignInContainerDisplays());
	}
	
	@And ("^user sees footer section$")
	public void userSeesFooter() throws Throwable {
		Assert.assertTrue(Page.verifyFooterHENDisplays());
	}
}
