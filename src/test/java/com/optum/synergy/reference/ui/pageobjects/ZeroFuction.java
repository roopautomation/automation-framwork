package com.optum.synergy.reference.ui.pageobjects;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZeroFuction {
	WebDriver driver;
	@Test
	public  void startingDriver() throws InterruptedException {
		
	System .setProperty("webdriver.gecko.driver", "./GeckoDriver/0.17.0/geckodriver.exe");
		 driver =new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssing281\\Downloads\\Drivers\\chromedriver.exe");
	//WebDriver driver =new ChromeDriver();
	//driver.get("https://test-populationhealth.optum.com/content/phs/en/phs.html");
	driver.get("https://test-populationhealth.optum.com/content/phs/en/secure/recommended-for-you.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("btn-section-1")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btn-section-2")).click();
	Thread.sleep(2000);
	//System.out.println(driver.findElement(By.cssSelector(".pre-call__contact-info.text-left.fade")).isDisplayed());
	driver.findElement(By.xpath("//*[contains(text(),'Edit')]")).click();
	Thread.sleep(1000);
	System.out.println("Phone>>>"+driver.findElement(By.xpath("//*[contains(text(),'Phone')]/following::input")).isDisplayed());
	System.out.println("DD>>>"+driver.findElement(By.xpath("//*[contains(text(),'Phone')]/following::select")).isDisplayed());
	
	/*WebElement trackBar=driver .findElement(By.cssSelector(".progress-tracker-bar"));
     List<WebElement> noOfCircle= trackBar.findElements(By.xpath(".//li[contains(@class,'complete')]"));
     System.out.println("zero>>>>"+noOfCircle.size());
     for(int i=0;i<noOfCircle.size();i++){
 		System.out.println("zero>>>>"+noOfCircle.indexOf(i+1));
	
     }
	driver.findElement(By.id("btn-section-1")).click();
	Thread.sleep(2000);
	WebElement trackBar1=driver .findElement(By.cssSelector(".progress-tracker-bar"));
    List<WebElement> noOfCircle1= trackBar1.findElements(By.xpath(".//li[contains(@class,'complete')]"));
    Assert.assertEquals(1,noOfCircle1.size());
	System.out.println("first>>>>"+noOfCircle1.size());
	for(int j=0;j<noOfCircle1.size();j++){
		System.out.println("first>>>>"+noOfCircle1.indexOf(j+1));
	}
	Thread.sleep(3000);
	driver.findElement(By.id("btn-section-2")).click();
	Thread.sleep(2000);
	WebElement trackBar2=driver .findElement(By.cssSelector(".progress-tracker-bar"));
    List<WebElement> noOfCircle2= trackBar2.findElements(By.xpath(".//li[contains(@class,'progress')]//span")); 
	System.out.println("two>>>>"+noOfCircle2.size());
	for(int pl=0;pl<noOfCircle2.size();pl++){
		System.out.println("two>>>>"+noOfCircle2.indexOf(pl+1));
		System.out.println(noOfCircle2.get(pl).getAttribute("class"));
	}
	
	*/
	}
}