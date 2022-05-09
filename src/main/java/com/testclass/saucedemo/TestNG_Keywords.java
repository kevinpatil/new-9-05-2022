package com.testclass.saucedemo;

import org.testng.annotations.Test;

public class TestNG_Keywords 
{

	@Test(invocationCount =3)
	public void testA()
	{
		System.out.println("TestA");
	}

	@Test(timeOut=2000)
	public void testB()
	{
		System.out.println("TestB");
	}
	
	@Test(priority=2)
	public void testC()
	{
		System.out.println("TestC");
	}
	
	@Test(enabled=false,priority=1)         //dont consider directly avoids method
	public void testD()
	{
		System.out.println("TestD");
	}
	
	@Test(dependsOnMethods= {"testC"},priority=1)
	public void testE()
	{
		System.out.println("TestE");
	}

}

	

