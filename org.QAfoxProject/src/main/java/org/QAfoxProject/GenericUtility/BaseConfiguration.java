package org.QAfoxProject.GenericUtility;

import java.time.Duration;

import org.QAfoxProject.PageRepository.AccountLoginPage;
import org.QAfoxProject.PageRepository.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This Class Describes the Configuration For TestScript
 * 
 * This Class Describes the Configure All PreCondition and Post Condition for
 * TestScript
 * 
 * And also Initializing All the library utility
 * 
 * @author NAGARAJU
 */

public class BaseConfiguration {
	public WebDriver driver;
	public WebDriverLibrary webdriverobj;
	public ExcelFileLibrary excelutilityobj;
	public PropertyFileLibrary propertyfileobj;
	public JavaLibrary javalibraryobj;
	public JavaScriptLibrary jsutilityobj;
	public TakesScreenshotLibrary tsutilityobj;

	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	/**
	 * This Method is Used To Configure the Browser Setup
	 * 
	 * @param
	 **/

	@BeforeClass
	public void browserSetup() {

		WebDriverManager.chromedriver().setup();

		String browser = "chrome";
		String url = "https://tutorialsninja.com/demo/";

		// Precondition1:- Launch the Browser
		webdriverobj.launchBrowser(browser);
		Reporter.log("Browser Launced Successfully", true);

		// Precondition2:- Navigate To the Application
		webdriverobj.navigatetoApp(url);
		Reporter.log("Navigate to the Browser Performed Successfully", true);

		// Precondition3:- Maximize the Browser
		webdriverobj.maximizeBrowser();
		Reporter.log("Maximizing the Browser Performed Successfully", true);

	}

	/**
	 * This Method is Used To COnfigure the Browser Terminated
	 *
	 **/

	@AfterClass
	public void browserTerminate() {

		// PostCondition1:- Close the Browser
		webdriverobj.closeBrowser();
		Reporter.log("Browser Terminated Successfully", true);

	}

	/**
	 * This Method is Used To Perform the Login Activity
	 *
	 **/

	@BeforeMethod(enabled = true)
	public void login() {

		// PROVIDE WAIT STATEMENT
		webdriverobj.waitUntilElementFound();

		HomePage homeobj = new HomePage(webdriverobj.driver);

		// PROVIDE WAIT STATEMENT
		WebElement element1 = homeobj.getMyaccountheaderlink();
		webdriverobj.waitUntilElementFound(element1);
		// click on myaccount headerlink
		homeobj.getMyaccountheaderlink().click();

		// click on the Register account
		// homeobj.getRegister_headerlink().click();

		// click on the Login Login header link
		homeobj.getLogin_headerlink().click();

		// click on "My account" Header_Link
		AccountLoginPage loginobj = new AccountLoginPage(webdriverobj.driver);

		String email = "ynagaraju.raju@gmail.com";
		String password = "Naga@1234";

		// click on myaccount emailaddress textfield and pass the data
		loginobj.getEmailaddresstextfield().sendKeys(email);
		// Enter the Password textfield and pass the data
		loginobj.getPasswordtextfield().sendKeys(password);
		// click on the Login header link
		loginobj.getLoginintoaccountbutton().click();

		// Test Log
		Reporter.log("Browser Login Successfully", true);

	}

	/**
	 * This Method is Used To Perform the Logout Activity
	 * 
	 **/

	@AfterMethod
	public void logout() {

		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Perform mouse HoverAction---->Desktop
		webdriverobj.mouseHoverToElement(homeobj.getMyaccountheaderlink());
		javalibraryobj.pause(5000);
		homeobj.getMyaccountheaderlink().click();

		webdriverobj.mouseHoverToElement(homeobj.getLogout());
		javalibraryobj.pause(2000);
		homeobj.getLogout().click();

		// homeobj.getContinuebutton().click();
		// Test
		Reporter.log("Browser Logout Successfully", true);

	}

	/**
	 * This Method is Used To get/Configure the TestRunner level Connection
	 * 
	 **/

	@BeforeTest
	public void getTestRunnerConnection() {

		// Test
		Reporter.log("Getting TestRunnerConnection Successfully", true);

	}

	/**
	 * This Method is Used To Terminate/Configure the TestRunner level Connection
	 * 
	 **/

	@AfterTest
	public void terminatetestRunnerConnection() {

		// Test
		Reporter.log("Terminate TestRunnerConnection Successfully", true);

	}

	/**
	 * This Method is Used To Get/Configure the Database or Advance Report
	 * Connection
	 * 
	 * @param
	 **/

	@BeforeSuite
	public void getReportConnection() {
		// Initialize all the Library
		initobjects();

		// Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the SparkReport Information
		spark.config().setDocumentTitle("FunctionalityTest||QaFox");
		spark.config().setReportName("FunctionalitySuite||Verify User Able to Add Desktop-Mac-Product");
		spark.config().setTheme(Theme.STANDARD);

		// Create the Extent Report
		report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in Extent Report
		report.setSystemInfo("Device Name:", "Nagaraju");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-131.0.6778.265");

		// Test Log
		Reporter.log("Getting ReportConnection Successfully", true);

	}

	/**
	 * This Method is Used To Terminate the Database or Advance Report Connection
	 * Connection
	 * 
	 **/

	@AfterSuite
	public void terminateReportConnection() {

		// Flush the Report Information
		report.flush();

		// Test Log
		Reporter.log("Terminate ReportConnection Successfully", true);

	}

	public void initobjects() {

		webdriverobj = new WebDriverLibrary();
		excelutilityobj = new ExcelFileLibrary();
		propertyfileobj = new PropertyFileLibrary();
		javalibraryobj = new JavaLibrary();
		jsutilityobj = new JavaScriptLibrary();
		tsutilityobj = new TakesScreenshotLibrary();
	}

}