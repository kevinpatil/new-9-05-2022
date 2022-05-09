package com.testclass.saucedemo;


import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Yourcart;

@Listeners(listner_package.Listener_class.class)
public class TS_checkout_functionality extends BasetestClass
{

    @Test
	public void checkoutfunction() 
	{
		          //now go for select product and click on add to cart:-
				   
				   Homepage hp = new Homepage(driver);
				   hp.filter();
				   log.info("clicked on filter");
				   log.info("Price low to high");
				   
				   hp.addtocart();
				   log.info("red t-shirt added to cart");
				   
				   hp.cartbutton();
				   log.info("clicked on cart icon and moved to your cart");
				   
				   //now check checkout function:-
				   
				   Yourcart x = new Yourcart(driver);
				   x.checkout();
				   log.info("clicked on checkout");
				   
				   String expUrl= "https://www.saucedemo.com/checkout-step-one.html";
				   String actUrl= driver.getCurrentUrl();
				   	
		           Assert.assertEquals(expUrl, actUrl,"checkout case failed");
		
		
	}
}
