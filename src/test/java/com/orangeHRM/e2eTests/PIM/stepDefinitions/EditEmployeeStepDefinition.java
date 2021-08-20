package com.orangeHRM.e2eTests.PIM.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.PIM.pages.EditEmployeePage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditEmployeeStepDefinition {
	EditEmployeePage editEmployeePage = new EditEmployeePage();
	WebDriver driver;
	
	public EditEmployeeStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, EditEmployeePage.class);
	}

	@When("^Je filtre par id \"([^\"]*)\"$")
	public void jeFiltreParId(String id) throws Throwable {
		editEmployeePage.fillIdUser(id);
	}

	@When("^Je clique sur rechercher$")
	public void jeCliqueSurRechercher() throws Throwable {
		editEmployeePage.clickSearch();
	}

	@When("^J'accède au profile de l'employee$")
	public void jAccèdeAuProfileDeLEmployee() throws Throwable {
		editEmployeePage.navigateToEmployeeProfile();
	}

	@When("^Je clique sur edit$")
	public void jeCliqueSurEdit() throws Throwable {
		editEmployeePage.clickEdit();
	}

	@When("^Je saisie le numéro de perims de conduite \"([^\"]*)\"$")
	public void jeSaisieLeNuméroDePerimsDeConduite(String permis) throws Throwable {
		editEmployeePage.fillPermis(permis);
	}

	@When("^Je choisis la date d'expiration \"([^\"]*)\"$")
	public void jeChoisisLaDateDExpiration(String arg1) throws Throwable {
	}

	@When("^Je choisie la situation familiale$")
	public void jeChoisieLaSituationFamiliale() throws Throwable {
	}

	@When("^Je clique sur save$")
	public void jeCliqueSurSave() throws Throwable {
	}

	@Then("^le message de succès s'affiche \"([^\"]*)\"$")
	public void leMessageDeSuccèsSAffiche(String arg1) throws Throwable {
	}


}
