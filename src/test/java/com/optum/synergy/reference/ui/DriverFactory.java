package com.optum.synergy.reference.ui;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.optum.synergy.reference.ui.pageobjects.PageObjectBase;

import cucumber.deps.com.thoughtworks.xstream.InitializationException;

public class DriverFactory {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	private final static String DEFAULT_BROWSERTYPE = "FIREFOX";
	private final static String DEFAULT_BROWSERVERSION = "52";
	private final static String DEFAULT_BROWSERENV = "saucelab";
	// TODO: Find a better choice of default SauceLabs credentials
	private final static String DEFAULT_SAUCE_USER = "rtripa1";
	private final static String DEFAULT_SAUCE_ACCESSKEY = "2eba6f36-0e3e-434d-9ea5-80374080cb92";

	/**
	 * Method to return driver instance for current thread. If one is not set,
	 * create a new driver from system property configuration.
	 * 
	 * @return Current thread's driver instance or newly created driver
	 * @throws MalformedURLException
	 *             If invalid SauceLabs URL is built
	 */
	public static WebDriver createAndGetDeviceDriver() throws MalformedURLException {

		if (driver.get() != null) {
			return driver.get();
		}

		// Retrieve desired browser configuration from system properties
		String BrowserVersion = System.getProperty("BrowserVersion");
		;
		String BrowserType = System.getProperty("BrowserType");
		String browserEnv = System.getProperty("BrowserEnv");   // local browser or sauceLabs browser
		String sauceUsername = System.getenv("SAUCE_USERNAME");
		String saucePassword = System.getenv("SAUCE_ACCESS_KEY");

		if (BrowserVersion == null) {
			BrowserVersion = DEFAULT_BROWSERVERSION;
		}
		if (BrowserType == null) {
			BrowserType = DEFAULT_BROWSERTYPE;
		}
		if (browserEnv == null) {
			browserEnv = DEFAULT_BROWSERENV;
		}

		if (browserEnv.equals("saucelab") && (sauceUsername == null || saucePassword == null)) {
			sauceUsername = DEFAULT_SAUCE_USER;
			saucePassword = DEFAULT_SAUCE_ACCESSKEY;
		}

		if (browserEnv.equalsIgnoreCase("saucelab")) {
			DesiredCapabilities capabilities = null;

			if (BrowserType.equalsIgnoreCase("IE")) {
				capabilities = DesiredCapabilities.internetExplorer();
			} else if (BrowserType.equalsIgnoreCase("CHROME")) {
				capabilities = DesiredCapabilities.chrome();
			} else if (BrowserType.equalsIgnoreCase("FIREFOX")) {
				capabilities = DesiredCapabilities.firefox();
			} else if (BrowserType.equalsIgnoreCase("SAFARI")) {
				capabilities = DesiredCapabilities.safari();
			} else {
				throw new IllegalArgumentException("Unsupported Platform/Browser Configuration " + BrowserType);
			}

			String URL = "http://" + sauceUsername + ":" + saucePassword + "@ondemand.saucelabs.com:80/wd/hub";
			// TODO Re-assess sauceLab timeouts...
			capabilities.setCapability("platform", "Windows 7");
			capabilities.setCapability("version", BrowserVersion);
			capabilities.setCapability("maxDuration", 2700);
			capabilities.setCapability("avoidProxy", true);
			capabilities.setCapability("autoAcceptAlerts", true);
			capabilities.setCapability("parent-tunnel", "sauce_admin");
			capabilities.setCapability("tunnelIdentifier", "OptumSharedTunnel-Stg");
			capabilities.setCapability("recordVideo", true);
			capabilities.setCapability("recordScreenshots", true);
			capabilities.setCapability("idleTimeout", 120);
			capabilities.setCapability("commandTimeout", 240);
			capabilities.setCapability("screenResolution", "1280x768");

			setDriver(new RemoteWebDriver(new URL(URL), capabilities));
			System.out.println("Play job in saucelab: " + "https://saucelabs.com/beta/tests/"
					+ ((RemoteWebDriver) driver.get()).getSessionId().toString());

		} else {
			// Instantiate local browser
			if (BrowserType.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "lib" + File.separator + "IEDriverServer.exe");
				setDriver(new InternetExplorerDriver());
			} else if (BrowserType.equalsIgnoreCase("FIREFOX")) {
				/*
				 * Update for Selenium 3.4.0: Selenium 3.x requires a standalone
				 * "geckodriver" executable to use firefox. For FF48 and later,
				 * need to set "marionette" capability as 'true' otherwise
				 * 'false'
				 */
				DesiredCapabilities capabilities = new DesiredCapabilities();
				boolean isMarionette = true;
				if (Integer.parseInt(BrowserVersion) < 47) {
					isMarionette = false;
				}
				capabilities.setCapability("marionette", isMarionette);
				System.setProperty("webdriver.gecko.driver", "GeckoDriver" + File.separator + "0.17.0" + File.separator + "geckodriver.exe");
				
				setDriver(new FirefoxDriver(capabilities));
			} else {
				throw new IllegalArgumentException("Unsupported Local Browser " + BrowserType);
			}

		}

		driver.get().manage().deleteAllCookies();
		
		// Initialize threadLocal instances of wait objects with new driver
		// instance
//		PageObjectBase.smallWait.set(new WebDriverWait(getDeviceDriver(), PageObjectBase.SMALL_WAIT_TIME));
//		PageObjectBase.mediumWait.set(new WebDriverWait(getDeviceDriver(), PageObjectBase.MEDIUM_WAIT_TIME));
//		PageObjectBase.longWait.set(new WebDriverWait(getDeviceDriver(), PageObjectBase.LONG_WAIT_TIME));

		return getDeviceDriver();
	}

	/**
	 * 
	 * @return driver object for current execution thread
	 * @throws InitializationException
	 *             If browser has not been set
	 */
	public static WebDriver getDeviceDriver() throws InitializationException {

		if (driver.get() != null) {
			return driver.get();
		}

		throw new InitializationException("Browser Driver Not Initialized");
	}

	/**
	 * 
	 * @param inputDriver
	 *            Driver object to store in ThreadLocal<WebDriver>
	 */
	private static void setDriver(WebDriver inputDriver) {
		driver.set(inputDriver);
	}

	/**
	 * Closes driver for current thread, sets current thread driver to null.
	 * 
	 * @return true if driver shut down, otherwise false.
	 */
	public static boolean closeDeviceDriver() {

		try {
			WebDriver currentDriver = getDeviceDriver();
			if (currentDriver != null) {
				setDriver(null);
				currentDriver.quit();
			}
			return getDeviceDriver() == null;
		} catch (InitializationException e) {
			return true;
		}
	}
}
