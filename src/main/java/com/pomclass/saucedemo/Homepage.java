package com.pomclass.saucedemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage 
{
  //element for logout functionality:-
  private WebDriver driver;
  private Actions act;
  
  @FindBy(xpath="//button[@id='react-burger-menu-btn']")
  private WebElement dropdown;
  
  @FindBy(xpath="//a[@id='logout_sidebar_link']")
  private WebElement logout;
  
  //element for product select functionality:-
  
  @FindBy(xpath="//select[@class='product_sort_container']")
  private WebElement filter;
  	
  @FindBy(xpath="(//button[text()='Add to cart'])[1]")	
  private WebElement addtocart;
  
  @FindBy(xpath="//button[text()='Remove']")
  private WebElement removetext;
  
  @FindBy(xpath="//a[@class='shopping_cart_link']")
  private WebElement cartbutton;
  
  @FindBy(xpath="//html//body//div//div//button")
  private List<WebElement> allproduct;
  
  @FindBy(xpath="//span[@class='shopping_cart_badge']")
  private WebElement carttext;
  
  public Homepage(WebDriver driver)
  {
	  this.driver = driver;
	  
	  PageFactory.initElements(driver, this);
	  
	  act= new Actions(driver);	  
  }
  
  public void dropdown()
  {
	  dropdown.click();
  }
  
  public void logout()
  {
	  logout.click();
  }
  
  public void filter()
  {
	  filter.click();
	  Select s =new Select(filter);
	  s.selectByVisibleText("Price (low to high)");
  }
  
  public void addtocart()
  {
	  addtocart.click();	 
  }
  
  public String removetext()
  {
	  String text = removetext.getText();
	  return text;	
  }
  
  public void cartbutton()
  {
	  cartbutton.click();
	 
  }
  
  public void allproduct() throws InterruptedException
  {
	  for(int i=2;i<allproduct.size();i++)
	  {
		  allproduct.get(i).click();
		  Thread.sleep(2000);
	  }
  }
  
  public String carttext()
  {
	  String text1 = carttext.getText();
	  return text1;
  }
  
}
