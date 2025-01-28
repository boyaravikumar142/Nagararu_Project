package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the MacPage
 * 
 * @author NAGARAJU
 */

public class MacPage {

	//1. Web Elements Declaration
	
	@FindBy(xpath="//h1[text()='iMac']")
	private WebElement imac_textfield;//Internal iMac
	
	@FindBy(xpath="(//ul[@class='list-unstyled'])[8]/li[1]")
	private WebElement brand_nametext;//Brand: Apple
	
	@FindBy(xpath="//li[text()='Product Code:Product 14']")
	private WebElement product_code_text;//Product Code:Product 14
	
	@FindBy(xpath="//li[text()='Availability:Out Of Stock']")
	private WebElement avaliability_text;//Availability:Out Of Stock
	
	@FindBy(xpath="//h2[text()='$122.00']")
	private WebElement product_price_text;//$122.00
	
	@FindBy(xpath="//li[text()='Ex Tax:$100.00']")
	private WebElement excisetax_price_text;//Ex Tax:$100.00
	
	@FindBy(xpath="//label[text()='Qty']")
	private WebElement qty_header_text;//Qty
	
	@FindBy(xpath="//div[contains(@class, 'alert alert-success') and contains(text(), 'Success: You have added')]")
	private WebElement iMac_product_addedtextmessage;//Message:- [Success: You have added iMac to your shopping cart!]
	
	@FindBy(xpath="//span[contains(@id,'cart-total')]")
	private WebElement Cartbutton;
	
	@FindBy(xpath="//input[contains(@id,'input-quantity')]")
	private WebElement Qty_textfield;
	
	@FindBy(xpath="//button[contains(text(),'Add to Cart')]")
	private WebElement addtocartbutton;//Add to Cart
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[3]")
	private WebElement view_cart_hypertext;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement cartitemsclearbutton;
	
	//2. Initialization with help of Parameterized Constructor
	public MacPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//3. Utilization
	/**
	 * @return the imac_textfield
	 */
	public WebElement getImac_textfield() {
		return imac_textfield;
	}

	/**
	 * @return the brand_nametext
	 */
	public WebElement getBrand_nametext() {
		return brand_nametext;
	}

	/**
	 * @return the product_code_text
	 */
	public WebElement getProduct_code_text() {
		return product_code_text;
	}

	/**
	 * @return the avaliability_text
	 */
	public WebElement getAvaliability_text() {
		return avaliability_text;
	}

	/**
	 * @return the product_price_text
	 */
	public WebElement getProduct_price_text() {
		return product_price_text;
	}

	/**
	 * @return the excisetax_price_text
	 */
	public WebElement getExcisetax_price_text() {
		return excisetax_price_text;
	}

	/**
	 * @return the qty_header_text
	 */
	public WebElement getQty_header_text() {
		return qty_header_text;
	}

	/**
	 * @return the iMac_product_addedtextmessage
	 */
	public WebElement getiMac_product_addedtextmessage() {
		return iMac_product_addedtextmessage;
	}

	/**
	 * @return the qty_textfield
	 */
	public WebElement getQty_textfield() {
		return Qty_textfield;
	}

	/**
	 * @return the addtocartbutton
	 */
	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	/**
	 * @return the view_cart_hypertext
	 */
	public WebElement getView_cart_hypertext() {
		return view_cart_hypertext;
	}

	/**
	 * @return the cartbutton
	 */
	public WebElement getCartbutton() {
		return Cartbutton;
	}
	
	/**
	 * @return the cartitemsclearbutton
	 */
	public WebElement getCartitemsclearbutton() {
		return cartitemsclearbutton;
	}


}