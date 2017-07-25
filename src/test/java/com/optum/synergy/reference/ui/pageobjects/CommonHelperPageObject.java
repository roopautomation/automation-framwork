package com.optum.synergy.reference.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonHelperPageObject extends PageObjectBase  
{
	@FindBy(how = How.CLASS_NAME, using = "masthead-dashboard")
	private WebElement banner;
	
	@FindBy(how = How.CSS, using = "masthead-content intro")
	private WebElement bannerText;
	
	
}
