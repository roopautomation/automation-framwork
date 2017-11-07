package com.optum.synergy.reference.ui.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;



public class AuthorRecommendedForYouPageObject extends PageObjectBase {

	public AuthorRecommendedForYouPageObject(CommonHelper helper) {
		PageFactory.initElements(driver, this);
		helper.driver = driver;
		this.helper = helper;		
}
	

	@FindBy(how = How.XPATH, using = ".//div[text()='Health Support for']")
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
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-3']/parent::form")
	private WebElement timeFramCheckBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox1']/following::div[1]")
	private WebElement anyTimeCheckBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox2']/following::div[1]")
	private WebElement morningTimeCheckBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox3']/following::div[1]")
	private WebElement afternoonTimeCheckBox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox4']/following::div[1]")
	private WebElement eveningTimeCheckBox;
	
	// check box using for iteration selecting by IDs
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox1']")
	private WebElement anyTime;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox2']")
	private WebElement morningTime;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox3']")
	private WebElement afternoonTime;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkbox4']")
	private WebElement eveningTime;
	
	
	@FindBy(how = How.ID, using = "btn-section-3")
	private WebElement nextBtnPrefTime;
	
	@FindBy(how = How.CSS, using = ".pre-call__contact-info.text-left.fade")
	private WebElement cotactInfoSection;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkboxemail']/following::div[2]//span")
	private WebElement email;
	
	@FindBy(how = How.ID, using="checkboxemail")
	private WebElement sendEmailBtn;
	
	@FindBy(how = How.ID, using = "errmsg-phone-invalid")
	private WebElement phoneErrorMsg;
	
	@FindBy(how = How.XPATH, using=".//*[@id='checkboxemail']/following::div[1]/following::a[1]")
	private WebElement editEmailLink;
	
	@FindBy(how = How.ID, using = "errmsg-email-invalid")
	private WebElement emailErrorMsg;
	
	@FindBy(how = How.ID, using = "errmsg-email-match")
	private WebElement emailNotMatchErrorMsg;
	
	@FindBy(how = How.XPATH, using=".//*[@id='checkboxemail']/following::input[2]")
	private WebElement confirmEmailField;
	
	@FindBy(how = How.ID, using = "errmsg-confemail-invalid")
	private WebElement confirmEmailErrorMsg;
	
	@FindBy(how = How.XPATH, using=".//*[@id='checkboxemail']/following::input[1]")
	private WebElement emailField;
	
	@FindBy(how = How.XPATH, using=".//*[@id='btn-section-2']/preceding::input[1]")
	private WebElement cofirmEmailField;
	
	@FindBy(how = How.XPATH, using=".//*[@id='checkboxemail']/following::input[1]/following::span[1]")
	private WebElement emailGreenCheck;
	
	@FindBy(how = How.XPATH, using=".//*[@id='btn-section-2']/preceding::input[1]/following::span[1]")
	private WebElement confirmEmailGreenCheck;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkboxemail']/preceding::a[1]")
	private WebElement phoneEditLink;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkboxemail']/following::div[1]/preceding::input[2]")
	private WebElement phoneField;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkboxemail']/following::div[1]/preceding::select")
	private WebElement phonTypeDD;

	@FindBy(how = How.ID, using = "btn-section-2")
	private WebElement nextBtnCotactPage;
	
	@FindBy(how = How.ID, using = "btn-section-4")
	private WebElement finishBtnQuestionPage;
	
