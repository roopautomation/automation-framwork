package com.optum.synergy.reference.ui.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

public class VideoTranscriptAndPrintPageObject extends PageObjectBase {

	public VideoTranscriptAndPrintPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
}
	

	@FindBy(how = How.CSS, using = ".video__media")
	private WebElement videoComponent;
	

	@FindBy(how = How.LINK_TEXT, using = "View Transcript")
	private WebElement viewTranscript;
	
	@FindBy(how = How.CSS, using = ".video__drawer--time.ng-binding")
	private WebElement videoTime;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='video_copy']/div/div/div/div/div[2]/span[2]")
	private WebElement vertclBar;
	
	@FindBy(how = How.CSS, using = ".video__drawer--heading")
	private WebElement videoName;
	

	@FindBy(how = How.CSS, using = ".video__content__links--link")
	private WebElement printTranscript;
	
	@FindBy(how = How.ID, using = "video_transcript_hide_4929125788001")
	private WebElement crossButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='video_transcript_hide_4929125788001']/parent::div/following-sibling::div")
	private WebElement drawer;
	
	public void scroolToVideoSection(){
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", videoComponent);
	}
	
	public void scrollInsideTranscriptMessage(){
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollTop = arguments[1];",drawer, 100);
		

		
	}
	public void verifyVideoSectionDisplayed(){
		viewTranscript.isDisplayed();
	}
	public boolean videoTimeDisplayStatus(){
		return videoTime.isDisplayed();
	}
	public boolean videoNameDisplayStatus(){
		return videoName.isDisplayed();
	}
	public boolean verticalBarDisplayStatus(){
		return vertclBar.isDisplayed();
	}
	public boolean verifyDrawerTextDisplayed(){
		try{
		viewTranscript.isDisplayed();
		return true;
		}catch(ElementNotVisibleException e)
		{
			return false;
		}
	}
	public boolean verifyDrawerIsNOTDisplayed(){
		return drawer.isDisplayed();
	}
	public boolean verifyDisplayedViewTranscript(){
		return viewTranscript.isDisplayed();
	}
	public void verifyDisplayedPrintTranscript(){
		smallWait.until(ExpectedConditions.visibilityOf(printTranscript)).isDisplayed();
	}
	
	public void verifyCrossSignBtnDisplayed(){
		crossButton.isDisplayed();
	}
	
	public void clickOnCrossSignBtn(){
		crossButton.click();
	}
	public void clickOnViewTranscript(){
		viewTranscript.click();
	}
    public void clickOnPrintTranscript(){
    	printTranscript.click();
	}
    public void waitUntillNewTABopen(){
		mediumWait.until(helper.numberOfWindowsToBe(2));
	}
    
    public void vrifyNewTabTitle(String title){
    	helper.newTabOpenAndTitleVerify(title);
	}
    
	
			
	


	
	
}