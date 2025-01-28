package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the RegisterAccountPage
 * @author NAGARAJU
 **/

public class RegisterAccountPage {
	
	//1. Declaration of Web Elements
	@FindBy(id = "input-firstname")
	private WebElement firstnametextfield;
	
	@FindBy(name = "lastname")
	private WebElement lastnametextfield;
	
	@FindBy(id = "input-email")
	private WebElement emailtextfield;
	
	@FindBy(name = "telephone")
	private WebElement telephonetextfield;
	
	@FindBy(name = "password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmpasswordtextfield;
	
	@FindBy(xpath = "//input[@type='radio' and @name='newsletter' and @value='1']")
	private WebElement yesradiobutton;
	
	@FindBy(xpath = "//label[text()='No']")
	private WebElement noradiobutton;
	
	@FindBy(name = "agree")
	private WebElement privacycheckbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebutton;
	
	//2. Initialization of WebElement--Using Constructor
	public RegisterAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilization of WebElements
	/**
	 * @return the firstnametextfield
	 */
	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	/**
	 * @return the lastnametextfield
	 */
	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	/**
	 * @return the emailtextfield
	 */
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	/**
	 * @return the telephonetextfield
	 */
	public WebElement getTelephonetextfield() {
		return telephonetextfield;
	}

	/**
	 * @return the passwordtextfield
	 */
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	/**
	 * @return the confirmpasswordtextfield
	 */
	public WebElement getConfirmpasswordtextfield() {
		return confirmpasswordtextfield;
	}

	/**
	 * @return the yesradiobutton
	 */
	public WebElement getYesradiobutton() {
		return yesradiobutton;
	}

	/**
	 * @return the noradiobutton
	 */
	public WebElement getNoradiobutton() {
		return noradiobutton;
	}

	/**
	 * @return the privacycheckbox
	 */
	public WebElement getPrivacycheckbox() {
		return privacycheckbox;
	}

	/**
	 * @return the continuebutton
	 */
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
}