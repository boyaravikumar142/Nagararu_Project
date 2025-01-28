package AutomationExercise_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the Signup_Page
 * @author NAGARAJU
 **/

public class Signup_Page {

	//1. Declaration of all the Web Elements
	@FindBy()
	private WebElement newuser_signup_text;
	
	@FindBy()
	private WebElement name_titletext;
	
	@FindBy()
	private WebElement name_textfield;
	
	@FindBy()
	private WebElement signup_button;
	
	//2. Initialization of all Web Elements
	public Signup_Page(WebDriver driver) {
		PageFactory.initElements(driver, null);
	}

	//3. Utilization of all Web Elements
	/**
	 * @return the newuser_signup_text
	 */
	public WebElement getNewuser_signup_text() {
		return newuser_signup_text;
	}

	/**
	 * @return the name_titletext
	 */
	public WebElement getName_titletext() {
		return name_titletext;
	}

	/**
	 * @return the name_textfield
	 */
	public WebElement getName_textfield() {
		return name_textfield;
	}

	/**
	 * @return the signup_button
	 */
	public WebElement getSignup_button() {
		return signup_button;
	}
		
}