package com.optum.synergy.reference.ui.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;



public class AuthorRecommendedForYouPageObject extends PageObjectBase {

	public AuthorRecommendedForYouPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
}
	

	@FindBy(how = How.CSS, using = ".pre-call__heading")
	private WebElement pageHeader;
	

	@FindBy(how = How.LINK_TEXT, using = "")
	private WebElement supportProgram;
	
	@FindBy(how = How.CSS, using = "")
	private WebElement userName;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='mainContent']/div/div[2]/div[1]/span[1]")
	private WebElement trackerHeader;
	
	@FindBy(how = How.CSS, using = ".progress-tracker-bar")
	private WebElement trackerBar;

	@FindBy(how = How.ID, using = "btn-section-1")
	private WebElement rqstCallBtn;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-1']/following::span[1]")
	private WebElement ctcFnctnFld;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement preferdTimePageHeader;
	

	@FindBy(how = How.CSS, using = ".pre-call__call-back-details.ng-binding")
	private WebElement callBackDetail;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-2']//parent::form")
	private WebElement timeFramCheckBox;
	
	@FindBy(how = How.ID, using = "checkbox1")
	private WebElement anyTimeCheckBox;
	
	@FindBy(how = How.ID, using = "checkbox2")
	private WebElement morningTimeCheckBox;
	
	@FindBy(how = How.ID, using = "checkbox3")
	private WebElement afternoonTimeCheckBox;
	
	@FindBy(how = How.ID, using = "checkbox4")
	private WebElement eveningTimeCheckBox;
	
	@FindBy(how = How.ID, using = "btn-section-2")
	private WebElement nextBtnPrefTime;
	
	@FindBy(how = How.CSS, using = ".pre-call__contact-info.text-left.fade")
	private WebElement cotactInfoSection;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Email address')]/parent::div/following::div[1]")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Phone')]/parent::div/following::div[1]")
	private WebElement phone;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Edit')]")
	private WebElement editBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Phone')]/following::input")
	private WebElement phoneField;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Phone')]/following::select")
	private WebElement phonTypeDD;

	@FindBy(how = How.ID, using = "btn-section-3")
	private WebElement nextBtnCotactPage;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-4']/preceding::textarea/parent::div")
	private WebElement qustionSection;
	
	@FindBy(how = How.ID, using = "")
	private WebElement emailErrorMsg;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement phonErrorMsg;
	
	
	public void launchRecommendedPage(){
		driver.get("https://test-populationhealth.optum.com/content/phs/en/secure/recommended-for-you.html");
	}
	
	public void pageHeaderDisplayed(){
	pageHeader.isDisplayed();
	
	}
	public void supportProgramDisplayed(){
	supportProgram.isDisplayed();
	}
	public void userNameDisplayed(){
		userName.isDisplayed();
	}
	public void requestCallButtonDisplayed(){
		rqstCallBtn.isDisplayed();
	}
	public void clickRequestCallButton(){
		rqstCallBtn.click();
	}
	public void ctcFuctionFieldDisplayed(){
		ctcFnctnFld.isDisplayed();
	}
	
	public void preferedTimePageDisplayed(){
		timeFramCheckBox.isDisplayed();
	}
	public void recommendedPageTitleVerify(String title){
		helper.varifyPageTitle(title);
	}
	
	public void firstTrackerCircalComplete(){
		List<WebElement> noOfCircle1= trackerBar.findElements(By.xpath(".//li[contains(@class,'complete')]"));
		Assert.assertEquals(1,noOfCircle1.size());
		
	}
	public void trackerBarDispalyed(){
		trackerBar.isDisplayed();
	}
	public void callBackDeatailDisplayed(){
		callBackDetail.isDisplayed();
	}
    public void timeFramCheckBox(){
    	timeFramCheckBox.isDisplayed();
	}
    public void anyTimeCheckBoxDefaultSelected(){
    	anyTimeCheckBox.isSelected();
	}
    public void anyTimeCheckBoxIsNotSelected(){
    	Assert.assertFalse(anyTimeCheckBox.isSelected());
	}  
    
    public void clickOnMorningTimeCheckbox(){
    	morningTimeCheckBox.click();
	}
    public void clickOnAfternoonCheckbox(){
    	afternoonTimeCheckBox.click();
	}
    public void clickOnEveningTimeCheckbox(){
    	eveningTimeCheckBox.click();
	}
    public void eveningTimeCheckboxIsNotChecked(){
    	eveningTimeCheckBox.isSelected();
    }
    public void afternoonTimeCheckboxIsNotChecked(){
    	afternoonTimeCheckBox.isSelected();
    }
    public String defaultSelectedOptionInPhoneDD(){
    	String selectedOption = new Select(phonTypeDD).getFirstSelectedOption().getText();
    	return selectedOption;
    }
    
    public void secondTrackerCircleCompleted(){
    	List<WebElement> noOfCircle= trackerBar.findElements(By.xpath(".//li[contains(@class,'complete')]"));
		Assert.assertEquals(2,noOfCircle.size());
	}
    public boolean contactInfoSectionDisplayed(){
    	return cotactInfoSection.isDisplayed();
    }
	
	public void emailDisplayed(){
		email.isDisplayed();
	}
	public void PhoneDisplayed(){
		phone.isDisplayed();
	}
    public void clickOnNextButtonOfPreferTimePage(){
    	nextBtnPrefTime.click();
	}
    public void thirdTrackerCircalComplete(){
    	List<WebElement> noOfCircle= trackerBar.findElements(By.xpath(".//li[contains(@class,'complete')]"));
		Assert.assertEquals(3,noOfCircle.size());
	}
			
    public void emailErrorMsgDisplayed(){
    	emailErrorMsg.isSelected();
	}
    
    public void phoneErrorMsgDisplayed(){
    	phonErrorMsg.isDisplayed();
	}
    public void clickOnEditLink(){
    	editBtn.click();
    }
	public boolean phoneFieldDisplayed(){
		return phoneField.isDisplayed();
	}
	public boolean phoneTypeDropdownFieldDisplayed(){
		return phonTypeDD.isDisplayed();
	}
	public void clickOnContactInfoNextBtn(){
		nextBtnCotactPage.click();
	}
public void questionSectionDisplayed(){
	qustionSection.isDisplayed();
}
	
	
}