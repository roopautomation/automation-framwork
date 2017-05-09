package com.optum.synergy.reference.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.optum.synergy.common.ui.controller.WebController;

public class CommonHelper extends PageObjectBase  {
    
    private static final String CSS_SELECTOR_MAIN_HEADING = "#main-panel h1";
    
	/**  
	 * wait for a specified element
	 * 
	 * @param  webelement and time in seconds for wait
	 * @return true/false
	 * @throws exception
	 */
    public boolean waitForElementFrame(WebElement element, int seconds) {
    
    	boolean displayedElement = false;

    	WebDriverWait wait = new WebDriverWait(driver, seconds);

    	try {
    	wait.until(ExpectedConditions.visibilityOf(element));
    	displayedElement = true;
    	} catch (TimeoutException e) {
    	displayedElement = false;
    	} catch (Exception e) {
    	displayedElement = false;
    	}
    	return displayedElement;
    	}

    public boolean findLinkText(String expectedLinkText) {
        WebElement elem = WebController.findElement(expectedLinkText, "linktext");
        return elem!=null;

    }
    
    public boolean getPageHeading(String expectedPageHeading) {
        String actualPageHeading = driver.findElement(By.cssSelector(CSS_SELECTOR_MAIN_HEADING)).getText();
        return expectedPageHeading.equals(actualPageHeading);
    }

    
	public void clickLink(String linkName) {
		mediumWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName))).click();
	}
	
	public void clickPartialLink(String partailLinkName) {
		mediumWait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(partailLinkName))).click();
	}

	public void getCSSelement(String cssIdentifier) {
		mediumWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssIdentifier)));
	}
	
	public void openPage(String pageUrl) {

		driver.get(pageUrl);

	}
    
	public void refreshPage()
	{
		driver.navigate().refresh();
	}



}
