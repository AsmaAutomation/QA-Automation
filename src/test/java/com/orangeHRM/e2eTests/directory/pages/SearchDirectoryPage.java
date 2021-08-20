package com.orangeHRM.e2eTests.directory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SearchDirectoryPage {
	
	final static String MODULE_DIRECTORY_BTN = "menu_directory_viewDirectory"; 
	final static String MODULE_NAME_FIELD = "searchDirectory_emp_name_empName";
	final static String MODULE_SEARCH_BTN = "searchBtn";
	final static String MODULE_FIRST_TABLE_ELEMENT = "//*[@id='resultTable']/tbody/tr/td[2]/ul/li[1]/b";
	
	@FindBy(how=How.ID, using= MODULE_DIRECTORY_BTN)
	public static WebElement directoryBtn;
	@FindBy(how=How.ID, using= MODULE_NAME_FIELD)
	public static WebElement directoryNameField;
	@FindBy(how=How.ID, using= MODULE_SEARCH_BTN)
	public static WebElement directorySearchBtn;
	@FindBy(how=How.XPATH, using= MODULE_FIRST_TABLE_ELEMENT)
	public static WebElement directoryFirstTableElement;
	
	public void clickOnDirectory() {
		directoryBtn.click();
	}
	
	public void fillDirectoryName(String directoryName) {
		directoryNameField.clear();
		directoryNameField.sendKeys(directoryName);
	}
	
	public void clickOnSearch() {
		directorySearchBtn.click();
	}
	
	

}

