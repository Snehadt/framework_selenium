package frameworkDesign.frameworkMy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.baseClass.baseClassCRMApp;
import com.crm.qa.commonElement.UIelements;
import com.crm.qa.pages.ContactCRM;
import com.crm.qa.pages.HomeCRM;
import com.crm.qa.pages.LoginCRM;

public class HomePage extends baseClassCRMApp{
	
	HomeCRM homecrm;
	LoginCRM loginpg;
	ContactCRM contactCRM;
	UIelements uiElements;
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void HomePageInitialization() throws IOException, InterruptedException
	
	{
		initialization();
		loginpg=new LoginCRM();
		homecrm=loginpg.loginValidation(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
 /* @Test(priority=2)
  public void validateUser() throws IOException {
	  String actualUserName=homecrm.getUserName();
	  Assert.assertEquals(actualUserName, "Naveen K");
  }*/
  
  @Test(priority=1)
  public ContactCRM clickCOntactTest() throws IOException
  {
	  
	  contactCRM= homecrm.clickContact();
	  return new ContactCRM();
  }
}
