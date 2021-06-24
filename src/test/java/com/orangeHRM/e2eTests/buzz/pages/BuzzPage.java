package com.orangeHRM.e2eTests.buzz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuzzPage {
	
	/* Locators */
	final static String MODULE_BUZZ_ID = "menu_buzz_viewBuzz";
	final static String TEXTAREA_BUZZ_ID = "createPost_content";
	final static String POST_BTN_ID = "postSubmitBtn";
	final static String BUZZ_POST = "//*[contains(text(),\"I'm Happy\")]";

	
	/* FindBy */
	@FindBy(how = How.ID, using = MODULE_BUZZ_ID)
	public static WebElement moduleBuzz;
	
	@FindBy(how = How.ID, using = TEXTAREA_BUZZ_ID)
	public static WebElement textAreaBuzz;
	
	@FindBy(how = How.ID, using = POST_BTN_ID)
	public static WebElement postBtn;
	
	@FindBy(how = How.XPATH, using = BUZZ_POST)
	public static WebElement buzzPost;
	/* Methods */ 
	public void clickOnBuzz() {
		moduleBuzz.click();
	}
	
	public void fillOnTextArea(String text) {
		textAreaBuzz.sendKeys(text);
	}
	
	public void clickOnPostBtn() {
		postBtn.click();
	}
	
	
	


}
