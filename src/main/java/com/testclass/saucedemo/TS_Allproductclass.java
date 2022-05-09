package com.testclass.saucedemo;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

@Listeners(listner_package.Listener_class.class)
public class TS_Allproductclass extends BasetestClass
{
  @Test
  public void allproductfunction() throws InterruptedException
  {
  
	        //add all 6 products:-
			   
			   Homepage all = new Homepage(driver);
			   all.allproduct();
			   log.info("all products added to cart");
			   
			   String acttext = all.carttext();
			   String exptext= "6";
	  
			   Assert.assertEquals(acttext, exptext,"all product case failed");
			   log.info("case passed");
  }
}
