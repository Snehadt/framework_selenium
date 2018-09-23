package frameworkDesign.frameworkMy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.baseClass.baseClassCRMApp;
import com.crm.qa.pages.HomeCRM;
import com.crm.qa.pages.LoginCRM;

public class loginPageTest extends baseClassCRMApp{
	LoginCRM loginpg;
	HomeCRM homepage;
	public loginPageTest() throws IOException{
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginpg=new LoginCRM();
		
		
	}
	@Test (priority=1)
	public void loginPageTitle()
	{
		String title=loginpg.checkPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
		//return title;
	}
	@Test(priority=2)
	public void loginCRM() throws IOException, InterruptedException
	{
		homepage=loginpg.loginValidation(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
