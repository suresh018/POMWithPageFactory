package customFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.BasePage;

import configurations.InputValues;

public class DriverFactory {
	//private static Map<String, WebDriver> Drivers = new HashMap<String, WebDriver>();
    private static WebDriver driver;
    protected static BasePage basepage;
    
    public static WebDriver getDriver(){
    	//if(driver == null)
            //throw new NullPointerException("The WebDriver browser instance was not initialized. You should first call the method InitBrowser.");
        return driver;
    }

    //@BeforeClass
    public static void launchBrowser(String browserName)
    {          
        switch (browserName)
        {
            case "Firefox":
                if (getDriver() == null)
                {
                    driver = new FirefoxDriver();
                    //Drivers.put("Firefox", getDriver());
                }
                break;

            case "IE":
                if (getDriver() == null)
                {
                	
                    driver = new InternetExplorerDriver();
                    //Drivers.put("IE", getDriver());
                }
                break;

            case "Chrome":              
                	System.setProperty("webdriver.chrome.driver", InputValues.getChromeDriverPath());
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            		driver.manage().window().maximize();
                    //Drivers.put("Chrome", getDriver());
            		basepage= new BasePage();
            		basepage.setDriver(driver);
                    
                
                break;
        }            
    }
    public static void LoadApplication(String url)
    {
        driver.get(url);
    }

    //@AfterClass
    public static void closeBrowser()
    {
    	driver.quit();
    	//driver.close();
        /*for(Map.Entry<String, WebDriver> drv: Drivers.entrySet())
        {
        	drv.getValue().close();
        	drv.getValue().quit();
        }*/
    }
}
