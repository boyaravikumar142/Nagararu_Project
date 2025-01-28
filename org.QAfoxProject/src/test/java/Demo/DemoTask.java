package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTask {

	@Test
	public void demoTesting1() {

		// Create the SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the SparkReport Information
		spark.config().setDocumentTitle("FunctionalityTest||QaFox");
		spark.config().setReportName("FunctionalitySuite||Verify User Able to Add Desktop-Mac-Product");
		spark.config().setTheme(Theme.STANDARD);

		// Create the Extent Report
		ExtentReports report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in Extent Report
		report.setSystemInfo("Device Name:", "Nagaraju");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-131.0.6778.265");

		// Create the Test Information
		ExtentTest test = report.createTest("FunctionalityTest");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching The Browser Successfully");// Like Reporter.log it works
		test.log(Status.INFO, "Step2: Navigation To The Application Successfully");// Like Reporter.log it works
		test.log(Status.PASS, "Step3: Verified the Webpage Successfully");// Like Reporter.log it works

		if ("Nagaraju".equals("Nagaraju")) {
			test.log(Status.PASS, "Step4: verified the WebElement is Displayed");
		} else {
			test.log(Status.FAIL, "Step4: verified the WebElement is Not Displayed");
		}

		// test.log(Status.SKIP,"Step5: Element is Hidden");

		// Flush the Report Information
		report.flush();

		// Test Log
		System.out.println("Execution Done");

	}

}
