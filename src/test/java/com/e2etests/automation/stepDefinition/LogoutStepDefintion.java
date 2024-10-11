package com.e2etests.automation.stepDefinition;

import org.junit.Assert;

import com.e2etests.automation.pageObject.LogoutPageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefintion {

	public LogoutPageObject logoutPageObject;

	public LogoutStepDefintion() {

		logoutPageObject = new LogoutPageObject();

	}

	@When("je clique sur le menu a droite")
	public void jeCliqueSurLeMenuADroite() throws InterruptedException {
		
		logoutPageObject.accesmenu();

	}

	@When("je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() throws InterruptedException {
  
		logoutPageObject.clicklogout();
	}

	@Then("je me redirecte vers la page d'acceuil")
	public void jeMeRedirecteVersLaPageDAcceuil() {
		
		Boolean res1 = logoutPageObject.btnLog2.isDisplayed();
		Assert.assertEquals(res1,true);

	}

}
