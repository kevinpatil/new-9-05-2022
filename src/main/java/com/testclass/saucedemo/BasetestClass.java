package com.testclass.saucedemo;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pomclass.saucedemo.Homepage;
import com.pomclass.saucedemo.Loginpage;

import utilitypackage.Utilityclass;

public class BasetestClass  
{
	Logger log;
    public WebDriver driver;
    @Parameters("browserName")
    
	@BeforeClass
	public void Url(String browserName) throws IOException
	{
    	log =Logger.getLogger("Maven_Saucedemo1V1");
    	PropertyConfigurator.configure("log4j.properties");
    	
    	if(browserName.equals("chrome"))
    	{
		    System.setProperty("webdriver.chrome.driver", 
	       "C:\\Users\\Kevin\\Desktop\\Selenium files\\Browser\\chromedriver.exe");
				   
		   driver = new ChromeDriver();
	 	  // System.out.println("Browser opened");
	 	   log.info("browser opened");
    	}
    	else if(browserName.equals("firefox"))
    	{ 
	 	  System.setProperty("webdriver.gecko.driver",
	 	  "C:\\Users\\Kevin\\Desktop\\Selenium files\\Browser\\geckodriver.exe");
	 		        
	 	  driver= new FirefoxDriver();
	    //System.out.println("Browser opened");
	 	  log.info("browser opened");
    	}
    	else
    	{
    		System.out.println("show error");
    	}
			
    	
	 	   driver.get("https://www.saucedemo.com/");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   
		   log.info("URL opened");
//		   Utilityclass.Screenshot_method(driver);
	}
	
	@BeforeMethod
	public void loginmethod() throws IOException, InterruptedException
	{
		   Loginpage lp = new Loginpage(driver);
		  
		   lp.username();
		   lp.password();
		   lp.login();
		   
		   log.info("credential passed");
	       log.info("user login successfully");
		   Thread.sleep(3000);
//		   Utilityclass.Screenshot_method(driver);
	}
	
	@AfterMethod()
	public void logoutmethod() throws IOException
	{
		 Homepage logoutfunction = new Homepage(driver);
		 logoutfunction.dropdown();
		 logoutfunction.logout();
		 
		 log.info("User Log out");
//		 Utilityclass.Screenshot_method(driver);
		 
	}
	
	@AfterClass()
	public void closebrowser()
	{
		driver.quit();
		log.info("browser closed");
	}
	
	
	
}
