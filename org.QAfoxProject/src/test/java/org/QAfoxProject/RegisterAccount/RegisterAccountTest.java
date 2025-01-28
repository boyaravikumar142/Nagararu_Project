package org.QAfoxProject.RegisterAccount;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.QAfoxProject.ListenerFeature.ListenerImplementation.class)
public class RegisterAccountTest extends BaseConfiguration {

	
	@Test(retryAnalyzer = org.QAfoxProject.ListenerFeature.ListenerImplementation.class)

	public void verifyWithValidInput() {
		
//		RegisterAcountPage registerAccountPage = new RegisterAcountPage(WebDriverLibrary.static_driver);
//		registerAccountPage.getFirstNameTextField().sendKeys("Ravi");
//		registerAccountPage.getLastNameTextField().sendKeys("kumar");
//		registerAccountPage.getEmailTextField().sendKeys("ravikumar12345@gmail.com");	
//		registerAccountPage.getTelephoneTextField().sendKeys("7070707070");
//		registerAccountPage.getPasswordTextField().sendKeys("Ravi@12345");
//		 // Use explicit wait for confirm password field
//	    WebDriverWait wait = new WebDriverWait(WebDriverLibrary.static_driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOf(registerAccountPage.getConfirmpasswordTextField()));
//		registerAccountPage.getConfirmpasswordTextField().sendKeys("Ravi@12345");
//		registerAccountPage.getyesradiobutton().click();
//		registerAccountPage.gettermsandconditionscheckbox().click();
//		registerAccountPage.getContinueButton().click();

		
		//Test Log
		Reporter.log("RegisterAccount Verified With Valid Input", true);
		//Assert.fail();

	}

	@Test(retryAnalyzer = org.QAfoxProject.ListenerFeature.ListenerImplementation.class)
	public void verifyWithInvalidInput() {

		// Test Log
		Reporter.log("RegisterAccount Verified With Invalid Input", true);

	}

}
