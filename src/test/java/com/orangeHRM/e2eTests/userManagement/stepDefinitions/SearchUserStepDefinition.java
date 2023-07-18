package com.orangeHRM.e2eTests.userManagement.stepDefinitions;

import com.orangeHRM.e2eTests.userManagement.pages.SearchUserPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchUserStepDefinition {
	
	private SearchUserPage searchUserPage = new SearchUserPage();
	
	@Given("^I m on HomePage$")
	public void iMOnHomePage() throws Throwable {
	  
		searchUserPage.navigateToAdminPage();
	}

	@When("^I fill username \"([^\"]*)\"$")
	public void iFillUsername(String username) throws Throwable {
	    
		searchUserPage.fillUsername(username);
	}

	@Then("^I find the user seached$")
	public void iFindTheUserSeached() throws Throwable {
	    
		searchUserPage.resultVerification();
	}


}
