package com.pomclass.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overviewpage 
{
  private WebDriver driver;
  private Actions act;
  
  @FindBy(xpath="//button[@id='finish']")
  private WebElement finish;
  
  @FindBy(xpath="//button[@id='cancel']")
  private WebElement cancel;
  
  public Overviewpage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  
	  //declare actions class here and initialize globally
	  act= new Actions(driver);
  }
	
  public void finish()
  {
	  //finish.click();
	  //OR use mouse action for click
	  act.click(finish).perform();
  }
  
  public void cancel()
  {
	  cancel.click();
  }
  
 
  
  
}
