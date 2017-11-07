package com.optum.synergy.reference.ui.pageobjects;

import org.openqa.selenium.support.PageFactory;

public class StageRedirectURLsPageObject extends PageObjectBase{
	
	
	public StageRedirectURLsPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
    }
	
	public void launchStageURLs(String stgUrl){
		driver.get(stgUrl);
	}
	public String redirectedURLDisplayedAs(){
		return driver.getCurrentUrl();
	}
	public String pageTitle(){
		helper.waitForPageLoad(driver);
		return driver.getTitle();
	}

}
