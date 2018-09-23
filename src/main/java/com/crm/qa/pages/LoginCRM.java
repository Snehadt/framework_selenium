package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.baseClass.baseClassCRMApp;

public class LoginCRM extends baseClassCRMApp{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(xpath=".//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath=".//*[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath=".//button[contais(text(),'Sign up')]")
	WebElement signUp;
	//element initialization
	public LoginCRM() throws IOException {
		PageFactory.initElements(driver, this);
	}
	//method--actions
	public String checkPageTitle()
	{
		String pageTitle=driver.getTitle();
		return pageTitle;
	}
	
	public HomeCRM loginValidation(String uid,String pass) throws IOException, InterruptedException{
		username.clear();
		username.sendKeys(uid);
		password.clear();
		password.sendKeys(pass);
		
		Thread.sleep(2000);
		loginBtn.click();
		
		return new HomeCRM();
	}
	
	
}