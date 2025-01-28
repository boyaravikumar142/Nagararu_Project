package AutomationExercise_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class BaseConfigurationClass {

	// Declaration
	public WebDriver driver;
	public ExtentTest test;

	@BeforeSuite
	public void getReportConnection() {

		// Test Log
		Reporter.log("Getting ReportConnection Successfully", true);

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

	@BeforeClass

	public void browserSetup() {

		System.out.println("Browser Setup Started");

		// configure the Browser
		WebDriverManager.chromedriver().setup();

		// Step1:- Launch the Web Browser
		// Variable initialization
		driver = new ChromeDriver();

		// Maximize the Web Browser
		driver.manage().window().maximize();

		// Step2:- Navigate to the Application via URL
		driver.get("https://www.automationexercise.com/");

		System.out.println("Browser Setup all Steps Executed");
	}

	@BeforeMethod

	public void login() {

		// Enter the Valid UserName
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		// Enter the Valid Password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

		// Perform the Click on the Login Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("Login Performed Successfully");

	}

	@AfterMethod

	public void logout() {

		// Perform the Click Operation on the "Details Menu" in the WebPage
		driver.findElement(By.xpath("//div[@class='app_logo']/../preceding-sibling::div//button[@id='react-burger-menu-btn']")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Perform the Click Operation on the "Logout" Button
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

		System.out.println("Logout Performed Successfully");

	}

	@AfterClass

	public void browserTerminate() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the Web Browser
		driver.quit();

		System.out.println("Browser Terminated");
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

	@AfterSuite
	public void terminateReportConnection() {

		//Test Log
		Reporter.log("Terminate ReportConnection Successfully", true);

	}

}