package com.optum.synergy.reference.ui.pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FAQ_UpdatesPageObject extends PageObjectBase {

	
	CommonHelper helper;
	
	//PageObjectBase base=new PageObjectBase();
	
	
	public FAQ_UpdatesPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		//helper.driver = driver;
		this.helper = helper;
	}

	@FindBy(how = How.LINK_TEXT, using = "FAQs")
	private WebElement faqLink;

	@FindBy(tagName = "footer")
	private WebElement footer;

	@FindBy(how = How.CSS, using = "#footer-arrow")
	private WebElement backTopBtn;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='faqs_0']/preceding-sibling::div/p")
	private WebElement faqQuestion;

	@FindBy(how = How.XPATH, using = ".//*[@id='faqs_0']/preceding-sibling::div")
	private WebElement openCloseArrow;

	@FindBy(how = How.XPATH, using = ".//*[@id='faqs_0']")
	private WebElement openCloseArrow1;

	public void scroolToFooterSection() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", backTopBtn);
	}

	public void clickOnFAQLink() {
		//TODO get current count of tabs/windows
		faqLink.click();
		//TODO wait for tab to open by being old one plus
	}

	public void verifyFooterSectionDisplay() {
		faqLink.isDisplayed();
	}

	public void verifyNewTabTitle(String title) {
		helper.newTabOpenAndTitleVerify(title);

	}
	public void newPageOpenAndTitleVerifyAndClose(String title){
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(browserTabs .get(1));
		System.out.println("Pahe title now found is >>>"+driver.getTitle());
		try 
		{
			new WebDriverWait(driver, 20).until(ExpectedConditions.titleContains(title));
			Assert.assertTrue(true);
			System.out.println("New Page loaded Successfully");
			//log.info("Login Successfully");
		} catch (Error e) 
		
		{
			System.out.println("======Page not Poaded===");
		}
		//driver.close();
		//driver.switchTo().window(browserTabs.get(0));
	}

	public void verifyNewTabTitle1(String title) {
		List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
		for (String pagTitle : browserTabs) {
			if (pagTitle == title) {
				Assert.assertTrue(true);
				System.out.println(">>>Title verified>>>");
			}
			break;
		}
	}

	public String textColor() {
		String color = openCloseArrow.getCssValue("color");
		// System.out.println("Color>>>"+Color.fromString(color).asHex());
		return Color.fromString(color).asHex();
	}

	public void clickOnOpenCloseArrow() {
		openCloseArrow.click();
	}
    public void faqDiaplayed(){
    	mediumWait.until(ExpectedConditions.visibilityOf(faqQuestion)).isDisplayed();
    }
	public String openCloseButtonStatus() throws InterruptedException {

		Thread.sleep(9000);
		mediumWait.until(ExpectedConditions.visibilityOf(faqQuestion)).isDisplayed();

		// SyncLibrary.elementPresence(openCloseArrow, 30);

		return openCloseArrow.getAttribute("aria-expanded");

	}

}
