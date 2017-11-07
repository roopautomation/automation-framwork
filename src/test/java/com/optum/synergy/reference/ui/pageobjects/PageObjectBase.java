package com.optum.synergy.reference.ui.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.optum.synergy.common.ui.controller.WebController;
import com.optum.synergy.reference.ui.DriverFactory;

public class PageObjectBase {

	private static List<String> pathList = new ArrayList<String>();
	private static String json;
	private static Map<String, String> map = new HashMap<String, String>();

	protected String pageTitle;
	protected String pageUrl;
	public WebDriverWait smallWait;
	public WebDriverWait mediumWait;
	public WebDriverWait longWait;
	
public String uuid="";
	public static final String USERNAME = System.getenv("SAUCE_USERNAME");
	public static final String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
	public static final String SAUCE_URL = "http://" + "ssing281" + ":" + "da0a17fc-d6ec-452c-a095-b2abebacfe49"
			+ "@ondemand.saucelabs.com:80/wd/hub";

	// TODO: Refactor to use default or system variable
	protected static final String CONFIG_FILE_RELATIVE_PATH = "src/main/resources/ui/config/config_broser.json";
	/* "/src/main/resources/ui/config/config.json"; */

	protected CommonHelper helper;

	public static WebDriver driver;

	public PageObjectBase() {
		try {
			if (driver == null) {
				/*driver = createLocalDriver();
				driver.manage().window().maximize();*/
				System .setProperty("webdriver.gecko.driver", "./GeckoDriver/0.17.0/geckodriver.exe");
				//driver =WebController.createAndGetDeviceDriver(CONFIG_FILE_RELATIVE_PATH);
				//driver=BrowserFactory.getBrowserOnCloud();
				driver = DriverFactory.createAndGetDeviceDriver();
				System.out.println("Running Page Object Class");
				//System.out.println("Driver value is "+driver);
					
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//WebController.maximizeWindow();
			
				//driver.manage().deleteAllCookies();
				
				//System.out.println(getSystemVariable("environment.type"));
				//Following method will delete all the screenshots in taget folder
			/*	File index = new File("target\\screenshots");
				String[]entries = index.list();
				for(String s: entries){
				    File currentFile = new File(index.getPath(),s);
				    currentFile.delete();
				}
				*/
				
			}
			
			smallWait = new WebDriverWait(driver, 10);
			mediumWait = new WebDriverWait(driver, 30);
			longWait = new WebDriverWait(driver, 60);
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
e.printStackTrace();
		}

	}
	 public void waitForPageLoad(WebDriver driver) {
	        ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	                };
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(pageLoadCondition);
	    }

	public static String getSystemProperty(String key) throws IOException {

		Properties props = new Properties();
		InputStream inputStream = new FileInputStream(new File("System.properties").getAbsolutePath());
		props.load(inputStream);
		// System.out.println(props.getProperty("environment.type"));
		return props.getProperty(key);

	}

	
	// this method will read value from config file and will return value 
	public static String getSystemVariable(String variableName) throws IOException
	{
		FileInputStream fileInputStream = null;
		String requiredValue = "";
		StringBuffer stringBuffer = new StringBuffer("");
		try {

			fileInputStream = new FileInputStream("src/main/resources/ui/config/config_system.json");
			int i;
			while ((i = fileInputStream.read()) != -1) {
				stringBuffer.append((char) i);
			}
			json = stringBuffer.toString();

			JSONObject object = new JSONObject(json);
			String jsonPath = "";
			/* getSystemProperty("environment.type"); */
			readObject(object, jsonPath);
			requiredValue= map.get(variableName);
			//System.out.println(map.get(variableName));
		} catch (Exception e) {
			// LoggerUtil.printStackTrace(e);
		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
		}
		return requiredValue;

	}

	public static String getEnvVariable(String jsonVariablePath) throws IOException {
		FileInputStream fileInputStream = null;
		String requiredValue = "";
		StringBuffer stringBuffer = new StringBuffer("");
		try {

			fileInputStream = new FileInputStream("src/main/resources/ui/config/config_environment.json");
			int i;
			while ((i = fileInputStream.read()) != -1) {
				stringBuffer.append((char) i);
			}
			json = stringBuffer.toString();

			requiredValue = getEnvironmentProperty(jsonVariablePath);
		} catch (Exception e) {
			// LoggerUtil.printStackTrace(e);
		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
		}
		return requiredValue;

	}

	/*
	 * public List<String> getPathList() { return this.pathList; }
	 */
	public static String getEnvironmentProperty(String propertyPath)
			throws FileNotFoundException, IOException, ParseException {
		// JSONParser parser = new JSONParser();
		// Object obj = parser.parse(new
		// FileReader("src/main/resources/ui/config/test.json"));
		JSONObject object = new JSONObject(json);
		String jsonPath = "";
		/* getSystemProperty("environment.type"); */
		readObject(object, jsonPath);
		System.out.println(map.get(getSystemVariable("environment.type") + "." + propertyPath));
		return map.get(getSystemVariable("environment.type") + "." + propertyPath);
	}

	/*
	 * private void setJsonPaths(String json) { this.pathList = new
	 * ArrayList<String>(); JSONObject object = new JSONObject(json); String
	 * jsonPath = "$"; if(json != JSONObject.NULL) { readObject(object,
	 * jsonPath); } }
	 */

	private static void readObject(JSONObject object, String jsonPath) {
		Iterator<String> keysItr = object.keys();
		String parentPath = jsonPath;
		while (keysItr.hasNext()) {
			String key = keysItr.next();
			Object value = object.get(key);
			if (parentPath != "")
				jsonPath = parentPath + "." + key;
			else if (parentPath == "")
				jsonPath = parentPath + key;

			if (value instanceof JSONArray) {
				readArray((JSONArray) value, jsonPath);
			} else if (value instanceof JSONObject) {
				readObject((JSONObject) value, jsonPath);
			} else { // is a value
				pathList.add(jsonPath);
				// System.out.println(jsonPath);
				map.put(jsonPath, (String) value);
			}
		}
	}

	private static void readArray(JSONArray array, String jsonPath) {
		String parentPath = jsonPath;
		for (int i = 0; i < array.length(); i++) {
			Object value = array.get(i);
			jsonPath = parentPath + "[" + i + "]";

			if (value instanceof JSONArray) {
				readArray((JSONArray) value, jsonPath);
			} else if (value instanceof JSONObject) {
				readObject((JSONObject) value, jsonPath);
			} else { // is a value
				pathList.add(jsonPath);
				// System.out.println(jsonPath);
				map.put(jsonPath, (String) value);
			}
		}
	}


}
