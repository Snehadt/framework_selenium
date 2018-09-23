package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.baseClass.baseClassCRMApp;
import com.crm.qa.commonElement.UIelements;
import com.crm.qa.utils.utility;

public class HomeCRM extends baseClassCRMApp{
	
	@FindBy(xpath=".//*[contains(.,'Naveen K')]")
	WebElement loginUserHome;
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	
	public HomeCRM() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	/*public String getUserName() throws IOException
	{
		uiElements=new UIelements();
		uiElements.switchToframes();
		uiElements.getAttributeValue(loginUserHome);
		String actualLoginName=loginUserHome.getText();
		uiElements.switchToDefault();
		return actualLoginName;
		
	}*/
	public ContactCRM clickContact() throws IOException
	{
		
		contacts.click();
		//contactsuiElements.mouseHover(contacts);
		//contacts.click();
		return new ContactCRM();
		//uiElements.mouseHover(contacts, visibleelement);
		
	}

}
