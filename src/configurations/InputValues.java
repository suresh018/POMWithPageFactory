package configurations;

public class InputValues {
	
	private static  String URL="http://www.phptravels.net/";
	private static  String pathChromeDriver="D:\\Automation\\AutomationFramework\\PageObjcetWithPageFactory\\drivers\\chromedriver_win32\\chromedriver.exe";
	private static String xmlPath="D:\\Automation\\AutomationFramework\\PageObjcetWithPageFactory\\src\\testData\\testdata.xml";
	public static String extentReportPath="D:\\Automation\\AutomationFramework\\PageObjcetWithPageFactory\\src\\Reports\\reports.html";
	public static String extentConfig="D:\\Automation\\AutomationFramework\\PageObjcetWithPageFactory\\src\\configurations\\extent-config.xml";
	
	public static String getURL(){
		return URL;
	}
	public static String getChromeDriverPath(){
		return pathChromeDriver;
	}
	public static String getxmlPath(){
		return xmlPath;
	}

}
