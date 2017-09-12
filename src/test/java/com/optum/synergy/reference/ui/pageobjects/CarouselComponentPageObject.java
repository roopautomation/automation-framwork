package com.optum.synergy.reference.ui.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CarouselComponentPageObject extends PageObjectBase {

	public CarouselComponentPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
}
	

	@FindBy(how = How.ID, using = "testimonial-carousel")
	private WebElement caroselComponent;
	

	@FindBy(how = How.CSS, using = ".right.carousel-control.hidden-xs")
	private WebElement rightCarouselControlCaret;
	

	@FindBy(how = How.CSS, using = ".left.carousel-control.hidden-xs")
	private WebElement leftCarouselControlCaret;
	
	public void scroolToCarouselSection(){
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", caroselComponent);
	}
	public void clickOnRightCarouselCaret(){
		rightCarouselControlCaret.click();
	}
    public void clickOnLeftCarouselCaret(){
    	leftCarouselControlCaret.click();
	}
    public void accessRightCarouselCaretsWithTABandENTER(){
		rightCarouselControlCaret.sendKeys(Keys.TAB);
		rightCarouselControlCaret.sendKeys(Keys.ENTER);
	}
    
    public void accessLeftCarouselCaretsWithTABandENTER(){
    	leftCarouselControlCaret.sendKeys(Keys.TAB);
    	leftCarouselControlCaret.sendKeys(Keys.ENTER);
	}
	public int slidingIndicatorPosition(){
		List<WebElement> elementsA=driver.findElements(By.cssSelector(".carousel-indicators>li"));
		int indexA = -1;
		for(WebElement eleA:elementsA){
			if(eleA.getAttribute("class").contains("active")) {
				indexA = Integer.parseInt(eleA.getAttribute("data-slide-to"));
				break;
			}
			
	}
		return indexA;
	}

	
	
}