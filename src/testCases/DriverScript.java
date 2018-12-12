package testCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configurations.InputValues;
import customFactory.DriverFactory;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

//@Listeners(utilities.TestNgReport.class)
public class DriverScript extends BasePage{

	public static String URL=InputValues.getURL();;
	//private static WebDriver driver;
	
	// This is to Instantiate pages				
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeTest(groups={"Module1"})
	public void setUp(){
		
		initReport();
	}
	
	@BeforeClass(groups={"Module1"})
	public void initDriver(){
		DriverFactory.launchBrowser("Chrome");
	}
	
	@BeforeMethod(groups={"Module1"})
	public void initialize(ITestResult testCaseName){		
		
		DriverFactory.LoadApplication(URL);
		String testCase=testCaseName.getMethod().getMethodName();
		startTest(testCase);//To Add
		BasePage.testcaseName=testCase;
		// This is to Instantiate pages				
		loginPage=new LoginPage();
		homePage=new HomePage();
		
	}
	
	@Test(priority=0,groups={"Module1","Module2"},description="Invalid Login Scenario with wrong username and password.")
	public void Test_1010(){
				
				loginPage.logIn();

	}
	
	@Test(priority=1,groups={"Module1"},description="Invalid Login Scenario with wrong username and password1.")
	public void Test_1011(){
		
				//String testName = new Object(){}.getClass().getEnclosingMethod().getName().trim();
				homePage.clickAccount();

	}
	
	@Test(priority=2,groups={"Module2"},description="Invalid Login Scenario with wrong username and password2.")
	public void Test_1012(){
		
				homePage.clickAccount();
				
	}
	
	@Test(priority=3,groups={"Module2"},description="Invalid Login Scenario with wrong username and password3.")
	public void Test_1013(){

				homePage.LogOUt();

	}
	
	@Test(priority=4,groups={"Module1","Module2"},description="Invalid Login Scenario with wrong username and password.")
	public void Test_1014(){

				loginPage.logIn();

	}
	
	@AfterMethod(groups={"Module1"})
	public void closeTest(ITestResult testCaseName){
		
			
		String testCase=testCaseName.getMethod().getMethodName();
		endTest(testCase);//To add
	}
	
	@AfterClass(groups={"Module1"})
	public void endDriver(){
		DriverFactory.closeBrowser();
	}

	@AfterSuite(groups={"Module1"})
	public void tearDown(){
		endReport("end Report");//To add
	}
	

}
