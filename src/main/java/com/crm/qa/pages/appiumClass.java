package com.crm.qa.pages;


	
	import java.io.File;
import java.net.MalformedURLException;
	import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class appiumClass {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			// TODO Auto-generated method stub
			AndroidDriver<MobileElement> dr;
			DesiredCapabilities caps = new DesiredCapabilities();
			File app = new File("C:\\Users\\Sneha\\Downloads\\ApiDemos-debug.apk");
			caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			 //DesiredCapabilities caps = DesiredCapabilities.android();
			  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			  //caps.setCapability("appPackage","com.raaga.android");
			  //caps.setCapability("appActivity", "com.raaga.languages.SelectLanguageActivity");
			  //caps.setCapability("appiumVersion", "1.7.2");
				 
			 // caps.setCapability("udid", "ZY32296DVR");
			  //caps.setCapability("deviceName","Moto");
			  /*caps.setCapability("deviceOrientation", "portrait");
			  caps.setCapability("platformVersion","7.1.1");
			  caps.setCapability("browserName", "");*/
			//  caps.setCapability("appPackage", "com
			  
			  dr = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("Opened");
				Thread.sleep(2000);
				dr.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']")).click();
				dr.findElement(By.xpath("//android.widget.TextView[@text='Accessibility Node Querying']")).click();
		}

	

}
