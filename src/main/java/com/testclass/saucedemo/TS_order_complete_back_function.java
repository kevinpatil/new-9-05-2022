package com.testclass.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;
import com.pomclass.saucedemo.Ordercompletepage;
import com.pomclass.saucedemo.Overviewpage;
import com.pomclass.saucedemo.Yourcart;
import com.pomclass.saucedemo.Yourinfopage;

@Listeners(listner_package.Listener_class.class)
public class TS_order_complete_back_function extends BasetestClass
{

	@Test
	public void ordercomplete_backbutton()
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
	  			   log.info("moved to your cart");
	  			   //now check checkout function:-
	  			   
	  			   Yourcart x = new Yourcart(driver);
	  			   x.checkout();
	  			   log.info("clicked on checkout");
	  			   log.info("move to your info page");
	  	 
	  	 
	  			   Yourinfopage x1 = new Yourinfopage(driver);
	  			   
	  			   x1.firstname();
	  			   log.info("Fn entered");
	  			   
	  			   x1.lastname();
	  			   log.info("Ln entered");
	  			   
	  			   x1.zipcode();
	  			   log.info("zip code entered");
	  			   
	  			   x1.continuebutton();
	  			   log.info("clicked on continue button");
	  			   log.info("moved to Overview page");
			 
			 
	  			 Overviewpage page = new Overviewpage(driver);
	  			 page.finish();
	  			 log.info("order placed");
	  			 
	  			 //last page
	  			 
	  			Ordercompletepage p= new Ordercompletepage(driver);
	  			p.backbutton();
	  			
	  			String acturl=driver.getCurrentUrl();
	  			String expurl="https://www.saucedemo.com/inventory.html";
		
		        Assert.assertEquals(acturl, expurl,"order complete case failed");
		        log.info("order complete case passed");
		
	}
}
