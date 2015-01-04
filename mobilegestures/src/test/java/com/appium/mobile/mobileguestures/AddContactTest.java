package com.appium.mobile.mobileguestures;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AddContactTest {
	
	@Test
	public void testDialNumber() throws Exception{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName","Appium");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.3");
		capabilities.setCapability("deviceName","SAMSUNG-SGH-I337");
		//capabilities.setCapability("app","C:\\Users\\srikanthvejendla\\Downloads\\com.mobeta.android.demodslv.apk");
		capabilities.setCapability("appPackage","com.android.contacts");
		capabilities.setCapability("appActivity","DialtactsContactsEntryActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.contacts:id/tab_custom_view_text\").text(\"Phone\")").click();
		Scanner in = new Scanner(System.in);
		int phonenumber;
		System.out.println("Enter the phone number");
		phonenumber=in.nextInt();
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while(phonenumber>0){
			stack.push(phonenumber%10);
			phonenumber=phonenumber/10;
		}
		while(!stack.isEmpty()){
			switch (stack.pop()) {
			case 1:
				driver.findElement(By.id("com.android.contacts:id/one")).click();
				break;
			case 2:
				driver.findElement(By.id("com.android.contacts:id/two")).click();
				break;
			case 3:
				driver.findElement(By.id("com.android.contacts:id/three")).click();
				break;
			case 4:
				driver.findElement(By.id("com.android.contacts:id/four")).click();
				break;
			case 5:
				driver.findElement(By.id("com.android.contacts:id/five")).click();
				break;
			case 6:
				driver.findElement(By.id("com.android.contacts:id/six")).click();
				break;
			case 7:
				driver.findElement(By.id("com.android.contacts:id/seven")).click();
				break;
			case 8:
				driver.findElement(By.id("com.android.contacts:id/eight")).click();
				break;
			case 9:
				driver.findElement(By.id("com.android.contacts:id/nine")).click();
				break;
			case 0:
				driver.findElement(By.id("com.android.contacts:id/zero")).click();
				break;
			default:
				break;
			}
		}
		
		driver.findElement(By.id("com.android.contacts:id/callbutton")).click();
	}

}
