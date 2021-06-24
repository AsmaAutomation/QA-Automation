package com.orangeHRM.e2eTests.buzz.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.buzz.pages.BuzzPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuzzStepDefinition {

	public WebDriver driver;
	private BuzzPage buzzPage = new BuzzPage();

	public BuzzStepDefinition() {

		driver = Setup.driver;
		PageFactory.initElements(driver, BuzzPage.class);
	}


	@When("^Je click sur le bouton buzz$")
	public void jeClickSurLeBoutonBuzz() throws Throwable {

		buzzPage.clickOnBuzz();
	}

	@When("^Je saisie un message \"([^\"]*)\"$")
	public void jeSaisieUnMessage(String message) throws Throwable {

		buzzPage.fillOnTextArea(message);
	}

	@When("^Je click sur le bouton post$")
	public void jeClickSurLeBoutonPost() throws Throwable {

		buzzPage.clickOnPostBtn();
	}

	@Then("^Je vérifie le message \"([^\"]*)\"$")
	public void jeVérifieLeMessage(String message) throws Throwable {
		
		Assert.assertTrue(BuzzPage.buzzPost.getText().contains(message));
	}

}
