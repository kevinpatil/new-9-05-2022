package com.pomclass.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ordercompletepage 
{

	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//button[@id='back-to-products']")
    private WebElement backbutton;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	  private WebElement dropdown;
	  
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
    private WebElement logout;
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
    private WebElement verifytext;
	
	public Ordercompletepage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
		  
		  //declare actions class here and initialize globally
		  act= new Actions(driver);
	  }
		
	  public void backbutton()
	  {
		  //finish.click();
		  //OR use mouse action for click
		  act.click(backbutton).perform();
	  }
	  
	  public void dropdown()
	  {
		  dropdown.click();
	  }
	
	  public void logout()
	  {
		  logout.click();
	  }
	  
	  public String verifytext()
	  {
		  String result=verifytext.getText();
		  return result;
	  }
	
}
