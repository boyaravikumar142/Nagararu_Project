package AutomationExercise_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the AccountDeletedPage
 * @author NAGARAJU
 **/

public class AccountDeletedPage {

	//1. Declaration of all the Web Elements
	@FindBy()
	private WebElement accountdeleted_titletext;
	
	@FindBy()
	private WebElement continuebutton;
	
	//2. Initialization of all the Web Elements
	public AccountDeletedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilization of all the Web Elements
	/**
	 * @return the accountdeleted_titletext
	 */
	public WebElement getAccountdeleted_titletext() {
		return accountdeleted_titletext;
	}

	/**
	 * @return the continuebutton
	 */
	public WebElement getContinuebutton() {
		return continuebutton;
	}
}