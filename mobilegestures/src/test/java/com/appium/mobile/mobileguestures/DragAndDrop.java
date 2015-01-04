package com.appium.mobile.mobileguestures;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {
	
	@Test
	public void testDragDrop() throws Exception{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.3");
		capabilities.setCapability("deviceName","SAMSUNG-SGH-I337");
		capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\com.mobeta.android.demodslv.apk");
		capabilities.setCapability("appPackage","com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity","Launcher");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_title")).get(0).click();
		new TouchAction((MobileDriver)driver).longPress(driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0)).moveTo(driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(7)).release().perform();
		Thread.sleep(5000);
		driver.quit();
		//driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0)
	}

}
