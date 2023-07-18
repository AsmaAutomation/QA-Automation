package com.orangeHRM.e2eTests.PIM.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.PIM.pages.PimPage;
import com.orangeHRM.e2eTests.authentication.pages.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PimStepDefinition {
	
	public WebDriver driver;
	private PimPage pimPage = new PimPage();
	public String fileName = "src/test/resources/fileProfile.txt";
	
	public PimStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, PimPage.class);
	}
	@When("^Je clique sur PIM$")
	public void jeCliqueSurPIM() throws Throwable {
		pimPage.clickOnPim();
	}

	@When("^JE Clique sur add employee$")
	public void jeCliqueSurAddEmployee() throws Throwable {
		pimPage.clickOnAdd();
	}

	@When("^Je saisie First name \"([^\"]*)\" and last name \"([^\"]*)\"$")
	public void jeSaisieFirstNameAndLastName(String firstName, String lastName) throws Throwable {
		pimPage.fillUserName(firstName, lastName);
	}
	
	@When("^J'importe une photo \"([^\"]*)\"$")
	public void jImporteUnePhoto(String path) throws Throwable {
		pimPage.uploadPhoto(path);
	}

	@When("^Je clique sur create login$")
	public void jeCliqueSurCreateLogin() throws Throwable {
		pimPage.clickOnCheckLogin();
	}

	@When("^Je saisie user name \"([^\"]*)\" and password \"([^\"]*)\" and confirm password \"([^\"]*)\"$")
	public void jeSaisieUserNameAndPasswordAndConfirmPassword(String name, String password, String repassword) throws Throwable {
		pimPage.fillCredentials(name, password, repassword);
	}

	@When("^Je select status Enabled \"([^\"]*)\"$")
	public void jeSelectStatusEnabled(String status) throws Throwable {
		pimPage.selectStatus(status);
	}

	@When("^Je clique sur Save$")
	public void jeCliqueSurSave() throws Throwable {
		pimPage.clickSave();
	}

	@Then("^Je vérifie que l'employé est ajouté$")
	public void jeVérifieQueLEmployéEstAjouté() throws Throwable {
		String textMsg = pimPage.profile.getText();
		String profileIdentification = pimPage.readFile(fileName);
		System.out.println("*************************************************"+profileIdentification);
		Assert.assertTrue(textMsg.contains(profileIdentification));
	}

}
