package com.testclass.saucedemo;

import java.io.IOException;
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


import utilitypackage.Utilityclass;

@Listeners(listner_package.Listener_class.class)    //declare listener annotation before class

public class TS_Login_function extends BasetestClass
{
     
         @Test
         public void loginfunction() throws IOException, InterruptedException
         {
        	 
        	 String actualurl =driver.getCurrentUrl();
			 System.out.println(actualurl);
        	 
			 String expectedurl ="://www.saucedemo.com/inventory.html";
	   
			 Assert.assertEquals(actualurl, expectedurl);
			 log.info("login scenario case passed");
			 
         }	 
			 
      
         
  
}
