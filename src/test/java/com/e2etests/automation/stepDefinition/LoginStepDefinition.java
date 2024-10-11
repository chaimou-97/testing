package com.e2etests.automation.stepDefinition;

import org.junit.Assert;

import com.e2etests.automation.pageObject.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPageObject loginPageObject;

	public LoginStepDefinition() {
		
		loginPageObject = new LoginPageObject();
	}

	@Given("je me connecte sur l application OrangeHRM")
	public void jeMeConnecteSurLApplicationOrangeHRM() {
		
		loginPageObject.connection();
	  
	}
	@When("je saisie le username")
	public void jeSaisieLeUsername() throws InterruptedException {
		loginPageObject.fillUser();
	   
	}
	@When("je saisie le password")
	public void jeSaisieLePassword() {
		loginPageObject.fillPassword();
	}
	@When("je clique sur le boutton connexion")
	public void jeCliqueSurLeBouttonConnexion() {
		loginPageObject.Clicks();
	   
	}
	@Then("je me redirecte vers la page home")
	public void jeMeRedirecteVersLaPageHome() {
		
		String result =loginPageObject.dashboard.getText();
		Assert.assertEquals("Dashboard",result );
	   
	}




}
