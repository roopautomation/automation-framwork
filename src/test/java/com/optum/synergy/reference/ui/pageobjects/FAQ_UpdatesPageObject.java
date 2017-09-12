package com.optum.synergy.reference.ui.pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FAQ_UpdatesPageObject extends PageObjectBase {

	public FAQ_UpdatesPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
	}
	
	@FindBy(how = How.LINK_TEXT, using = "FAQs")
	private WebElement faqLink;
	
	@FindBy(tagName = "footer")
	private WebElement footer;
	
	@FindBy(how = How.CSS, using = "#footer-arrow")
	private WebElement backTopBtn;

	@FindBy(how = How.XPATH, using = ".//*[@id='faqs_0']/preceding-sibling::div")
	private WebElement openCloseArrow;
	@FindBy(how = How.XPATH, using = ".//*[@id='faqs_0']")
	private WebElement openCloseArrow1;
	
	public void scroolToFooterSection(){
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", backTopBtn);
	}
	
	public void clickOnFAQLink(){
		faqLink.click();		
	}
	
	public void verifyFooterSectionDisplay(){
		faqLink.click();		
	}
	public void verifyNewTabTitle(String title){
    	helper.newTabOpenAndTitleVerify(title);
    	
	}
	public String textColor(){
		String color=openCloseArrow.getCssValue("color");
		//System.out.println("Color>>>"+Color.fromString(color).asHex());
		return Color.fromString(color).asHex();
	}
	public void clickOnOpenCloseArrow(){
		openCloseArrow.click();		
	}
	public String openCloseButtonStatus(){
		mediumWait.until(ExpectedConditions.visibilityOf(openCloseArrow)).isDisplayed();
		return openCloseArrow1.getAttribute("aria-expanded");
		
	}
	
	
}
