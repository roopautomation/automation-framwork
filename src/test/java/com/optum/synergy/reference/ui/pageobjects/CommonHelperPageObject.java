package com.optum.synergy.reference.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.optum.synergy.common.ui.controller.WebController;

public class CommonHelperPageObject extends PageObjectBase  {
	@FindBy(how = How.CLASS_NAME, using = "masthead-dashboard")
	private WebElement banner;
	
	@FindBy(how = How.CSS, using = "masthead-content intro")
	private WebElement bannerText;
	
	
}
