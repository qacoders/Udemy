package com.appium.mobile.androidbuiltinapps;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetAlarmTest {
	
	@Test
	public void testDialNumber() throws MalformedURLException{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.3");
		capabilities.setCapability("deviceName","SAMSUNG-SGH-I337");
		//Alarm(Clock) App
		capabilities.setCapability("appPackage","com.sec.android.app.clockpackage");
		capabilities.setCapability("appActivity","alarm.Alarm");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			
		//6:00 AM
		//Monday
		
		//Click on Create Alarm
		driver.findElement(By.id("com.sec.android.app.clockpackage:id/txtCreateButton")).click();
		
		//Set the Hour to 6
		
		
		while(!driver.findElements(By.id("com.sec.android.app.clockpackage:id/timepicker_input")).get(0).getText().equals("6")){
			driver.findElements(By.id("com.sec.android.app.clockpackage:id/increment")).get(0).click();
		}
		
		//Set the Minute to 00
		
		while(!driver.findElements(By.id("com.sec.android.app.clockpackage:id/timepicker_input")).get(1).getText().equals("00")){
			driver.findElements(By.id("com.sec.android.app.clockpackage:id/increment")).get(1).click();
		}
		
		//Set AM
		if(driver.findElement(By.id("com.sec.android.app.clockpackage:id/alarm_ampm_button")).getText().equals("PM")){
			driver.findElement(By.id("com.sec.android.app.clockpackage:id/alarm_ampm_button")).click();
		}
		
		//Set the day to Monday
		
		
		driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ToggleButton\").description(\"Monday\")").click();
		
		
		//Save the Alarm
		driver.findElement(By.id("com.sec.android.app.clockpackage:id/menu_done")).click();
		
		
	}

}
