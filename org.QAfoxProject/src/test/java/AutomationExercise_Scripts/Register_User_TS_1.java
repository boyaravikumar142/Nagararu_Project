package AutomationExercise_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_User_TS_1{

	@Test
	public void register_NewUser() {
		
		//Configure the Browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Web Browser
		driver.manage().window().maximize();
		
		//Navigate to the Application via url
		driver.get("https://www.automationexercise.com/");
		
		//Validate the Application URL using Assertion
		String expectedurl = "https://www.automationexercise.com/";
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, expectedurl);
		//test.log(Status.PASS, "Step 1:- URL of the Application Verified Successfully");
		
		//Validate the Application Title using Assertion
		String expectedtitle = "Automation Exercise";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, expectedtitle);
		//test.log(Status.PASS, "Step 2:- Web Application Title Verified Successfully");
		
		//Create the Object for the HomePage
		HomePage homeobj = new HomePage(driver);
		
		//Validate the Home Page using Assertion
		String expected_homepage = " Home";
		String actual_homepage = homeobj.getHome_headerlink_text().getText();
		System.out.println(actual_homepage);
		Assert.assertEquals(actual_homepage, expected_homepage);
		//test.log(Status.PASS, "Step 3:- Home Page Title Text Verified Successfully");
		
		homeobj.getHome_headerlink_text().click();

	}

}
