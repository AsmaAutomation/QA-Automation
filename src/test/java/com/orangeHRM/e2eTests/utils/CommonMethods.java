package com.orangeHRM.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gargoylesoftware.htmlunit.AbstractPage;

public class CommonMethods {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public CommonMethods() {
		driver = Setup.driver;
	}
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	public void openURLWithConfigFile(String url) throws IOException {
		
		prop = new Properties();
		FileInputStream fils = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fils);
		driver.get(prop.getProperty(url));
	}

}
