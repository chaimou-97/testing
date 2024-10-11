package com.e2etests.automation.pageObject;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPageObject {
	
	public ConfigFileReader configFileReader;

	@FindBy(how = How.NAME, using = "username")
	public static WebElement user;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement pass;
	
	@FindBy(how = How.CSS, using = ".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
	public static WebElement btnLog;
	
	@FindBy(how = How.CSS, using = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
	public static WebElement dashboard;
	
	
	public LoginPageObject(){
		
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	
	public void connection() {
		Setup.getDriver().get(configFileReader.getProperties("orangehrm_url"));
	}
	
	
   public void fillUser() throws InterruptedException {
	   Thread.sleep(3000);
	   user.sendKeys(configFileReader.getProperties("orangehrm_username"));
   }
   
   public void fillPassword() {
	   pass.sendKeys(configFileReader.getProperties("orangehrm_password"));
   }
   
   public void Clicks() {
	   btnLog.click();
       Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));


   }
   
}
