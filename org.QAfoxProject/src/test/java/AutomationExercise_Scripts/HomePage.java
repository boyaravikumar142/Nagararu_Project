package AutomationExercise_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the HomePage
 * @author NAGARAJU
 **/

public class HomePage {

	//1. Declaration of all the Web Elements
	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement home_headerlink_text;
	
	@FindBy()
	private WebElement home_headerlink;
	
	@FindBy()
	private WebElement signup_loginbutton;
	
	@FindBy()
	private WebElement logout_button;
	
	@FindBy()
	private WebElement deleteaccount_headerlink_text;
	
	@FindBy()
	private WebElement deleteaccount_headerlink;
	
	@FindBy()
	private WebElement loggedinasusername_titletext;
	
	//2. Initialization of all the Web Elements
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, null);
	}

	//3. Utilization of all the Web Elements
	/**
	 * @return the home_headerlink_text
	 */
	public WebElement getHome_headerlink_text() {
		return home_headerlink_text;
	}

	/**
	 * @return the home_headerlink
	 */
	public WebElement getHome_headerlink() {
		return home_headerlink;
	}

	/**
	 * @return the signup_loginbutton
	 */
	public WebElement getSignup_loginbutton() {
		return signup_loginbutton;
	}

	/**
	 * @return the logout_button
	 */
	public WebElement getLogout_button() {
		return logout_button;
	}

	/**
	 * @return the deleteaccount_headerlink_text
	 */
	public WebElement getDeleteaccount_headerlink_text() {
		return deleteaccount_headerlink_text;
	}

	/**
	 * @return the deleteaccount_headerlink
	 */
	public WebElement getDeleteaccount_headerlink() {
		return deleteaccount_headerlink;
	}

	/**
	 * @return the loggedinasusername_titletext
	 */
	public WebElement getLoggedinasusername_titletext() {
		return loggedinasusername_titletext;
	}
	
}