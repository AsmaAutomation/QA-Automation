package com.orangeHRM.e2eTests.authentication.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {
	
	/* Locators */
	final static String USERNAME_ID = "txtUsername";
	final static String USERPASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	
	/* FindBy */
	@FindBy(how = How.ID, using = USERNAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USERPASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	
	/* Methods */ 
	public void fillUsername(String name) {
		userName.clear();
		userName.sendKeys(name);
	}

	public void fillPassword(String password) {
		userPassword.clear();
		userPassword.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
}
