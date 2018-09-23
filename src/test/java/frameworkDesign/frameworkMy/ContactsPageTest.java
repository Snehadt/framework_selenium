package frameworkDesign.frameworkMy;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.baseClass.baseClassCRMApp;
import com.crm.qa.commonElement.UIelements;
import com.crm.qa.pages.ContactCRM;
import com.crm.qa.pages.HomeCRM;
import com.crm.qa.pages.LoginCRM;

public class ContactsPageTest extends baseClassCRMApp{

	
	HomeCRM homecrm;
	LoginCRM loginpg;
	ContactCRM contactCRM;
	HomePage homePage;
	UIelements uiElements;
	public ContactsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void ContactsPageInitialization() throws IOException, InterruptedException
	
	{
		initialization();
		loginpg=new LoginCRM();
		homecrm=loginpg.loginValidation(properties.getProperty("username"), properties.getProperty("password"));

		//contactCRM=homePage.clickCOntactTest();
	
	}
	
	@Test	
	
	public void clickNewContact() throws IOException
	{
		uiElements=new UIelements();
		uiElements.switchToframes();
		//homePage.clickCOntactTest();
		homecrm.clickContact();
		
	}

}
