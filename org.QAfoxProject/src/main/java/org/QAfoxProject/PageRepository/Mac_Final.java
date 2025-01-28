package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mac_Final {

	// 1. Declaration of all the Web Elements
	@FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
	private WebElement shoppingcart_headertext;// Shopping Cart (10.00kg)

	@FindBy(xpath = "//a[text()='Checkout']")
	private WebElement Checkoutbutton;

	@FindBy(xpath = "//div[contains(@class, 'alert alert-danger') and contains(text(), 'Products marked with *** are not available')]")
	private WebElement alert_textmessage;// Message:- [Products marked with *** are not available in the desired quantity or not in stock!]

	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement continuebutton;
	
	//2. Initialization with help of Parameterized Constructor
	public Mac_Final(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilization of all the Web Elements
	/**
	 * @return the shoppingcart_headertext
	 */
	public WebElement getShoppingcart_headertext() {
		return shoppingcart_headertext;
	}

	/**
	 * @return the checkoutbutton
	 */
	public WebElement getCheckoutbutton() {
		return Checkoutbutton;
	}

	/**
	 * @return the alert_textmessage
	 */
	public WebElement getAlert_textmessage() {
		return alert_textmessage;
	}

	/**
	 * @return the continuebutton
	 */
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
}
