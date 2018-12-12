package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ExtentReport;

public class BasePage extends ExtentReport{

	protected static WebDriver driver;
	public static String testcaseName;
	
	public  void setDriver(WebDriver driver){
		this.driver=driver;
	}
	
	
}
