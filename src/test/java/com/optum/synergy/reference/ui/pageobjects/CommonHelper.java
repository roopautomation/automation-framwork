package com.optum.synergy.reference.ui.pageobjects;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
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

    
    
    
    public static boolean verifyLinkActive(String linkUrl)
	{
    	boolean status=false;
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           System.out.println("Link status code is "+httpURLConnect.getResponseCode());
           if(httpURLConnect.getResponseCode()==200 || httpURLConnect.getResponseCode()==301)
           {
        	   
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
               status=true;
               
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
               
            }
        } catch (Exception e) {
           
        }
        
        return status;
    } 
    
    
    public String getkLinkHRef(String linkName) {
		return mediumWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName))).getAttribute("href");
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
	
	public void getXpathelement(WebElement ele) {
		mediumWait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void openPage(String pageUrl) 
	{

		driver.get(pageUrl);
		
		Assert.assertTrue(driver.getTitle().equals("PHS"));
		
		System.out.println("======Page Loaded and Tite verified=======");
		

	}
	
	public void openPage(String pageUrl,String title) 
	{

		driver.get(pageUrl);
		
		Assert.assertTrue(driver.getTitle().equals(title));
		
		System.out.println("======Page Loaded and Tite verified=======");
		

	}
    
	public void refreshPage()
	{
		driver.navigate().refresh();
	}



}
