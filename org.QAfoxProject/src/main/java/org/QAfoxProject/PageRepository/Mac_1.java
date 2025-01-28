package org.QAfoxProject.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mac_1 {

	//Declaration of the Web Elements
	@FindBy(xpath="//h2[text()='Mac']")
	private WebElement mac_textfield;//Mac
	
	@FindBy(xpath="//h4/a[text()='iMac']")
	private WebElement imac_hypertext;//iMac
	
	//Initialization of the Web Elements
	public Mac_1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization of Web Elements
	/**
	 * @return the mac_textfield
	 */
	public WebElement getMac_textfield() {
		return mac_textfield;
	}

	/**
	 * @return the imac_hypertext
	 */
	public WebElement getImac_hypertext() {
		return imac_hypertext;
	}
	
}
