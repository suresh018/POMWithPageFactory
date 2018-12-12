package utilities;

import org.openqa.selenium.WebElement;

public class Selenium {
	
	public static void inputText(WebElement we,String input){
		we.clear();
		we.sendKeys(input);
	}
	
	public static void clickElement(WebElement we){
		we.click();
	}

}
