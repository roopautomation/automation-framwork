package com.optum.synergy.reference.ui.stepDefinitions;

import com.optum.synergy.reference.ui.pageobjects.CommonHelper;
import com.optum.synergy.reference.ui.pageobjects.HeroComponentPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeroComponent {
	
	CommonHelper helper = new CommonHelper();
	HeroComponentPageObject heroPage= new HeroComponentPageObject(helper);
	
	@Given("^Unauthenticated Hero Component with HSID \\(D\\) - FE Page$")
	public void unauthenticated_Hero_Component_with_HSID_D_FE_Page() throws Throwable {
		heroPage.openPage();
	}

	@Given("^the site visitor is accessing the site in a desktop browser$")
	public void the_site_visitor_is_accessing_the_site_in_a_desktop_browser() throws Throwable {
		heroPage.verifyIfPageLoaded();
	}

	@When("^they navigate directly to the Unauthenticated Homepage$")
	public void they_navigate_directly_to_the_Unauthenticated_Homepage() throws Throwable {
	}

	@Then("^the Hero image is displayed$")
	public void the_Hero_image_is_displayed() throws Throwable {
	}

	@Then("^the appropriate Header and Body copy is displayed$")
	public void the_appropriate_Header_and_Body_copy_is_displayed() throws Throwable {
	}

	@Then("^the appropriate Calls to Action are displayed$")
	public void the_appropriate_Calls_to_Action_are_displayed() throws Throwable {
	}




}
