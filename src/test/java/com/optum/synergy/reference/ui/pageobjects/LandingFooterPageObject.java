package com.optum.synergy.reference.ui.pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingFooterPageObject extends PageObjectBase {

	public LandingFooterPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
	}
	
	@FindBy(how = How.ID, using = "masthead")
	private WebElement landingMasthead;
	
	@FindBy(how = How.CSS, using = "header#masthead div.masthead-content")
	private WebElement landingBanner;
	
	@FindBy(how = How.CSS, using = "div.masthead-content div.intro")
	private WebElement landingBannerText;
	
	/** Sign in/Sign up section -- this area will link through to HSID **/
	@FindBy(how = How.CSS, using = "div.footer--masthead-primary-text a.btn--primary")
	private WebElement lnkSignIn;
	
	@FindBy(how = How.CSS, using = "div.footer--masthead-secondary-text a")
	private WebElement lnkSignUp;
	
	/** Video section -- text on video and a video that explains application. **/
	@FindBy(how = How.CLASS_NAME, using = "hero-section")
	private WebElement videoContainer;
	
	@FindBy(how = How.CLASS_NAME, using = "hero-section-content")
	private WebElement videoText;
	
	// @Todo this will need to be updated once the video stories are worked
	@FindBy(how = How.CSS, using = "div.hero-section div.col-md-6:nth-of-type(2) div.image")
	private WebElement videoControl;
	
	/** Info Container -- Information on HealtheNotes **/
	@FindBy(how = How.CSS, using = "section.container")
	private WebElement infoContainer;
	
	@FindBy(how = How.CSS, using = "section.container h1.section-header-text")
	private WebElement infoContainerHeader;
	
	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(1)")
	private WebElement infoTile1;
	
	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(2)")
	private WebElement infoTile2;

	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(3)")
	private WebElement infoTile3;

	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(1) h4")
	private WebElement infoTileHeader1;

	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(2) h4")
	private WebElement infoTileHeader2;

	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(3) h4")
	private WebElement infoTileHeader3;

	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(1) body")
	private WebElement infoTileContent1;

	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(2) body")
	private WebElement infoTileContent2;
	
	@FindBy(how = How.CSS, using = "section.container div.col-md-4:nth-of-type(3) body")
	private WebElement infoTileContent3;

	/** Sign-In Container -- Secondary sign-in location that will link out to HSID **/
	@FindBy(how = How.CLASS_NAME, using = "cta-home")
	private WebElement signInContainer;
	
	@FindBy(how = How.CLASS_NAME, using = "cta-home-image")
	private WebElement signInIcon;
	
	@FindBy(how = How.CLASS_NAME, using = "cta-home-header")
	private WebElement signInHeader;

	@FindBy(how = How.CSS, using = "img.cta-home-image")
	private WebElement signInImg;

	@FindBy(how = How.CSS, using = "footer.cta-home-footer div.typography a.btn--primary")
	private WebElement signInLink;

	@FindBy(how = How.CLASS_NAME, using = "cta-home-body")
	private WebElement signInContent;
	
	@FindBy(how = How.CSS, using = "div.cta-home-body a")
	private WebElement signUpLink;
	
	/** Footer -- provides standard disclaimer and links to legalize required for application. **/ 
	/* Footer */
	@FindBy(tagName = "footer")
	private WebElement footer;
	
	@FindBy(how = How.CSS, using = "#footer-arrow")
	private WebElement backTopBtn;

	@FindBy(how = How.CSS, using = "footer.footer--global ul.footer-ul")
	private WebElement footerHEN;
	
	public static String page_url;

	public void openPage() throws FileNotFoundException, IOException, ParseException {
		page_url = getEnvVariable("landingPageUrl");
		//page_url = "https://test-populationhealth.optum.com/content/phs/en/phs.html";
		helper.openPage(page_url);
	}
	public void scroolToFooterSection(){
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", backTopBtn);
	}
	
	public void tabOnBackToTopButton(){
		
				backTopBtn.sendKeys(Keys.TAB);
	}
	public void pressEnterKey(){
		backTopBtn.sendKeys(Keys.ENTER);
	}
	
	public void clickOnTopButton(){
		backTopBtn.click();
	}


	public boolean verifyIfPageLoaded()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(landingMasthead)).isDisplayed();
	}
	
	public boolean verifyLandingBannerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(landingBanner)).isDisplayed();
	}

	public boolean verifyLandingBannerTextDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(landingBannerText)).isDisplayed();
	}
	
	public boolean verifyVideoDescDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(videoText)).isDisplayed();
	}
	
	public boolean verifyVideoControlDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(videoControl)).isDisplayed();
	}
	
	public boolean verifyInfoContainerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoContainer)).isDisplayed();
	}
	
	public boolean verifyInfoContHeaderDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoContainerHeader)).isDisplayed();
	}
	
	public boolean verifyInfoTile1Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTile1)).isDisplayed();
	}
	
	public boolean verifyInfoTile2Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTile2)).isDisplayed();
	}

	public boolean verifyInfoTile3Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTile3)).isDisplayed();
	}
	
	public boolean verifyInfoTileHeader1Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTileHeader1)).isDisplayed();
	}

	public boolean verifyInfoTileHeader2Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTileHeader2)).isDisplayed();
	}

	public boolean verifyInfoTileHeader3Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTileHeader3)).isDisplayed();
	}

	public boolean verifyInfoTileContent1Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTileContent1)).isDisplayed();
	}

	public boolean verifyInfoTileContent2Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTileContent2)).isDisplayed();
	}

	public boolean verifyInfoTileContent3Displays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(infoTileContent3)).isDisplayed();
	}
	
	public boolean verifySignInContainerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInContainer)).isDisplayed();
	}

	public boolean verifySignInIconDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInIcon)).isDisplayed();
	}

	public boolean verifySignInHeaderDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInHeader)).isDisplayed();
	}
	
	public boolean verifySignInImgDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInImg)).isDisplayed();
	}
	
	public boolean verifySignInLinkDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInLink)).isDisplayed();
	}
	
	public boolean verifySignInContentDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signInContent)).isDisplayed();
	}
	
	public boolean verifySignUpLinkDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(signUpLink)).isDisplayed();
	}
	
	public boolean verifyFooterHENDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(footerHEN)).isDisplayed();
	}

}
