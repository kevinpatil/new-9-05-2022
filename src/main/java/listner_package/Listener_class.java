package listner_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testclass.saucedemo.BasetestClass;
import com.testclass.saucedemo.TS_Login_function;

import utilitypackage.Utilityclass;

public class Listener_class implements ITestListener
{
    WebDriver driver;
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case failed screenshot taken");
		
		this.driver =((BasetestClass)result.getInstance()).driver;
		try 
		{
			Utilityclass.Screenshot_method(driver);
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}	
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test passed");
	}
	
}
