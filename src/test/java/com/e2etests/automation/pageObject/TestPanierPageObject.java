package com.e2etests.automation.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class TestPanierPageObject {

	public ConfigFileReader configFileReader;
	
	
	@FindBy(how = How.NAME, using = "username")
	public static WebElement user1;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement passw1;
	
	@FindBy(how = How.CSS,using=".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
	public static WebElement btn1;
	
	@FindBy(how = How.CSS, using = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
	public static WebElement dasboardx;
	
	
	public TestPanierPageObject() {
		
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader= new ConfigFileReader();
	}
	
	public void connection() {
		Setup.getDriver().get(configFileReader.getProperties("orangehrm_url"));
	}
	
	public void saisusernamex() throws InterruptedException {
		
		Thread.sleep(3000);
		user1.sendKeys(configFileReader.getProperties("orangehrm_username"));
		
	}
	public void saispasswordx() {
		
		passw1.sendKeys(configFileReader.getProperties("orangehrm_password"));
		
	}
	
	public void clicx() {
		
		Setup.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		btn1.click();
		
	}

}
