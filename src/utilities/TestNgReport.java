package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestNgReport implements ITestListener {
	//public ExtentReports reports;
	//public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test start,");
		//test=reports.startTest(result.getMethod().getMethodName());
		//test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test is started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test success");
		//test.log(LogStatus.PASS, result.getMethod().getMethodName() + "test is passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test failure");
		//test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test skipped");
		//test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("on test sucess within percentage");
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on start");
		//reports=new ExtentReports("D:\\Automation\\AutomationFramework\\PageObjcetWithPageFactory\\Reports"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on Finish");
		//reports.endTest(test);
		//reports.flush();
	}
	

	
	
	

}
