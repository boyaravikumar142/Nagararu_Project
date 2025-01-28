package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the AccountLoginPage
 * @author NAGARAJU
 **/

public class AccountLoginPage {

	//1. Declaration of the WebElements
	@FindBy(id = "input-email")
	private WebElement emailaddresstextfield;
	
	@FindBy(name = "password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginintoaccountbutton;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Log')]")
	private WebElement loginwindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Reg')]")
	private WebElement registerwindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Forgot')]")
	private WebElement forgottenpasswordwindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'My')]")
	private WebElement myaccountwindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Address')]")
	private WebElement addressbookwindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Wish')]")
	private WebElement wishlistwindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Order')]")
	private WebElement orderhistorywindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Down')]")
	private WebElement downloadswindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Rec')]")
	private WebElement recurringpaymentswindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Reward')]")
	private WebElement rewardpointswindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Returns')]")
	private WebElement returnswindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'Trans')]")
	private WebElement transactionswindowbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'Return')]/../../../../following-sibling::aside//a[contains(text(),'News')]")
	private WebElement newsletterwindowbutton;
	
	//2. Initialization of the WebElements
	public AccountLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//3. Utilization of the WebElements
	/**
	 * @return the emailaddresstextfield
	 */
	public WebElement getEmailaddresstextfield() {
		return emailaddresstextfield;
	}

	/**
	 * @return the passwordtextfield
	 */
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	/**
	 * @return the loginintoaccountbutton
	 */
	public WebElement getLoginintoaccountbutton() {
		return loginintoaccountbutton;
	}

	/**
	 * @return the continuebutton
	 */
	public WebElement getContinuebutton() {
		return continuebutton;
	}

	/**
	 * @return the loginwindowbutton
	 */
	public WebElement getLoginwindowbutton() {
		return loginwindowbutton;
	}

	/**
	 * @return the registerwindowbutton
	 */
	public WebElement getRegisterwindowbutton() {
		return registerwindowbutton;
	}

	/**
	 * @return the forgottenpasswordwindowbutton
	 */
	public WebElement getForgottenpasswordwindowbutton() {
		return forgottenpasswordwindowbutton;
	}

	/**
	 * @return the myaccountwindowbutton
	 */
	public WebElement getMyaccountwindowbutton() {
		return myaccountwindowbutton;
	}

	/**
	 * @return the addressbookwindowbutton
	 */
	public WebElement getAddressbookwindowbutton() {
		return addressbookwindowbutton;
	}

	/**
	 * @return the wishlistwindowbutton
	 */
	public WebElement getWishlistwindowbutton() {
		return wishlistwindowbutton;
	}

	/**
	 * @return the orderhistorywindowbutton
	 */
	public WebElement getOrderhistorywindowbutton() {
		return orderhistorywindowbutton;
	}

	/**
	 * @return the downloadswindowbutton
	 */
	public WebElement getDownloadswindowbutton() {
		return downloadswindowbutton;
	}

	/**
	 * @return the recurringpaymentswindowbutton
	 */
	public WebElement getRecurringpaymentswindowbutton() {
		return recurringpaymentswindowbutton;
	}

	/**
	 * @return the rewardpointswindowbutton
	 */
	public WebElement getRewardpointswindowbutton() {
		return rewardpointswindowbutton;
	}

	/**
	 * @return the returnswindowbutton
	 */
	public WebElement getReturnswindowbutton() {
		return returnswindowbutton;
	}

	/**
	 * @return the transactionswindowbutton
	 */
	public WebElement getTransactionswindowbutton() {
		return transactionswindowbutton;
	}

	/**
	 * @return the newsletterwindowbutton
	 */
	public WebElement getNewsletterwindowbutton() {
		return newsletterwindowbutton;
	}

}
