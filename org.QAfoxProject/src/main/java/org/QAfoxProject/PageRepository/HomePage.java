package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the HomePage
 * 
 * @author NAGARAJU
 */

public class HomePage {

	// 1. Declaration of Web Elements
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerheaderlink;
	
	@FindBy(xpath="//li/a[contains(text(),'Login')]")
	private WebElement loginheaderlink;
	
/*	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktopbutton;*/
	
	@FindBy(xpath="//a[text()='Mac (1)']")
	private WebElement desktop_mac_headertext;
	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currencybutton;

	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement phonebutton;

	@FindBy(xpath = "//span[contains(text(),'My')]")
	private WebElement myaccountheaderlink;

	@FindBy(xpath = "//span[contains(text(),'Wish')]")
	private WebElement wishlistbutton;

	@FindBy(xpath = "//span[contains(text(),'Shop')]")
	private WebElement shoppingcartbutton;

	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkoutbutton;

	@FindBy(name = "search")
	private WebElement searchtextfield;

	@FindBy(name = "//i[@class='fa fa-search']")
	private WebElement searchbutton;

	@FindBy(id = "cart-total")
	private WebElement cartbutton;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktop_headertext;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsandnotebooksbutton;

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement componentbutton;

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsbutton;

	@FindBy(xpath = "//a[text()='Software']")
	private WebElement softwarebutton;

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesandpdasbutton;

	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement camerasbutton;

	@FindBy(xpath = "//a[text()='//a[text()='MP3 Players']']")
	private WebElement mp3playersbutton;

	@FindBy(xpath = "//a[contains(text(),'About')]")
	private WebElement aboutushyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Delivery')]")
	private WebElement deliveryinformationhyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Privacy')]")
	private WebElement privacypolicyhyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Terms')]")
	private WebElement termsandconditionshyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	private WebElement contactushyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Return')]")
	private WebElement returnshyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Site')]")
	private WebElement sitemaphyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Brands')]")
	private WebElement brandshyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Gift')]")
	private WebElement giftcertificateshyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliatehyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Special')]")
	private WebElement specialshyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'My')]")
	private WebElement myaccounthyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Order')]")
	private WebElement orderhistoryhyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'Wish')]")
	private WebElement wishlisthyperlinkbutton;

	@FindBy(xpath = "//a[contains(text(),'News')]")
	private WebElement newsletterhyperlinkbutton;
	
	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement Desktops_PC_headerlink;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsheaderlink;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continuebutton;
	
	// 2. Initialization of Web Elements
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. Utilization of Web Elements
	/**
	 * @return the currencybutton
	 */
	public WebElement getCurrencybutton() {
		return currencybutton;
	}
	
	/**
	 * @return the register_headerlink
	 */
	public WebElement getRegister_headerlink() {
		return registerheaderlink;
	}
	
	/**
	 * @return the login_headerlink
	 */
	public WebElement getLogin_headerlink() {
		return loginheaderlink;
	}
	
	/**
	 * @return the registerheaderlink
	 */
	public WebElement getRegisterheaderlink() {
		return registerheaderlink;
	}

	/**
	 * @return the loginheaderlink
	 */
	public WebElement getLoginheaderlink() {
		return loginheaderlink;
	}

//	/**
//	 * @return the desktopbutton
//	 */
//	public WebElement getDesktopbutton() {
//		return desktopbutton;
//	}

	/**
	 * @return the myaccountheaderlink
	 */
	public WebElement getMyaccountheaderlink() {
		return myaccountheaderlink;
	}

