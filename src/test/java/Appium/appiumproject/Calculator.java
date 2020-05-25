package Appium.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	static AppiumDriver<MobileElement> driver;

	
	public static void main(String[] args)   {
		try {
	openCalculator();
	
		}catch (Exception e) {
		System.out.println();e.getCause();
		e.getMessage();
		e.printStackTrace();
		}
	}
		
		public static void openCalculator() throws Exception {
				
		
		DesiredCapabilities ca = new  DesiredCapabilities();
		
		ca.setCapability(MobileCapabilityType.APPLICATION_NAME, "SM A305F");
		ca.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8M22XAS7J");
		ca.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ca.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		ca.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		ca.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url ,ca);
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_06").click();
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_add").click();
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_06").click();
		
		driver.findElementById("com.sec.android.app.popupcalculator:id/bt_equal").click();
		
		
		String result = driver.findElementById("com.sec.android.app.popupcalculator:id/calc_edt").getText();
		
	   
			if(result.equalsIgnoreCase("12")) {
			System.out.println("Test passed");
			
		}else {
				System.out.println("Test fail");
		}
		
		
}
	}
	
		

	