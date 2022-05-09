package com.pomclass.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	//declare global driver variable and private always all variables:-
    private	WebDriver driver;
	
	//declare all web element :-
	
	@FindBy(xpath="(//html//div//input)[1]")
	private WebElement username;
	
	@FindBy(xpath="(//html//div//input)[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@id='login-button'])")
	private WebElement login;
	
	//now declare constructor:-
	
	public Loginpage(WebDriver driver)
	{   
		//identify global var driver by this
		this.driver = driver;
		
		//selenium class -->initElemets method of pagefactory class
		PageFactory.initElements(driver, this);
		
    }
	
	//now declare methods for each webelement as public
	 public void username()
	 {
		 username.sendKeys("standard_user");
	 }
	
	 public void password()
	 {
		 password.sendKeys("secret_sauce");
	 }
	 
	 public void login()
	 {
		 login.click();
	 }
	 
	 
	 
}
