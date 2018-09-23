/**
 * 
 */
package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.baseClass.baseClassCRMApp;

/**
 * @author Sneha
 *
 */
public class ContactCRM extends baseClassCRMApp{

	public ContactCRM() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

}