//	/**
//	 * @return the getDesktopsButton
//	 */
//	public WebElement getDesktopButton() {
//		return desktopbutton;
//	}

	/**
	 * @return the getdesktop_mac_headertext
	 */
	public WebElement getDesktop_mac_headertext() {
		return desktop_mac_headertext;
	}

	/**
	 * @return the phonebutton
	 */
	public WebElement getPhonebutton() {
		return phonebutton;
	}

	/**
	 * @return the myaccountbutton
	 */
	public WebElement Myaccount_headerlink() {
		return myaccountheaderlink;
	}

	/**
	 * @return the wishlistbutton
	 */
	public WebElement getWishlistbutton() {
		return wishlistbutton;
	}

	/**
	 * @return the shoppingcartbutton
	 */
	public WebElement getShoppingcartbutton() {
		return shoppingcartbutton;
	}

	/**
	 * @return the checkoutbutton
	 */
	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}

	/**
	 * @return the searchtextfield
	 */
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	/**
	 * @return the searchbutton
	 */
	public WebElement getSearchbutton() {
		return searchbutton;
	}

	/**
	 * @return the cartbutton
	 */
	public WebElement getCartbutton() {
		return cartbutton;
	}

	/**
	 * @return the desktop_headertext
	 */
	public WebElement getDesktop_headertext() {
		return desktop_headertext;
	}

	/**
	 * @return the laptopsandnotebooksbutton
	 */
	public WebElement getLaptopsandnotebooksbutton() {
		return laptopsandnotebooksbutton;
	}

	/**
	 * @return the componentbutton
	 */
	public WebElement getComponentbutton() {
		return componentbutton;
	}

	/**
	 * @return the tabletsbutton
	 */
	public WebElement getTabletsbutton() {
		return tabletsbutton;
	}

	/**
	 * @return the softwarebutton
	 */
	public WebElement getSoftwarebutton() {
		return softwarebutton;
	}

	/**
	 * @return the phonesandpdasbutton
	 */
	public WebElement getPhonesandpdasbutton() {
		return phonesandpdasbutton;
	}

	/**
	 * @return the camerasbutton
	 */
	public WebElement getCamerasbutton() {
		return camerasbutton;
	}

	/**
	 * @return the mp3playersbutton
	 */
	public WebElement getMp3playersbutton() {
		return mp3playersbutton;
	}

	/**
	 * @return the aboutushyperlinkbutton
	 */
	public WebElement getAboutushyperlinkbutton() {
		return aboutushyperlinkbutton;
	}

	/**
	 * @return the deliveryinformationhyperlinkbutton
	 */
	public WebElement getDeliveryinformationhyperlinkbutton() {
		return deliveryinformationhyperlinkbutton;
	}

	/**
	 * @return the privacypolicyhyperlinkbutton
	 */
	public WebElement getPrivacypolicyhyperlinkbutton() {
		return privacypolicyhyperlinkbutton;
	}

	/**
	 * @return the termsandconditionshyperlinkbutton
	 */
	public WebElement getTermsandconditionshyperlinkbutton() {
		return termsandconditionshyperlinkbutton;
	}

	/**
	 * @return the contactushyperlinkbutton
	 */
	public WebElement getContactushyperlinkbutton() {
		return contactushyperlinkbutton;
	}

	/**
	 * @return the returnshyperlinkbutton
	 */
	public WebElement getReturnshyperlinkbutton() {
		return returnshyperlinkbutton;
	}

	/**
	 * @return the sitemaphyperlinkbutton
	 */
	public WebElement getSitemaphyperlinkbutton() {
		return sitemaphyperlinkbutton;
	}

	/**
	 * @return the brandshyperlinkbutton
	 */
	public WebElement getBrandshyperlinkbutton() {
		return brandshyperlinkbutton;
	}

	/**
	 * @return the giftcertificateshyperlinkbutton
	 */
	public WebElement getGiftcertificateshyperlinkbutton() {
		return giftcertificateshyperlinkbutton;
	}

	/**
	 * @return the affiliatehyperlinkbutton
	 */
	public WebElement getAffiliatehyperlinkbutton() {
		return affiliatehyperlinkbutton;
	}

	/**
	 * @return the specialshyperlinkbutton
	 */
	public WebElement getSpecialshyperlinkbutton() {
		return specialshyperlinkbutton;
	}

	/**
	 * @return the myaccounthyperlinkbutton
	 */
	public WebElement getMyaccounthyperlinkbutton() {
		return myaccounthyperlinkbutton;
	}

	/**
	 * @return the orderhistoryhyperlinkbutton
	 */
	public WebElement getOrderhistoryhyperlinkbutton() {
		return orderhistoryhyperlinkbutton;
	}

	/**
	 * @return the wishlisthyperlinkbutton
	 */
	public WebElement getWishlisthyperlinkbutton() {
		return wishlisthyperlinkbutton;
	}

	/**
	 * @return the newsletterhyperlinkbutton
	 */
	public WebElement getNewsletterhyperlinkbutton() {
		return newsletterhyperlinkbutton;
	}

	/**
	 * @return the desktops_PC_headerlink
	 */
	public WebElement getDesktops_PC_headerlink() {
		return Desktops_PC_headerlink;
	}

	/**
	 * @return the logout
	 */
	public WebElement getLogout() {
		return logout;
	}

	/**
	 * @return the tabletsheaderlink
	 */
	public WebElement getTabletsheaderlink() {
		return tabletsheaderlink;
	}

	/**
	 * @return the continuebutton
	 */
	public WebElement getContinuebutton() {
		return continuebutton;
	}

}