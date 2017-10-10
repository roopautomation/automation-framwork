package com.optum.synergy.reference.ui.pageobjects;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
		
		Assert.assertTrue(driver.getTitle().equals("Health Support"));
		
		System.out.println("======Page Loaded and Tite verified=======");
		

	}
	
	public void openPage(String pageUrl,String title) 
	{

		driver.get(pageUrl);
		
		Assert.assertTrue(driver.getTitle().equals(title));
		
		System.out.println("======Page Loaded and Tite verified=======");
		

	}
	public void varifyPageTitle(String title){
		
		Assert.assertTrue("Title not verified as expected ",driver.getTitle().equals(title));
		
	}
	public void newTabOpenAndTitleVerify(String title){
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs .get(1));
		
		try 
		{
			new WebDriverWait(driver, 20).until(ExpectedConditions.titleContains(title));
			Assert.assertTrue(true);
			System.out.println("Page loaded Successfully");
			//log.info("Login Successfully");
		} catch (Error e) 
		
		{
			System.out.println("======Page not Poaded===");
		}
		//driver.close();
		//driver.switchTo().window(browserTabs.get(0));
	}
	public void newTabOpenAndTitleVerifyAndClose(String title){
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(browserTabs .get(1));
		
		try 
		{
			new WebDriverWait(driver, 20).until(ExpectedConditions.titleContains(title));
			Assert.assertTrue(true);
			System.out.println("Page loaded Successfully");
			//log.info("Login Successfully");
		} catch (Error e) 
		
		{
			System.out.println("======Page not Poaded===");
		}
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
	}
	public ExpectedCondition<Boolean> numberOfWindowsToBe(final int numberOfWindows) {
	    return new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	                driver.getWindowHandles();
	        return driver.getWindowHandles().size() == numberOfWindows;
	      }
	    };
	}
	
	
	public boolean  numberOfWindowsToBe1(CommonHelper helper,int windows)
	{
	
		boolean status=helper.longWait.until(ExpectedConditions.numberOfwindowsToBe(windows));
		
		return status;
	}
	
	
	
	 public void checkAndPrintScrollStatus(){
		  JavascriptExecutor javascript = (JavascriptExecutor) driver;
		  //Check If horizontal scroll Is present or not.
		  Boolean b1 = (Boolean) javascript.executeScript("return document.documentElement.scrollWidth>document.documentElement.clientWidth;");
		  //Check If vertical scroll Is present or not.
		  Boolean b2 = (Boolean) javascript.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight;");
		  if (b1 == true && b2 == true) {
		   System.out.println("Horizontal and vertical Scrollbar is present on page.");
		  } else if (b1 == false && b2 == true) {
		   System.out.println("Horizontal Scrollbar not present on page.");
		   System.out.println("Vertical Scrollbar is present on page.");
		  }else if (b1 == true && b2 == false) {
		   System.out.println("Horizontal Scrollbar Is present on page.");
		   System.out.println("Vertical Scrollbar not present on page.");
		  }else if (b1 == false && b2 == false) {
		   System.out.println("Horizontal and Vertical Scrollbar not present on page.");   
		  }
		  System.out.println("<----------x--------x--------->");
		 } 
		
    
	public void refreshPage()
	{
		driver.navigate().refresh();
	}



}
