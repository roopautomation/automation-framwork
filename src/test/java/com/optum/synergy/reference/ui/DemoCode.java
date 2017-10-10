package com.optum.synergy.reference.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;

public class DemoCode {

	public static void main(String[] args) throws Throwable {
		
		String url="http://ssing281:da0a17fc-d6ec-452c-a095-b2abebacfe49@ondemand.saucelabs.com:80/wd/hub";
		
		
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		
		cap.setCapability("version", "52");
		
		cap.setPlatform(Platform.WIN8);
		
		cap.setCapability("parent-tunnel", "sauce_admin");
		
		cap.setCapability("tunnelIdentifier", "OptumSharedTunnel-Stg");
		
		WebDriver driver=new RemoteWebDriver(new URL(url), cap);
		
		
		driver.get("https://test-populationhealth.optum.com/content/phs/en/phs.html");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
