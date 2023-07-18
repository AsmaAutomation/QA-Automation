package com.orangeHRM.e2eTests.directory.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.buzz.pages.BuzzPage;
import com.orangeHRM.e2eTests.directory.pages.SearchDirectoryPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchDirectoryStepDefinition {

	public WebDriver driver;
	private SearchDirectoryPage searchDirectory = new SearchDirectoryPage();

	public SearchDirectoryStepDefinition() {

		driver = Setup.driver;
		PageFactory.initElements(driver, SearchDirectoryPage.class);
	}

	@When("^I navigate to directory interface$")
	public void iNavigateToDirectoryInterface() throws Throwable {
		searchDirectory.clickOnDirectory();
	}

	@When("^Fill the name field \"([^\"]*)\"$")
	public void fillTheNameField(String directoryName) throws Throwable {
		searchDirectory.fillDirectoryName(directoryName);
	}

	@When("^Click on search button$")
	public void clickOnSearchButton() throws Throwable {
		searchDirectory.clickOnSearch();
	}

	@Then("^The searched directory is displayed \"([^\"]*)\"$")
	public void theSearchedDirectoryIsDisplayed(String nom) throws Throwable {
		String textMsg = SearchDirectoryPage.directoryFirstTableElement.getText();
		Assert.assertTrue(textMsg.contains(nom));
	}



}
