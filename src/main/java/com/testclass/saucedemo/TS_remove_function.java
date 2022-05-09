package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Yourcart;

@Listeners(listner_package.Listener_class.class)
public class TS_remove_function extends BasetestClass
{
   @Test
   public void remove_functionality()
   {
	    	   //now go for select product and click on add to cart:-
			   
			   Homepage hp = new Homepage(driver);
			   hp.filter();
			   log.info("clicked on filter");
			   log.info("Price low to high");
			   
			   hp.addtocart();
			   log.info("red t-shirt added to cart");
			   
			   hp.cartbutton();
			   log.info("clicked on cart icon");
			   log.info("moved to your cart page");
	 
			   Yourcart x = new Yourcart(driver);
	           x.remove();
	           log.info("clicked on remove");
	           	           
	           
//	           x.removetext();     //will do this later no scenario found.
	           
	           
	        		   
	        		   
	        		   
   }
}
