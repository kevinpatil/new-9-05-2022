package com.testclass.saucedemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sequence_run_of_annotations extends BasetestClass
{
	
	//before method and after method will play role always with test class as of start and end as well:-
	//sequence is-: @Before method-->@Test-->@After method.....(in this way)

	@Test
	public void test1()
	{   
		System.out.println("test1");
				
	}

	
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	

	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	

	
	@Test
	public void test4()
	{
		System.out.println("test4");
	}

	
	
	
	
	
}
