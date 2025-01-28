package org.QAfoxProject.ListenerFeature;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.GenericUtility.WebDriverLibrary;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseConfiguration implements ITestListener, IRetryAnalyzer {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("onTestStart..!!", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess..!!", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure..!!", true);

		// Fetch the Test Method Method Name
		String methodname = result.getName();

		// Provide the Implementation for Taking Screenshot

		// 1. Perform the Typecasting
		TakesScreenshot ts = (TakesScreenshot) WebDriverLibrary.static_driver;

		// 2. Call the Screenshot Method
		// 3. Store the Screenshot in Temp Path
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Use TimeStamp
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());

		// 4.Create the Permanent Path
		File destination = new File(
				"./TestScreenshot/" + methodname + timestamp + javalibraryobj.getCurrentTime() + ".png");

		// 5. Copy the Screenshot From Temp To Permanent Path
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Reporter.log("Test Failure Method Executed------Screenshot Taken", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped..!!", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage..!!", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout..!!", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart..!!", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish..!!", true);
	}

	@Override
	public boolean retry(ITestResult result) {
		Reporter.log("Retry..!!", true);

		int count = 0;
		int retryuntil = 2;
		boolean flag = false;

		if (count < retryuntil) {
			count++;
			flag = true;
		}
		return flag;
	}

}
