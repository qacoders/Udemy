package com.appium.android;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppOnEmulator {
	
	public static void main(String[] args) throws MalformedURLException{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion","5.0");
		capabilities.setCapability("deviceName","Android Emulator");
		capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\selendroid-test-app-0.12.0.apk");
		capabilities.setCapability("appPackage","io.selendroid.testapp");
		capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

}
