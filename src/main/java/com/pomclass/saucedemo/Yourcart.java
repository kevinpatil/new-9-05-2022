package com.pomclass.saucedemo;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourcart 
{
  private WebDriver driver;
  
  @FindBy(xpath="//button[@id='checkout']")
  private WebElement checkout;
  
  @FindBy(xpath="//button[@id='continue-shopping']")
  private WebElement cotinue;
  
  @FindBy(xpath="//button[@class='btn btn_secondary btn_small cart_button']")
  private WebElement remove;
  
  @FindBy(xpath="//span[@class='shopping_cart_badge']")
  private WebElement removetext;
  
  
  public Yourcart(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
	
  public void checkout()
  {
	  checkout.click();
  }
	
  public void cotinueshopping()
  {
	  cotinue.click();
  }
  	
  public void remove()
  {
	  remove.click();
  }
  
  public boolean removetext()
  {
	  boolean text = removetext.isDisplayed();
	  return text;
	  
  }
}