	@FindBy(how = How.CSS, using = ".pre-call__questions-heading")
	private WebElement prCallSectionHeader;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-4']/preceding::textarea/parent::div")
	private WebElement questionSection;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-4']/preceding::textarea[3]")
	private WebElement questionAnsBox1;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-4']/preceding::textarea[2]")
	private WebElement questionAnsBox2;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='btn-section-4']/preceding::textarea[1]")
	private WebElement questionAnsBox3;
	
	
	@FindBy(how=How.CSS,using=".pre-call__confirmation")
	private WebElement confirmationPage;
	
	@FindBy(how=How.LINK_TEXT,using="Show more")
	private WebElement showMore;
	
	@FindBy(how=How.XPATH,using=".//div[@class='form-group']/span[1]")
	private WebElement savedPhoneType;
	
	@FindBy(how=How.XPATH,using=".//div[@class='form-group']/span[2]")
	private WebElement savedPhoneNumber;
	
	@FindBy(how=How.CSS,using=".form-group.ng-binding")
	private WebElement savedEmail;
	
	@FindBy(how=How.XPATH,using=".//div[@class='form-group']/a")
	private WebElement phoneNumTypeLink;
	
	@FindBy(how=How.XPATH,using=".//a[@class='btn btn-primary']/parent::div/preceding::div[5]/textarea[1]")
	private WebElement savedAnsText1;
	
	@FindBy(how=How.CSS,using=".detail-container")
	private WebElement detailPage;


	
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
		smallWait.until(ExpectedConditions.visibilityOf(rqstCallBtn)).click();
	}
	public void ctcFuctionFieldDisplayed(){
		ctcFnctnFld.isDisplayed();
	}
	
	public boolean preferedTimePageDisplayed(){
		return timeFramCheckBox.isDisplayed();
	}
	public void recommendedPageTitleVerify(String title){
		helper.varifyPageTitle(title);
	}
	
	public void firstTrackerCircalComplete(){
		List<WebElement> noOfCircle1= trackerBar.findElements(By.xpath(".//li[contains(@class,'--complete')]"));
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
    	Assert.assertTrue("Any time checkbox is not default selected",anyTimeCheckBox.isSelected());
	}
    public void anyTimeCheckBoxIsNotSelected(){
    	Assert.assertFalse(anyTimeCheckBox.isSelected());
	}  
    
    public void clickOnMorningTimeCheckbox(){
    	smallWait.until(ExpectedConditions.visibilityOf(morningTimeCheckBox)).click();
	}
    public void clickOnAfternoonCheckbox(){
    	smallWait.until(ExpectedConditions.visibilityOf(afternoonTimeCheckBox)).click();
	}
    public void clickOnEveningTimeCheckbox(){
    	smallWait.until(ExpectedConditions.visibilityOf(eveningTimeCheckBox)).click();
	}
    public void clickPreferredTimeCheckBoxAs(String time){
    	//String Time=time;
    	if("Mornings".equalsIgnoreCase(time)){
    		morningTimeCheckBox.click();
    	}
    	 if("Afternoons".equalsIgnoreCase(time)){
    		afternoonTimeCheckBox.click();
    	}
    	 if("Evenings".equalsIgnoreCase(time)){
    		eveningTimeCheckBox.click();
    	} 
    	 else if("Anytimes".equalsIgnoreCase(time)){
    		anyTimeCheckBox.click();
    	
    	 }
    		else {
    			System.out.println("No Preferred time is selected");
    	} 
    	 
    }
    public String checkedBoxText(){
    	String text=null;
    	if(driver.findElement(By.xpath(".//*[@id='checkbox4']")).isSelected()){
    		text=driver.findElement(By.xpath(".//*[@id='checkbox4']/following::div[1]/parent::label")).getText();
    	}
		return text;
    	
    }
    
	public String preferredSelectedTime() throws InterruptedException{
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("(//form[contains(@class,'pre-call__form')])[2]//fieldset//div//input[@aria-checked='true']//..")).getText();
		System.out.println("Text from portal is "+text);
