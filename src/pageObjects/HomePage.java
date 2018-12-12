package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.Selenium;

public class HomePage extends BasePage{
	//private WebDriver driver;
	
	public HomePage(){
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="(//a[contains(text(),'Johny')])[2]")
	private WebElement lnkAccountName;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Account")
	private WebElement lnkAccount;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Logout")
	private WebElement lnkLogOut;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Home")
	private WebElement lnkHome;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Hotels")
	private WebElement lnkHotels;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Flights")
	private WebElement lnkFlights;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Tours")
	private WebElement lnkTours;
	
	public void LogOUt(){
		try {
			Thread.sleep(2000);
			
			lnkAccountName.click();
			//lnkAccountName.click();
			Thread.sleep(2000);
			
			lnkLogOut.click();
			//lnkLogOut.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void clickAccount(){
		try {
			Thread.sleep(2000);
				
			lnkAccountName.click();
			//lnkAccountName.click();
			Thread.sleep(2000);
			
			lnkAccount.click();
			//lnkAccount.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void clickHome(){
		lnkHome.click();
	}
	
	public void clickTours(){
		lnkTours.click();
	}
	
	public void clickFlights(){
		lnkFlights.click();
	}
	
	public void clickHotels(){
		lnkHotels.click();
	}

}
