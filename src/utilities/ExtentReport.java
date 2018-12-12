package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import configurations.InputValues;

public class ExtentReport {
	public static ExtentReports reports;
	public static ExtentTest test;
	
	public ExtentReports initReport(){
		try{
			//reports=new ExtentReports(System.getProperty("user.dir")+"\\Reports\\reports.html",true);
			//reports.loadConfig(new File(System.getProperty("user.dir")+"\\configurations\\extent-config.xml"));
			reports=new ExtentReports(InputValues.extentReportPath,true);
			reports.loadConfig(new File(InputValues.extentConfig));
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		return reports;
	}
	
	public void startTest(String msg){
		test=reports.startTest(msg);
		INFO(msg+" started.");
	}
	

	public void endTest(String msg){
		reports.endTest(test);
		INFO(msg+" Ended.");
	}
	
	public void endReport(String msg){
		reports.flush();
		reports.close();
	}
	
	public void PASS(String message){
		test.log(LogStatus.PASS, message);
	}
	public void FAIL(String message){
		test.log(LogStatus.FAIL, message);
	}
	public void SKIP(String message){
		test.log(LogStatus.SKIP, message+" Test skipped");
	}
	public void INFO(String message){
		test.log(LogStatus.INFO, message);
	}
	public void testCaseStarted(String message){
		test.log(LogStatus.INFO, message+" Execution started.");
	}
	public void testCaseFinished(String message){
		test.log(LogStatus.INFO, message+" Execution completed.");
	}

}
