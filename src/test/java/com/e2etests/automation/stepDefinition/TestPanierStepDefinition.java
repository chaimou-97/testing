package com.e2etests.automation.stepDefinition;

import org.junit.Assert;

import com.e2etests.automation.pageObject.TestPanierPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestPanierStepDefinition {
	
	public TestPanierPageObject testPanierPageObject ;
	
	public TestPanierStepDefinition() {
		
		testPanierPageObject = new  TestPanierPageObject();
	}

	@Given("j accede a l application orange")
	public void jAccedeALApplicationOrange() {
		
		testPanierPageObject.connection();
	}

	@When("je saisis le username")
	public void jeSaisisLeUsername() throws InterruptedException {
		
		testPanierPageObject.saisusernamex();
	}

	@When("je saisis le password")
	public void jeSaisisLePassword() {
         testPanierPageObject.saispasswordx();
	}

	@When("je clique sur le boutton login1")
	public void jeCliqueSurLeBouttonLogin1() {
		testPanierPageObject.clicx();

	}

	@Then("je me redirecte vers l interface dashboard")
	public void jeMeRedirecteVersLInterfaceDashboard() {
		
		String res1 =testPanierPageObject.dasboardx.getText();
		Assert.assertEquals("Dashboard", res1);

	}

}
