package com.e2etests.automation.stepDefinition;

import org.junit.Assert;

import com.e2etests.automation.pageObject.AuthentificationPageObject;
import com.e2etests.automation.pageObject.PanierPageObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PanierStepDefinition {
	
	public PanierPageObject panierPageObject;//Objet


	public PanierStepDefinition() {//constructeur
		panierPageObject = new PanierPageObject();
	}
	
	@When("je clique sur le boutton add to cart")
	public void jeCliqueSurLeBouttonAddToCart() {
	    
		
		panierPageObject.clickpanier();
	}
	@Then("le produit est ajouté au panier")
	public void leProduitEstAjoutéAuPanier() {
		String result=panierPageObject.paniers.getText();
		Assert.assertEquals(result, "1");
	    
	}



}
