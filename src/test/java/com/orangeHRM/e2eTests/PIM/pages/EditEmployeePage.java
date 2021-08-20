package com.orangeHRM.e2eTests.PIM.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.utils.Setup;

public class EditEmployeePage {

	final static String SEARCH_ID = "empsearch_id";
	final static String SEARCH_BTN_ID = "searchBtn";
	final static String LINK_PATH = "//*[@id='resultTable']/tbody/tr/td[2]/a";
	final static String EDIT_ID = "btnSave";
	final static String PERMIS_ID = "/personal_txtLicenNo";
	final static String CALENDRIER = "personal_txtLicExpDate";
	final static String MONTH_HANDLER_CSS = "select[data-handler='selectMonth']";
	final static String YEAR_HANDLER_CSS = "select[data-handler='selectYear']";


	/*FindBy*/
	@FindBy(how = How.ID, using = SEARCH_ID)
	public static WebElement idSearch;
	@FindBy(how = How.ID, using = SEARCH_BTN_ID)
	public static WebElement searchBtn;
	@FindBy(how = How.XPATH, using = LINK_PATH)
	public static WebElement linkProfile;
	@FindBy(how = How.ID, using = EDIT_ID)
	public static WebElement editBtn;
	@FindBy(how = How.ID, using = PERMIS_ID)
	public static WebElement permisNumber;
	@FindBy(how = How.ID, using = CALENDRIER)
	public static WebElement calendrier;
	@FindBy(how = How.CSS, using = MONTH_HANDLER_CSS)
	public static WebElement monthHandler;
	@FindBy(how = How.CSS, using = YEAR_HANDLER_CSS)
	public static WebElement yearHandler;

	WebDriver driver;
	
	public EditEmployeePage() {
		driver = Setup.driver;
		//PageFactory.initElements(driver, EditEmployeePage.class);
	}
	public void fillIdUser(String id) throws InterruptedException {
		idSearch.click();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.getElementById('empsearch_id').value='0000000'");
	
	}

	public void clickSearch() throws InterruptedException {
		Thread.sleep(3000);
		searchBtn.click();
	}

	public void navigateToEmployeeProfile() throws InterruptedException {
		Thread.sleep(5000);
		linkProfile.click();
	}

	public void clickEdit() {
		editBtn.click();
	}

	public void fillPermis(String permis) {
		permisNumber.sendKeys(permis);
	}

}
