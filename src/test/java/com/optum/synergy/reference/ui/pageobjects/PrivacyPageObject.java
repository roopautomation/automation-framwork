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

public class PrivacyPageObject extends PageObjectBase{

	public PrivacyPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
	}

	@FindBy(how = How.CSS, using = "div.sectionHeader[value*=Privacy Policy]")
	private WebElement privacyPageHeader;
	
	public boolean verifyIfPageLoaded()
	{
		return mediumWait.until(ExpectedConditions.visibilityOf(privacyPageHeader)).isDisplayed();
	}
}
