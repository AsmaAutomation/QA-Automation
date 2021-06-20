package com.orangeHRM.e2eTests.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {
	
	public static WebDriver driver;
	static DriverManager driverManager;
	
	@Before
	/**
	 * Call  browser with the design pattern factory navigator 
	 */
	public static void setup() {
		
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
	}
	
	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			try {
				scenario.write("Current page url is: " +driver.getCurrentUrl());
				byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenShot, "image/png");
			}catch(WebDriverException somePlateformDontSupportScreenshot) {
				System.err.println(somePlateformDontSupportScreenshot.getMessage());
			}
		}
		
		driver.quit();
		
	}

}
