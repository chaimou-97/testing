package com.e2etests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PanierPageObject {
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	public static WebElement btnpanier;
	
	@FindBy(how = How.CSS, using = ".shopping_cart_container")
	public static WebElement paniers;


	public PanierPageObject() {//constructeur
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void clickpanier() {
		
		btnpanier.click();
	}
	

}
