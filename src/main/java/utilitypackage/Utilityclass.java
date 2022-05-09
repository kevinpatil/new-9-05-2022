package utilitypackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass 
{

	public static void Screenshot_method(WebDriver driver) throws IOException
	{
		
	Date date = new Date();
	DateFormat d = new SimpleDateFormat("dd-MM-yy & HH-mm-ss");
	String newDate = d.format(date);
		
	TakesScreenshot ts = (TakesScreenshot)driver;         
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("F:\\Velocity IMP Notes\\Automation Testing\\Automation Notes"
			+ "\\0.Testing Screenshots\\image" +newDate+".jpg");
	
	FileHandler.copy(source, dest);
	}
	
	
	
}
