package com.orangeHRM.e2eTests.admin.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.orangeHRM.e2eTests.userManagement.pages.SearchUserPage;
import com.orangeHRM.e2eTests.utils.Setup;

public class DeleteJobPage {

	final static String ADMIN_MENU_BTN ="menu_admin_viewAdminModule";
	final static String JOB_BUTTON ="menu_admin_Job";
	final static String JOB_TITLES_BUTTON ="menu_admin_viewJobTitleList";
	final static String JOBS ="//*[@id='resultTable']/tbody/tr/td[2]";
	final static String JOBS_CHECK_BOX ="//*[@id='resultTable']/tbody/tr/td[1]";
	final static String DELETE_BUTTON ="btnDelete";
	final static String CONFIRM_DELETE_BUTTON ="dialogDeleteBtn";

	@FindBy(how=How.ID, using= ADMIN_MENU_BTN)
	public static WebElement adminBtn;
	@FindBy(how=How.ID, using= JOB_BUTTON)
	public static WebElement jobBtn;
	@FindBy(how=How.ID, using= JOB_TITLES_BUTTON)
	public static WebElement jobTitlesBtn;
	@FindBy(how=How.ID, using= DELETE_BUTTON)
	public static WebElement deleteBtn;
	@FindBy(how=How.ID, using= CONFIRM_DELETE_BUTTON)
	public static WebElement confirmDeleteBtn;

	WebDriver driver;
	SearchUserPage searchUser;
	
	public DeleteJobPage() {
		driver = Setup.driver;
	}

	public void clickOnJobBtn() throws InterruptedException {
		adminBtn.click();
		Actions action = new Actions(driver);
		action.moveToElement(jobBtn).perform();
		Thread.sleep(4000);
		jobTitlesBtn.click();
	}

	public int getJobTitles(String jobTitle) {
		int index = 0;
		String text;
		List<WebElement> jobs = driver.findElements(By.xpath(JOBS));
		for(int i=0;i<jobs.size();i++) {
			text=jobs.get(i).getText();
			if(text.equals(jobTitle)) {
				index = i;
			}
		}
		return index; 
	}

	public void selectJob(int index) {
		List<WebElement> jobsCheckBox = driver.findElements(By.xpath(JOBS_CHECK_BOX));
		jobsCheckBox.get(index).click();
	}

	public void deleteJob() {
		deleteBtn.click();
	}
	
	public void confirmDeleteJob() {
		confirmDeleteBtn.click();
	}

}
