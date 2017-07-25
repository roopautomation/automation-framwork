package com.optum.synergy.reference.ui.pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPageObject extends PageObjectBase {
	
	public DashboardPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;	
	}
	
	
	
	@FindBy(how = How.CLASS_NAME, using = "masthead-dashboard")
	private WebElement dashboardBanner;
	
	@FindBy(how = How.CSS, using = "div.masthead-content div.intro")
	private WebElement dashboardBannerText;

	/** Sidebar Components -- appear on the left/top of the Dashboard and provide the customer quick access. **/
	/* Sidebar Opportunities List */
	@FindBy(how = How.CSS, using = "div.panel-body h4.panel-title")
	private WebElement sidebarOppHeader;

	@FindBy(how = How.CSS, using = "section#note-navigation")
	private WebElement sidebarOpps;

	@FindBy(how = How.CSS, using = "section#note-navigation li.list-group-item")
	private WebElement sidebarOppItem;
	
	@FindBy(how = How.CSS, using = "section#note-navigation li.list-group-item a[href*='note']")
	private WebElement sidebarOppItemLink;
	
	/* Sidebar Actions */
	@FindBy(how = How.ID, using = "takeaction-sidebar")
	private WebElement sidebarActionsSection;
	
	@FindBy(how = How.CSS, using = "section#takeaction-sidebar h4.bold")
	private WebElement sidebarActionsHeader;
	
	@FindBy(how = How.CSS, using = "section#takeaction-sidebar ol.sidebar-ol")
	private WebElement sidebarActionsList;

	@FindBy(how = How.CSS, using = "section#takeaction-sidebar li.sidebar-ol__list-item:nth-of-type(1)")
	private WebElement sidebarActionsItem1;

	@FindBy(how = How.CSS, using = "section#takeaction-sidebar li.sidebar-ol__list-item:nth-of-type(2)")
	private WebElement sidebarActionsItem2;

	@FindBy(how = How.CSS, using = "section#takeaction-sidebar li.sidebar-ol__list-item:nth-of-type(3)")
	private WebElement sidebarActionsItem3;

	/* Sidebar Survey */
	@FindBy(how = How.ID, using = "survey")
	private WebElement sidebarSurveySection;
	
	@FindBy(how = How.CSS, using = "section#survey a.btn--secondary")
	private WebElement surveyLink;
	

	/** Main Opportunity List -- is where the consumer gets the detailed information and can interact with opportunities. **/ 
	/* Opportunities list */
	@FindBy(how = How.ID, using = "note-list")
	private WebElement mainOpportunities;
	
	@FindBy(how = How.CSS, using = "section.card")
	private WebElement noteListItem;
	
	@FindBy(how = How.CLASS_NAME, using = "note-readmore")
	private WebElement lnkNoteReadMore;
	
	@FindBy(how = How.CLASS_NAME, using = "btn--mark-complete")
	private WebElement lnkMarkComplete;

	@FindBy(how = How.CSS, using = "a.btn--mark-complete span.btn-text")
	private WebElement txtMarkComplete;

	@FindBy(how = How.CLASS_NAME, using = "btn--complete")
	private WebElement lnkComplete;

	@FindBy(how = How.CSS, using = "a.btn--complete span.btn-text")
	private WebElement txtComplete;

	/** Actions Container -- describes methods of further actions the consumer can take beyond interacting with the app. **/ 
	/* Actions Container */
	@FindBy(how = How.CSS, using = "section.full-width div.section")
	private WebElement actionsContainer;
	
	/** Resource Container -- provides additional online resources for the consumer. **/ 
	/* Resources Container */
	@FindBy(how = How.CSS, using = "section.container div.row")
	private WebElement resourcesContainer;

	@FindBy(how = How.ID, using = "video-modal")
	private WebElement videoModal;
	
	/** Footer -- provides standard disclaimer and links to legalize required for application. **/ 
	/* Footer */
	@FindBy(tagName = "footer")
	private WebElement footer;
	
	@FindBy(how = How.CSS, using = "footer.footer--global p.text-disclaimer")
	private WebElement footerDisclaimer;
	
	@FindBy(how = How.CSS, using = "footer.footer--global ul.footer-ul")
	private WebElement footerHEN;
	

	public static String page_url;
	
	public void openPage() throws FileNotFoundException, IOException, ParseException 
	{
		page_url = getEnvVariable("dashboardPageUrl");
		helper.openPage(page_url);
	}

	public boolean verifyBannerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(dashboardBanner)).isDisplayed();
	}

	public boolean verifyBannerTextDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(dashboardBannerText)).isDisplayed();
	}

	public boolean verifySidebarOppHeaderDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(sidebarOppHeader)).isDisplayed();
	}

	public boolean verifySidebarOppsDisplay()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(sidebarOpps)).isDisplayed();
	}
	
	public boolean verifySidebarOppItemDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(sidebarOppItem)).isDisplayed();
	}
	
	public boolean verifySidebarOppItemLinkDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(sidebarOppItemLink)).isDisplayed();
	}
	
	public boolean verifySidebarActionsSectionDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(sidebarActionsSection)).isDisplayed();
	}
	
	public boolean verifySidebarSurveySectionDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(sidebarSurveySection)).isDisplayed();
	}
	
	public boolean verifyMainOpportunitiesDisplay()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(mainOpportunities)).isDisplayed();
	}	

	public boolean verifyNoteListItemDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(noteListItem)).isDisplayed();
	}	

	public boolean verifyLnkNoteReadMoreDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(lnkNoteReadMore)).isDisplayed();
	}	

	public boolean verifyLnkMarkCompleteDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(lnkMarkComplete)).isDisplayed();
	}	
	
	public boolean verifyTxtMarkCompleteDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(txtMarkComplete)).isDisplayed();
	}	

	public boolean verifyLnkCompleteDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(lnkComplete)).isDisplayed();
	}	
	
	public boolean verifyTxtCompleteDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(txtComplete)).isDisplayed();
	}	
	
	public boolean verifyActionsContainerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(actionsContainer)).isDisplayed();
	}	
	
	public boolean verifyResourcesContainerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(resourcesContainer)).isDisplayed();
	}	

	public boolean verifyVideoModalDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(videoModal)).isDisplayed();
	}	

	public boolean verifyFooterDisclaimerDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(footerDisclaimer)).isDisplayed();
	}	

	public boolean verifyFooterHENDisplays()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(footerHEN)).isDisplayed();
	}	

}
