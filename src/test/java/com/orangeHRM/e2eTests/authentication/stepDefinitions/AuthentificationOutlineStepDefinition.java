package com.orangeHRM.e2eTests.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentication.pages.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.Setup;
import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDefinition {

	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();

	public AuthentificationOutlineStepDefinition() {

		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}

	@When("^Je saisie login \"([^\"]*)\"$")
	public void jeSaisieLogin(String username)  {
		
		authenticationPage.fillUsername(username);
	}

	@When("^Je saisie password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password)  {
		
		authenticationPage.fillPassword(password);
	}

}
