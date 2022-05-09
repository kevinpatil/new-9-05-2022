package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

@Listeners(listner_package.Listener_class.class)
public class TS_logout_function extends BasetestClass
{
        @Test
		public void logout()
		{
        	
		String logouturl= driver.getCurrentUrl();
		String explogouturl = "https://www.saucedemo.com/";
		
		Assert.assertEquals(logouturl, explogouturl,"logout case failed");
		log.info("logout test passed");
		
		
		
		}
		
}
