package com.optum.synergy.reference.ui.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

public class AuthorRecommendedForYouPageObject extends PageObjectBase {

	public AuthorRecommendedForYouPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
}
	

	@FindBy(how = How.CSS, using = "")
	private WebElement pageHeader;
	

	@FindBy(how = How.LINK_TEXT, using = "")
	private WebElement supportProgram;
	
	@FindBy(how = How.CSS, using = "")
	private WebElement userName;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement trackerHeader;
	
	@FindBy(how = How.CSS, using = ".progress-tracker-bar")
	private WebElement trackerBar;

	@FindBy(how = How.ID, using = "btn-section-1")
	private WebElement rqstCallBtn;
	
	@FindBy(how = How.ID, using = ".//*[@id='btn-section-1']/following::span[1]")
	private WebElement ctcFnctnFld;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement preferdTimePageHeader;
	
	@FindBy(how = How.CSS, using = "")
	private WebElement fstTrackerCrcl;
	

	@FindBy(how = How.LINK_TEXT, using = "")
	private WebElement callBackDetail;
	
	@FindBy(how = How.CSS, using = "")
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

	@FindBy(how = How.CSS, using = "")
	private WebElement secndTrackerCrcl;
	
	@FindBy(how = How.ID, using = "")
	private WebElement cotactInfoPageHeader;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Email address')]/parent::div/following::div[1]")
	private WebElement email;
	
	@FindBy(how = How.LINK_TEXT, using = "//*[contains(text(),'Phone')]/parent::div/following::div[1]")
	private WebElement phone;
	
	@FindBy(how = How.CSS, using = "//*[contains(text(),'Edit')]")
	private WebElement editBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Phone')]/following::input")
	private WebElement phoneField;
	
	@FindBy(how = How.CSS, using = "//*[contains(text(),'Phone')]/following::select")
	private WebElement phonTypeDD;

	@FindBy(how = How.ID, using = "btn-section-3")
	private WebElement nextBtnCotactPage;
	
	@FindBy(how = How.ID, using = "")
	private WebElement thirdTrackerCrcl;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement qustionPageHeader;
	
	@FindBy(how = How.ID, using = "")
	private WebElement emailErrorMsg;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement phonErrorMsg;
	
	
	
	
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
		rqstCallBtn.isDisplayed();
	}
	public void ctcFuctionFieldDisplayed(){
		ctcFnctnFld.isDisplayed();
	}
	
	public void preferedTimePageDisplayed(){
		preferdTimePageHeader.isDisplayed();
	}
	
	public void firstTrackerCircalComplete(){
		
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
    
    public void clickOnNextButtonOfContactPage(){
    	nextBtnCotactPage.click();
	}
    public String preSelectedOptionInPhoneDD(){
    	String selectedOption = new Select(phonTypeDD).getFirstSelectedOption().getText();
    	return selectedOption;
    }
    
    public void secondTrackerCircleCompleted(){
		secndTrackerCrcl.isDisplayed();
	}
	
	public void emailDisplayed(){
		email.isDisplayed();
	}
	public void userPhoneDisplayed(){
		phone.isDisplayed();
	}
    public void clickOnNextButtonOfPreferTimePage(){
    	nextBtnCotactPage.isDisplayed();
	}
    public void thirdTrackerCircalComplete(){
    	thirdTrackerCrcl.isSelected();
	}
    
    public void questionPageDisplayed(){
    	qustionPageHeader.isDisplayed();
	}
			
    public void emailErrorMsgDisplayed(){
    	emailErrorMsg.isSelected();
	}
    
    public void phoneErrorMsgDisplayed(){
    	phonErrorMsg.isDisplayed();
	}
	


	
	
}