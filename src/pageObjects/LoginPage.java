package pageObjects;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import utilities.ExtentReport;
import utilities.Selenium;
import utilities.XMLUtilities;
import configurations.InputValues;

public class LoginPage extends BasePage{
	//private  WebDriver driver;
	
	
	public LoginPage(){
		//this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]")
	private WebElement myAccount;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Login")
	private WebElement linkLogin;
	
	@FindBy(how=How.NAME,using="username")
	private WebElement txtBox_UserName;
	
	@FindBy(how=How.NAME, using="password")
	private WebElement txtBox_Password;
	
	@FindBy(how=How.CSS, using=".btn-action")
	private WebElement btn_LogIn;

	public void logIn( ){
		XMLUtilities xmlUtilities=new XMLUtilities();
		Map<String,String> testdata=new HashMap<>();
		try {
			Thread.sleep(2000);
			Selenium.clickElement(myAccount);
			Selenium.clickElement(linkLogin);
			//myAccount.click();
			//linkLogin.click();
			Thread.sleep(3000);
			//WebElement txtBox_UserName1=driver.findElement(By.name("username"));
			

			testdata=xmlUtilities.getTestData(BasePage.testcaseName);
			String userName=testdata.get("username");
			String passWord=testdata.get("password");
			
			
			txtBox_UserName.sendKeys(userName);
			//txtBox_UserName.sendKeys(InputValues.getuserName());
			
			txtBox_Password.sendKeys(passWord);
			//txtBox_Password.sendKeys(InputValues.getpassWordL());
			btn_LogIn.click();
			
			Thread.sleep(2000);
			if(driver.getTitle().contains("account")){
				PASS("Login Successfull.");
			}
			else{
				FAIL("Loginpage is taking too much time to login. Login fail.");
			}
			
			
			
			//btn_LogIn.click();
			//Selenium.clickElement(btn_LogIn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			FAIL("Login fail with error :"+e.getMessage());
		}
		
	}
	

}
