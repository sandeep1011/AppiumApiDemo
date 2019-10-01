package appium.demo;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {

	static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		try {

			DesiredCapabilities capabilties = new DesiredCapabilities();
			capabilties.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
			capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.example.android.apis.ApiDemos");
			capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.touchboarder.android.api.demos");
			URL serverURL = new URL("http://localhost:"+4723+"/wd/hub");
			driver = new AndroidDriver<MobileElement>(serverURL,capabilties);




		}

		catch(Exception exp) {
			System.out.println("Cause is :"+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
		}

	}
	
	
	
	

	

	


}
