package com.optum.synergy.reference.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.optum.synergy.reference.ui.pageobjects.PageObjectBase;

public class SyncLibrary extends PageObjectBase {

	public static void numberOfWindows(int time, int countWindows) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.numberOfwindowsToBe(countWindows));

	}
	

	public static void elementPresence(WebElement element,int time)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
