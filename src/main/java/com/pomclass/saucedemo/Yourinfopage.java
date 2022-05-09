package com.pomclass.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourinfopage 
{
  private WebDriver driver;
  
  @FindBy(xpath="//input[@id='first-name']")
  private WebElement fn;
	
  @FindBy(xpath="(//html//div//input)[2]")
  private WebElement ln;
	
  @FindBy(xpath="(//html//div//input)[3]")
  private WebElement zipcode;
  
  @FindBy(xpath="//button[@id='cancel']")
  private WebElement cancleorder;
  
  @FindBy(xpath="//input[@id='continue']")
  private WebElement continuebutton;
  
  @FindBy(xpath="//span[text()='Your Cart']")
  private WebElement canceltext;
  
  public Yourinfopage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void firstname()
  {
	  fn.sendKeys("KP");
  }
  
  public void lastname()
  {
	  ln.sendKeys("Patil");
  }
  
  public void zipcode()
  {
	  zipcode.sendKeys("1234");
  }
  
  public void cancleorder()
  {
	  cancleorder.click();
  }
  
  public void continuebutton()
  {
	  continuebutton.click();
  }
  
  public String canceltext()
  {
	  String text= canceltext.getText();
	  return text;
  }
  
  
  }

