package com.e2etests.automation.stepDefinition;

import org.junit.Assert;

import com.e2etests.automation.pageObject.AuthentificationPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	public AuthentificationPageObject authentificationPageObject;

	public AuthentificationStepDefinition() {

		authentificationPageObject = new AuthentificationPageObject();
	}

	@Given("je me connecte sur l application swag labs")
	public void jeMeConnecteSurLApplicationSwagLabs() {
 
		authentificationPageObject.ConnectToApp();
		
	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String usr) {
		
		authentificationPageObject.fillUsername(usr);

	}

	@When("je saisie le password  {string}")
	public void jeSaisieLePassword(String psr) {
		
		authentificationPageObject.ajoutPassword(psr);

	}

	@When("je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin() {

		authentificationPageObject.clickBtn();
	}

	@Then("je me redirecte vers la page d acceuil home")
	public void jeMeRedirecteVersLaPageDAcceuilHome() {
		
		String result=authentificationPageObject.titlePage.getText();
		Assert.assertEquals("Products", result);

	}
	
	@Then("le message d erreur saffiche {string}")
	public void leMessageDErreurSaffiche(String msg) {
		
		String message=authentificationPageObject.msgError.getText();
		Assert.assertEquals(msg, message);
		
		
		
	}
	

	@When("je clique sur le menu à gauche")
	public void jeCliqueSurLeMenuÀGauche() {
	   authentificationPageObject.logout();
	}
	@When("je clique sur le boutton se deconnecter")
	public void jeCliqueSurLeBouttonSeDeconnecter() throws InterruptedException {
		authentificationPageObject.logout2(); 
		
		
	}
	@Then("je me redirigie vers la page d authentification")
	public void jeMeRedirigieVersLaPageDAuthentification() {
	   
		Boolean result = authentificationPageObject.btnlogin.isDisplayed();
		Assert.assertEquals(result, true);
		
	}





}
