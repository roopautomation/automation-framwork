package com.optum.synergy.reference.ui.pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeroComponentPageObject extends PageObjectBase {

	public HeroComponentPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
	}
	@FindBy(how = How.XPATH, using = ".//*[@id='uhc']/div[1]/div[2]/div/div[1]/div/div/div")
	private WebElement landingMasthead;
	
	@FindBy(how = How.ID, using = ".row.cover-img.ng-scope")
	private WebElement heroImage;
	
	@FindBy(how = How.CSS, using = ".container-header>h1")
	private WebElement header;
	
	
	@FindBy(how = How.CSS, using = ".btn.btn--primary.btn-responsive-mobile")
	private WebElement signInBtn;
	
	@FindBy(how = How.CSS, using = ".btn.btn--secondary.btn-responsive-mobile")
	private WebElement registration;
	
	public static String page_url;
	
	public void openPage() throws FileNotFoundException, IOException, ParseException {
		page_url = getEnvVariable("landingPageUrl");
		helper.openPage(page_url);
	}

	public boolean verifyIfPageLoaded()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(landingMasthead)).isDisplayed();
	}
	public boolean verifyHeroImageDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(heroImage)).isDisplayed();
	}
	
	public boolean verifyHeaderDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(header)).isDisplayed();
	}
	
	public boolean verifySignInButtonDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInBtn)).isDisplayed();
	}
	public boolean verifyRegistrationButtonDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(registration)).isDisplayed();
	}
	

}
