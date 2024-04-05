package com.ajio;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AjioApp {
	
	public static AndroidDriver driver;
	@Test
	public void setup() throws Exception {
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "384e8c05b28d");
		cap.setCapability("udid", "384e8c05b28d");
		cap.setCapability("platformName", "Android");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		cap.setCapability("appPackage", "com.indusind.indie.uat");
		cap.setCapability("appActivity", "com.indusind.indie.uat.MainActivity");
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
//		//public static AndroidDriver<WebElement> driver;
		driver=new AndroidDriver(url, cap);
//		//driver.findElement(By.xpath(""));
		//AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url, cap);

	}

}
