package com.optum.synergy.reference.ui.stepDefinitions;

import org.junit.Assert;

import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.LandingFooterPageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingFooterPageStepDefinition {

	CommonHelper helper = new CommonHelper();
	LandingFooterPageObject Page = new LandingFooterPageObject(helper);
	String url;

	@Given("^Landing Page opens$")
	public void landingPageDisplays() throws Throwable {
		Page.openPage();
	
	}

	@Then("^user sees a Landing banner$")
	public void userSeesLandingBanner() throws Throwable {
		Assert.assertTrue(Page.verifyLandingBannerDisplays());
	}

	@When("^User clicks Terms of Use$")
	public void userClicksTermsOfUse() throws Throwable {

		url = helper.getkLinkHRef("Terms of Use");

		System.out.println("==== URL Which we checked========" + url);

	}

	@Then("^Privacy Policy page loads")
	public void privacyPolicyPageLoads() throws Throwable {
		// privacyPage.verifyIfPageLoaded();
		boolean status = CommonHelper.verifyLinkActive(url);

		System.out.println("Status of Link " + status);

		Assert.assertTrue(status);
	}

	@Then("^Terms of Use page loads")
	public void termsOfUsePageLoads() throws Throwable {
		boolean status = CommonHelper.verifyLinkActive(url);

		System.out.println("Status of Link " + status);

		Assert.assertTrue(status);
	}

	@When("^User clicks Privacy Policy$")
	public void userClicksPrivacyPolicy() throws Throwable {
		// helper.clickLink("Privacy Policy");
		url = helper.getkLinkHRef("Privacy Policy");
	}

	@And("^user sees a component overlaying the Landing banner that contains text$")
	public void userSeesLandingBannerText() throws Throwable {
		Assert.assertTrue(Page.verifyLandingBannerTextDisplays());
	}

	@And("^user sees a video section with a discription text on the left side$")
	public void userSeesVideoDesc() throws Throwable {
		Assert.assertTrue(Page.verifyVideoDescDisplays());
	}

	@And("^user sees a video preview image in right side of video section$")
	public void userSeesVideoPrev() throws Throwable {
		Assert.assertTrue(Page.verifyVideoControlDisplays());
	}

	@And("^user sees information tiles and content$")
	public void userSeesInfoTiles() throws Throwable {
		Assert.assertTrue(Page.verifyInfoContainerDisplays());
	}

	@And("^user sees additional registration and login section$")
	public void userSeesAddReg() throws Throwable {
		Assert.assertTrue(Page.verifySignInContainerDisplays());
	}

	@And("^user sees footer section$")
	public void userSeesFooter() throws Throwable {
		Assert.assertTrue(Page.verifyFooterHENDisplays());
	}

	@When("^User clicks English Language Assistance link$")
	public void user_clicks_English_Language_Assistance_link() throws Throwable {

		String url = helper.getkLinkHRef("Language Assistance/Non-Discrimination notice");

		System.out.println("==== URL Which link Language Assistance/Non-Discrimination notice - English=======" + url);

		boolean status = CommonHelper.verifyLinkActive(url);

		System.out.println("Status of Link " + status);

		Assert.assertTrue(status);

	}

	@Then("^Language Assistance page loads$")
	public void language_Assistance_page_loads() throws Throwable {

		boolean status = CommonHelper.verifyLinkActive(url);

		System.out.println("Status of Link " + status);

		Assert.assertTrue(status);

	}

	@When("^User clicks Spanish Language Assistance link$")
	public void user_clicks_Spanish_Language_Assistance_link() throws Throwable 
	{
		String url = helper.getkLinkHRef("Asistencia de Idiomas / Aviso de no Discriminación");

		System.out.println("==== URL Which link with Spanish page is ========" + url);

	}

	@When("^User clicks Chinese Language Assistance link$")
	public void user_clicks_Chinese_Language_Assistance_link() throws Throwable {

		String url = helper.getkLinkHRef("語言協助 / 不歧視通知");

		System.out.println("==== URL Which link Chinese page is ========" + url);

		boolean status = CommonHelper.verifyLinkActive(url);

		System.out.println("Status of Link " + status);

		Assert.assertTrue(status);
	}

	@Then("^all language assistance links display in (\\d+) point font$")
	public void all_language_assistance_links_display_in_point_font(int arg1) throws Throwable {

	}

	@Then("^all links are AEM authorable$")
	public void all_links_are_AEM_authorable() throws Throwable {

	}

}
