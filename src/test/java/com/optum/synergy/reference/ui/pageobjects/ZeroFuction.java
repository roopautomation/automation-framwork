package com.optum.synergy.reference.ui.pageobjects;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZeroFuction {
	WebDriver driver;
	@Test
	public  void startingDriver() throws InterruptedException {
		
	System .setProperty("webdriver.gecko.driver", "./GeckoDriver/0.17.0/geckodriver.exe");
		 driver =new FirefoxDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssing281\\Downloads\\Drivers\\chromedriver.exe");
	//WebDriver driver =new ChromeDriver();
		 //driver.get("https://test-populationhealth.optum.com/content/phs/en/phs.html");
		 driver.manage().window().maximize();
	driver.get("https://test-populationhealth.optum.com/content/phs/en/secure/recommended-for-you.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("btn-section-1")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("btn-section-2")).click();
    Thread.sleep(2000);
    
   // public String checkedBoxText(){
    //	String text=null;
    
//    	boolean status=driver.findElement(By.xpath(".//*[@id='checkbox4']")).isSelected();
//    		String	text=driver.findElement(By.xpath(".//*[@id='checkbox4']/following::div[1]/parent::label")).getText();
//    		System.out.println("CheckBox text is >>"+status+"text is >>.."+text);
//    	
    WebElement check=driver.findElement(By.xpath(".//*[@id='checkbox4']"));
		//String text1=null;
		List<WebElement> elementsA=driver.findElements(By.xpath(".//*[@id='mainContent']/div/div[2]/div[1]/div[3]/form/fieldset/div/label"));
		String selectedText =null ;
		for(WebElement eleA:elementsA){
			if(eleA.isSelected()) {
				selectedText=eleA.findElement(By.xpath("./parent::label")).getText();
				
				System.out.println("saved time text >>>>>"+selectedText);
				break;
			}
		}System.out.println("secont text"+selectedText);
//    if (driver.findElement(By.xpath(".//*[@id='checkbox1']")).isSelected()){
//    	text1=driver.findElement(By.xpath(".//*[@id='checkbox1']/following::div[1]/parent::label")).getText();
//		System.out.println("CheckBox text is >>.."+text1);
//    }
//    if (check.isSelected()){
//    	text1=check.findElement(By.xpath("./parent::label")).getText();
//		System.out.println("CheckBox text is box 4  >>.."+text1);
//    }
   // System.out.println("Return text"+text1);
//    driver.findElement(By.id("btn-section-3")).click();
//   // Thread.sleep(2000);
//    WebDriverWait wait =new WebDriverWait(driver, 20);
//	WebElement textbox=driver.findElement(By.xpath(".//*[@id='btn-section-4']/preceding::div[2]/parent::div"));
//	System.out.println(wait.until(ExpectedConditions.visibilityOf(textbox)));
//	//driver.findElement(By.xpath(".//*[@id='mainContent']/div/div[2]/div[2]/form/fieldset/label[4]/div")).click();
//	System.out.println(textbox.isDisplayed());
//	System.out.println("TEXT box is  Displayed ");
//	//driver.findElement(By.id("checkboxemail")).click();
	//System.out.println(driver.findElement(By.id("checkboxemail")).isSelected());
	//Thread.sleep(2000);
	//String indexN=driver.findElement(By.xpath(".//*[@id='testimonial-carousel']/ol/li[1]")).findElement(By.xpath("./a")).getAttribute("data-slide-to");
	//System.out.println("Second circle>>>"+indexN);
	//System.out.println("int value>>"+Integer.parseInt(indexN));
	//driver.findElement(By.id("btn-section-2")).click();
	//Thread.sleep(2000);
	//System.out.println(driver.findElement(By.cssSelector(".pre-call__contact-info.text-left.fade")).isDisplayed());
	//driver.findElement(By.xpath("//*[contains(text(),'Edit')]")).click();
	//Thread.sleep(1000);
	//System.out.println("Phone>>>"+driver.findElement(By.xpath("//*[contains(text(),'Phone')]/following::input")).isDisplayed());
	//System.out.println("DD>>>"+driver.findElement(By.xpath("//*[contains(text(),'Phone')]/following::select")).isDisplayed());
	
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
