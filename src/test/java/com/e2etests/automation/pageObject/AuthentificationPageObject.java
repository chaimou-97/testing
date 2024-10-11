package com.e2etests.automation.pageObject;



import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationPageObject {

	//Recherche des WebElement
	@FindBy(how = How.ID,using = "user-name")
	public static WebElement username;
	
	@FindBy(how = How.ID,using = "password")
	public static WebElement password;
	
	@FindBy(how = How.ID,using = "login-button")
	public static WebElement btnlogin;
	
	@FindBy(how = How.CSS,using = ".title")
	public static WebElement titlePage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	public static WebElement msgError;
	
	@FindBy(how = How.ID,using = "react-burger-menu-btn")
	public static WebElement menu;
	
	@FindBy(how = How.ID,using = "logout_sidebar_link")
	public static WebElement btnlogut2;
	
	@FindBy(how = How.CSS,using = ".login_logo")
	public static WebElement titlePage2;
	
	public AuthentificationPageObject() {
		
		PageFactory.initElements(Setup.getDriver(), this);
		
	}
	
	//Les méthodes
	public void ConnectToApp() {
		
		Setup.getDriver().get("https://www.saucedemo.com/");
		
	}
	
	public void fillUsername(String user) {
		
		username.sendKeys(user);
	}
	public void ajoutPassword(String pwd) {
		
		password.sendKeys(pwd);
		
	}
	
	public void clickBtn() {
		
		btnlogin.click();
		
	}

	public void logout() {
		
		menu.click();
	
		
	}
	
public void logout2()  {
		
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		btnlogut2.click();
		
	}
	

}
