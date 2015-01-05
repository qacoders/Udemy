package com.mobile.appium.jenkinsintegration;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppTest {
	
	@Test
	public void testLaunch() throws Exception{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", System.getProperty("platformName"));
		capabilities.setCapability("platformVersion",System.getProperty("platformVersion"));
		capabilities.setCapability("deviceName","SAMSUNG-SGH-I337");
		capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\selendroid-test-app-0.12.0.apk");
		capabilities.setCapability("appPackage","io.selendroid.testapp");
		capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Appium Automation");
		Thread.sleep(8000);
		driver.quit();
	}

}
