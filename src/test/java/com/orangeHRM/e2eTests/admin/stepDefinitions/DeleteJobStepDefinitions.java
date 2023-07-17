package com.orangeHRM.e2eTests.admin.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.admin.pages.DeleteJobPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteJobStepDefinitions {

	WebDriver driver;
	DeleteJobPage deleteJobPage = new DeleteJobPage();

	public DeleteJobStepDefinitions() {
		driver = Setup.driver;
		PageFactory.initElements(driver, DeleteJobPage.class);
	}

	@When("^I click on Job Title$")
	public void iClickOnJobTitle() throws Throwable {
		deleteJobPage.clickOnJobBtn();
	}

	@When("^I select job titles \"([^\"]*)\"$")
	public void iSelectJobTitles(String job) throws Throwable {
		deleteJobPage.selectJob(deleteJobPage.getJobTitles(job));
	}

	@When("^I click on delete button$")
	public void iClickOnDeleteButton() throws Throwable {
		deleteJobPage.deleteJob();
	}

	@When("^I accept the delete$")
	public void iAcceptTheDelete() throws Throwable {
		deleteJobPage.confirmDeleteJob();
	}

	@Then("^a success message is displayed \"([^\"]*)\"$")
	public void aSuccessMessageIsDisplayed(String arg1) throws Throwable {
		String successMsg = driver.findElement(By.id("helpText")).getText();
		System.out.println(successMsg);
		Assert.assertTrue(successMsg.equals(arg1));
	}



}
