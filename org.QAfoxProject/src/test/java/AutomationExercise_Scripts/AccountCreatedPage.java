package AutomationExercise_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the AccountCreatedPage
 * @author NAGARAJU
 **/

public class AccountCreatedPage {

	//1. Declaration of all the Web Elements
	@FindBy()
	private WebElement accountcreated_titletext;
	
	@FindBy()
	private WebElement continuebutton;
	
	//2. Initialization of all the Web Elements
	public AccountCreatedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilization of all the Web Elements
	/**
	 * @return the accountcreated_titletext
	 */
	public WebElement getAccountcreated_titletext() {
		return accountcreated_titletext;
	}

	/**
	 * @return the continuebutton
	 */
	public WebElement getContinuebutton() {
		return continuebutton;
	}
}
