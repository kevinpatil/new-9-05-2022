package com.testclass.saucedemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_and_Soft_assertions 
{
	//for soft assertion soft class object require:-(declare globally in test class)
	//for soft assert always use assertall method in last .
	
    SoftAssert soft = new SoftAssert();
	
	@Test
	public void verifyLogin()
	{
		//example for soft assertion
		//s1(Url)
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
	    String actaulUrl = "https://www.saucedemo.com/inventory.html";
	    
	    Assert.assertEquals(expectedUrl, actaulUrl, "url not matched");  //fail
	
	
	//s2(title)
	
	    String expectedTitle = "SauceDemo";
	    String actualTitle = "SauceDemo";
	    soft.assertEquals(expectedTitle, actualTitle, "title not matched");  //pass
	
	
	}
	
	@Test
	public void verifyProduct()
	{
		String expectedTitle ="BagPack";
		String actualTitle ="BagPack";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
//		soft.assertEquals(expectedTitle, actualTitle, "product title not matched");  //pass		
//		soft.assertAll();
	}
	
	@Test
	public void sampleTest()
	{
		int a = 50;
		int b = 60;
		
		Assert.assertTrue(a<=b,"result is false");
	}

	
}
