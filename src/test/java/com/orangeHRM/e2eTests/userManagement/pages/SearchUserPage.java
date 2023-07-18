package com.orangeHRM.e2eTests.userManagement.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchUserPage {

	/* Locators */
	final static String Admin_ID = "menu_admin_viewAdminModule";
	final static String Username_ID = "searchSystemUser_userName";
	final static String Search_Button_ID = "searchBtn";
	final static String Result = "//*[@id='resultTable']/tbody/tr/td[1]/a";

	/* FindBy */
	@FindBy(how = How.ID, using = Admin_ID)
	public static WebElement adminBtn;
	@FindBy(how = How.ID, using = Username_ID)
	public static WebElement usernameField;
	@FindBy(how = How.ID, using = Search_Button_ID)
	public static WebElement searchBtn;
	@FindBy(how = How.ID, using = Result)
	public static WebElement Searchresult;

	public void navigateToAdminPage() {

		adminBtn.click();
	}

	public void fillUsername(String username) {

		usernameField.clear();
		usernameField.sendKeys(username);
	}

	public void searchUser() {

		searchBtn.click();
	}

	public void resultVerification() {

		String resultText = Searchresult.getText();
		Assert.assertEquals("Alice.Duval", resultText);
	}

}
