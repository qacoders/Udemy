package com.appium.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppSelendroid {
	
	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		//capabilities.setCapability("automationName", "Selendroid");
		//capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("platformVersion","4.1.1");
		//capabilities.setCapability("deviceName","SAMSUNG-SGH-I747");
		//capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\selendroid-test-app-0.12.0.apk");
		//capabilities.setCapability("appPackage","io.selendroid.testapp");
		//capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		File app = new File("C:\\Users\\srikanthvejendla\\Downloads\\selendroid-test-app-0.12.0.apk");
        //File app = new File(appDir, "selendroid-test-app-0.12.0.apk");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.1.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SAMSUNG-SGH-I747");
		//capabilities.setCapability(MobileCapabilityType.SELENDROID_PORT, 9999);
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//capabilities.setCapability("udid","351873051614175");
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"io.selendroid.testapp");
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,".HomeScreenActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
	}

}