//		List<WebElement> elementsA=driver.findElements(By.xpath(".//*[@id='mainContent']/div/div[2]/div[1]/div[3]/form/fieldset/div/label/input"));
//		String selectedText =null ;
//		for(WebElement eleA:elementsA){
//			if(eleA.isSelected()) {
//				selectedText=eleA.findElement(By.xpath("./parent::label")).getText();
//				
//				System.out.println("saved time text >>>>>"+selectedText);
//				break;
//			}
//		}System.out.println("secont text"+selectedText);
		return text;
		
	}
    public boolean sendEmailCheckBoxIsDafaultSelected(){
    	 return smallWait.until(ExpectedConditions.elementToBeSelected(sendEmailBtn));
    			
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
    public void selectPhoneTypeAS(String phoneType){
    	Select select = new Select(phonTypeDD);
    	//select.deselectAll();
    	select.selectByVisibleText(phoneType);
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	new Actions(driver).sendKeys(Keys.TAB).build().perform();
    	
    }
    
    public void secondTrackerCircleCompleted(){
    	List<WebElement> noOfCircle= trackerBar.findElements(By.xpath(".//li[contains(@class,'--complete')]"));
		Assert.assertEquals(2,noOfCircle.size());
	}
    public boolean contactInfoSectionDisplayed(){
    	return cotactInfoSection.isDisplayed();
    }
	
	public boolean emailDisplayed(){
		return email.isDisplayed();
	}
	
    public void clickOnNextButtonOfPreferTimePage(){
    	nextBtnPrefTime.click();
    	
	}
    public void thirdTrackerCircalComplete(){
    	List<WebElement> noOfCircle= trackerBar.findElements(By.xpath(".//li[contains(@class,'--complete')]"));
    	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+noOfCircle.size());
		Assert.assertEquals(3,noOfCircle.size());
	}
			
    public boolean emailErrorMsgDisplayed(){
    	return emailErrorMsg.isDisplayed();
	}
    public String errorTextOFEmail(){
    	return emailErrorMsg.getText();
    }
    public boolean confirmEmailErrorMsgDisplayed(){
    	return confirmEmailErrorMsg.isDisplayed();
	}
    public boolean emailNotMatchingErrorMsgDisplayed(){
    	return emailNotMatchErrorMsg.isDisplayed();
	}
    
    public boolean phoneErrorMsgDisplayed(){
    	smallWait.until(ExpectedConditions.visibilityOf(phoneErrorMsg));
    	return phoneErrorMsg.isDisplayed();
	}
    public void clickOnEditPhoneLink(){
    	smallWait.until(ExpectedConditions.visibilityOf(phoneEditLink)).click();
    }
    public void typePhoneNumber(String phNumber) throws InterruptedException{
    	//mediumWait.until(ExpectedConditions.visibilityOf(phoneField));
    	Thread.sleep(1000);
    	phoneField.clear();
    	Thread.sleep(1000);
    	phoneField.click();
    	
    	/*Thread.sleep(2000);
    	Actions act = new Actions(driver);
    	for(int i=0;i<phoneField.getText().length();i++)
	    	{
	    	act.sendKeys(Keys.BACK_SPACE);
	    	}
	    	act.build().perform();
    	act.release();*/
    
    	
   // 	System.out.println("Action started");
//    	
//    	Thread.sleep(3000);
//   	
//    	Actions act=new Actions(driver);
//    	
//    	
//    	
//    	Thread.sleep(2000);
//		
//		act.sendKeys(Keys.chord(Keys.CONTROL),"a").build().perform();
//		
//		Thread.sleep(2000);
//	
//		act.sendKeys(Keys.DELETE).build().perform();
		
//		System.out.println("Action closed");
		
//		Thread.sleep(2000);
		
    	phoneField.sendKeys(phNumber);
    	
    	
    }
    public void clearPhoneField(){
    	phoneField.clear();
    }
    
	public boolean phoneFieldDisplayed(){
		return phoneField.isDisplayed();
	}
	public boolean phoneTypeDropdownFieldDisplayed(){
		return phonTypeDD.isDisplayed();
	}
	 public void clickOnEditEmailLink(){
	    	smallWait.until(ExpectedConditions.visibilityOf(editEmailLink)).click();
    }
	 public void typeEmailAddress(String email){
		 smallWait.until(ExpectedConditions.visibilityOf(emailField)).clear();
		 emailField.sendKeys(email); 
	 }
	 public void typeConfirmEmailAddress(String confirmEmail){
		 confirmEmailField.clear();
		 confirmEmailField.sendKeys(confirmEmail);
	 }
	 public boolean emailAddressFieldDisplayed(){
		return emailField.isDisplayed();
	 }
	 public boolean confirmEmailAddressFieldDisplayed(){
		// smallWait.until(ExpectedConditions.visibilityOf(confirmEmailField));
		 return confirmEmailField.isDisplayed();
	 }
	 public boolean emailGreenCheckMarkDisplayed(){
		return emailGreenCheck.isDisplayed();
	 }
	 public void confirmEmailGreenCheckMarkDisplayed(){
		 confirmEmailGreenCheck.isDisplayed();
	 }
	public void clickOnContactInfoNextBtn(){
		
		nextBtnCotactPage.click();
	}
	public void preCallSectionHeaderDisplayed(){
		prCallSectionHeader.isDisplayed();
	}
    public boolean questionSectionDisplayed(){
    	mediumWait.until(ExpectedConditions.visibilityOf(questionSection));
	return questionSection.isDisplayed();
    }
    public void enterTextInFirstTextBox(String answerText){
    	questionAnsBox1.clear();
	    questionAnsBox1.sendKeys(answerText);
    }
    public void enterTextInSecondTextBox(String answerText){
    	questionAnsBox2.clear();
    	questionAnsBox2.sendKeys(answerText);
    }
    public void enterTextInThirdTextBox(String answerText){
    	questionAnsBox3.clear();
    	questionAnsBox3.sendKeys(answerText);
    }
    public void clickOnFinishButton() throws Throwable{
    	finishBtnQuestionPage.click();
    	Thread.sleep(1000);
    }
    public boolean confirmationPageDisplayed(){
    	return confirmationPage.isDisplayed();
    }
    public void clickOnShowMoreLink(){
    	showMore.click();
    }
    public boolean detailPageDisplayed(){
    	return detailPage.isDisplayed();
    }
    public String savedPhoneType(){
		return savedPhoneType.getText();	
    }
    public String savedPhoneNumber(){
		return savedPhoneNumber.getText();	
    }
    public String savedEmail(){
		return savedEmail.getText();	
    }
    public boolean phoneEditLinkDisplayed(){
    	return phoneNumTypeLink.isDisplayed();
    }
	public String savedAnswerOneText(){
	
		return savedAnsText1.getText();
	}
	
    
    
    
}