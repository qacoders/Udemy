package com.appium.facebook.androiduiselector;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MultiTouch {
	
	@Test
	public void testMultiTouch() throws Exception{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.3");
		capabilities.setCapability("deviceName","SAMSUNG-SGH-I337");
		capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\multitouchpro.tests.apk");
		capabilities.setCapability("appPackage","multitouchpro.tests");
		capabilities.setCapability("appActivity","Multitouch");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		TouchAction action1=new TouchAction((MobileDriver)driver).longPress(570,960).waitAction(100);
		TouchAction action2=new TouchAction((MobileDriver)driver).longPress(150,410).waitAction(100);
		new MultiTouchAction((MobileDriver)driver).add(action1).add(action2).perform();
	}

}
