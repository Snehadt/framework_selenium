package com.crm.qa.commonElement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.crm.qa.baseClass.baseClassCRMApp;
import com.crm.qa.utils.utility;

public class UIelements extends baseClassCRMApp{
	public By attributeElement;
	utility util=new utility();
	public UIelements() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver switchToframes()
	{
		WebDriver switchToFrame=driver.switchTo().frame(utility.frameName);
		return switchToFrame;
		
	}
	
	public WebDriver switchToDefault()
	{
		WebDriver switchToDefault=driver.switchTo().defaultContent();
		return switchToDefault;
	}
	
	public String getAttributeValue(WebElement ele)
	{
		String attribute=driver.findElement(attributeElement).getAttribute("innerText");
		System.out.println("webelement is"+attribute);
		return attribute;
	}
	
	public void mouseHover(WebElement ele)
	{
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		//driver.findElement(By.linkText(visibleelement)).click();
		//return clickOnCOntact;
	
	}
}
