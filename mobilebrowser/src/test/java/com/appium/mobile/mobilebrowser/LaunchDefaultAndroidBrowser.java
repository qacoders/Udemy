package com.appium.mobile.mobilebrowser;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchDefaultAndroidBrowser {
	
	@Test
	public void testLaunchBrowser() throws Exception{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.3");
		capabilities.setCapability("deviceName","SAMSUNG-SGH-I337");
		//capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\com.mobeta.android.demodslv.apk");
		//Android Default Browser
		//capabilities.setCapability("appPackage","com.sec.android.app.sbrowser");
		//capabilities.setCapability("appActivity","SBrowserMainActivity");
		//Chrome Browser
		capabilities.setCapability("appPackage","com.android.chrome");
		capabilities.setCapability("appActivity","Main");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://kroger.com");
		System.out.println(driver.getPageSource());
		//Login to Kroger.com
		//driver.findElement(By.id("signIn")).click();
		//driver.findElement(By.id("signin-drawer-email-address")).sendKeys("mobile.automation7@gmail.com");
		//driver.findElement(By.id("signin-drawer-password")).sendKeys("training123");
		//driver.findElement(By.id("signin-drawer-submit")).click();
		//Get the UserAgent from device
		//JavascriptExecutor je=(JavascriptExecutor)driver;
		//System.out.println(je.executeScript("return navigator.userAgent;",new Object[0]));
		Thread.sleep(10000);
		driver.quit();
	}

}
