package com.e2etests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LogoutPageObject {
	 
	public ConfigFileReader configFileReader;
	
	@FindBy(how = How.CSS, using=".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")
	public static WebElement menu1;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	public static WebElement btnLogout;
	
	@FindBy(how = How.CSS, using = ".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")
	public static WebElement btnLog2;
	

	public LogoutPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
		
	}
	
	public void accesmenu() throws InterruptedException {
		
		Thread.sleep(3000);
		menu1.click();
		
		
	}

	public void clicklogout() throws InterruptedException {
		
		Thread.sleep(3000);
		btnLogout.click();
		
	}
}
