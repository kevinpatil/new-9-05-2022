package com.testclass.saucedemo;


import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

import utilitypackage.Utilityclass;

@Listeners(listner_package.Listener_class.class)

public class TS_addcart_function extends BasetestClass
{
	SoftAssert a= new SoftAssert();      //always use hard assertion soft dont works properly
	
  @Test
  public void addcartfunctionality() throws IOException, InterruptedException
  {
	          //here after running of every test again @Before method will run and then 
              // @after method in this seq it works.
	  
	          //now go for select product and click on add to cart:-
			   
			   Homepage cart = new Homepage(driver);
			   cart.filter();
			   log.info("clicked on filter");
			   log.info("Price low to high");
			   
			   cart.addtocart();
			   log.info("red t-shirt added to cart");
			   
			   Thread.sleep(4000);
			   
			   String acttext =cart.removetext();
			   log.info("text is -"+acttext);
			   
			   String exptext ="EMOVE";
			   
			   //Hard assertion
			   Assert.assertEquals(acttext, exptext, "test case failed");
			   
			   
			   //Soft assertion:-
//			   a.assertEquals(acttext, exptext,"case failed");
//			   a.assertAll();
  }
  
     @Test
     public void clickiconfunction() throws InterruptedException
    {
       Thread.sleep(4000);
	   Homepage hp = new Homepage(driver);
	   hp.cartbutton();
	   log.info("clicked on cart icon and moved to your cart");
	   
	   String acturl=driver.getCurrentUrl();
	   String expurl="https://www.saucedemo.com/cart.html";
	   
	   //hard assertion:-
	   Assert.assertEquals(acturl, expurl,"URL not matched");
	   log.info("case passed");
	   
	   
	   //soft assert :-
//	   a.assertEquals(acturl, expurl,"test case failed");
//	   a.assertAll();
	   
    }
		
}
