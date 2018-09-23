package com.crm.qa.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.utils.WebEventListener;
import com.crm.qa.utils.utility;

public class baseClassCRMApp {
	
	public static WebDriver driver;
	public static Properties properties;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public baseClassCRMApp() throws IOException
	{
		
		 properties=new Properties();
		 //WebDriver driver;
		 FileInputStream fileinput=new FileInputStream("D:\\MyWorkspace\\frameworkMy\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		 properties.load(fileinput);
		 
	}
		 public static void initialization(){
		 
			 String browserName=properties.getProperty("browser");
			 
			 if(browserName.equals("chrome"))
			 {
				 System.setProperty("webdriver.chrome.driver", "D:\\AppiumReqdSOftware\\AppiumReqdSOftware\\chromedriver.exe");
				    driver=new ChromeDriver();
			 }else if(browserName.equals("firefox"))
			 {
				 driver=new FirefoxDriver();
			 }
			 
			 
			 
			 e_driver=new EventFiringWebDriver(driver);
			 try {
				eventListener = new WebEventListener();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				e_driver.register(eventListener);
				driver = e_driver;
				driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().pageLoadTimeout(utility.PageLoadTimeOut, TimeUnit.SECONDS);
				 driver.manage().timeouts().implicitlyWait(utility.implocit, TimeUnit.SECONDS);
				 driver.get(properties.getProperty("url"));
		 }
		 
		  
	
	

	

}
