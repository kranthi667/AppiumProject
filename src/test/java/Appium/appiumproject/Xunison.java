package Appium.appiumproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Xunison {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {
		
		
		
		DesiredCapabilities ca = new DesiredCapabilities();
		
		
		ca.setCapability(MobileCapabilityType.APPLICATION_NAME, "SM A305F");
		ca.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8M22XAS7J");
		ca.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		ca.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		ca.setCapability("appPackage", "xunison.com.smarthomeapp");
		ca.setCapability("appActivity", "xunison.com.smarthomeapp.screen.wizard.WizardActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url ,ca);
		
		
		

	}

}
