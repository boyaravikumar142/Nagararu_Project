package AutomationExercise_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class provides the details of all the WebElements present in the EnterAccountInformationPage
 * @author NAGARAJU
 **/

public class EnterAccountInformationPage {

	//1. Declaration of all the Web Elements
	@FindBy()
	private WebElement enteraccountinformationtext;
	
	@FindBy()
	private WebElement title_text;
	
	@FindBy()
	private WebElement mr_radiobutton;
	
	@FindBy()
	private WebElement mr_radiobutton_titletext;
	
	@FindBy()
	private WebElement mrs_radiobutton;
	
	@FindBy()
	private WebElement mrs_radiobutton_titletext;
	
	@FindBy()
	private WebElement name_titletext;
	
	@FindBy()
	private WebElement name_textfield;
	
	@FindBy()
	private WebElement email_titletext;
	
	@FindBy()
	private WebElement email_textfield;
	
	@FindBy()
	private WebElement password_titletext;
	
	@FindBy()
	private WebElement password_textfield;
	
	@FindBy()
	private WebElement dateofbirth_titletext;
	
	@FindBy()
	private WebElement dayoption;
	
	@FindBy()
	private WebElement monthoption;
	
	@FindBy()
	private WebElement yearoption;
	
	@FindBy()
	private WebElement signupforournewsletter_titletext;
	
	@FindBy()
	private WebElement signupforournewsletter_checkbox;
	
	@FindBy()
	private WebElement receivespecialoffers_titletext;
	
	@FindBy()
	private WebElement receivespecialoffers_checkbox;
	
	@FindBy()
	private WebElement addressinformation_titletext;
	
	@FindBy()
	private WebElement firstname_titletext;
	
	@FindBy()
	private WebElement firstname_textfield;
	
	@FindBy()
	private WebElement lastname_titletext;
	
	@FindBy()
	private WebElement lastname_textfield;
	
	@FindBy()
	private WebElement company_titletext;
	
	@FindBy()
	private WebElement company_textfield;
	
	@FindBy()
	private WebElement address_titletext;
	
	@FindBy()
	private WebElement address_textfield;
	
	@FindBy()
	private WebElement address2_titletext;
	
	@FindBy()
	private WebElement address2_textfield;
	
	@FindBy()
	private WebElement country_titletext;
	
	@FindBy()
	private WebElement country_textfield;
	
	@FindBy()
	private WebElement countryoption;
	
	@FindBy()
	private WebElement state_titletext;
	
	@FindBy()
	private WebElement state_textfield;
	
	@FindBy()
	private WebElement city_titletext;
	
	@FindBy()
	private WebElement city_textfield;
	
	@FindBy()
	private WebElement zipcode_titletext;
	
	@FindBy()
	private WebElement zipcode_textfield;
	
	@FindBy()
	private WebElement mobilenumber_titletext;
	
	@FindBy()
	private WebElement mobilenumber_textfield;
	
	@FindBy()
	private WebElement createaccount_titletext;
	
	@FindBy()
	private WebElement createaccount_button;
	
	//2. Initialization of all the Web Elements
	public EnterAccountInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, null);
	}

	//3. Utilization all the Web Elements
	/**
	 * @return the enteraccountinformationtext
	 */
	public WebElement getEnteraccountinformationtext() {
		return enteraccountinformationtext;
	}

	/**
	 * @return the title_text
	 */
	public WebElement getTitle_text() {
		return title_text;
	}

	/**
	 * @return the mr_radiobutton
	 */
	public WebElement getMr_radiobutton() {
		return mr_radiobutton;
	}

	/**
	 * @return the mr_radiobutton_titletext
	 */
	public WebElement getMr_radiobutton_titletext() {
		return mr_radiobutton_titletext;
	}

	/**
	 * @return the mrs_radiobutton
	 */
	public WebElement getMrs_radiobutton() {
		return mrs_radiobutton;
	}

	/**
	 * @return the mrs_radiobutton_titletext
	 */
	public WebElement getMrs_radiobutton_titletext() {
		return mrs_radiobutton_titletext;
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
	 * @return the email_titletext
	 */
	public WebElement getEmail_titletext() {
		return email_titletext;
	}

	/**
	 * @return the email_textfield
	 */
	public WebElement getEmail_textfield() {
		return email_textfield;
	}

	/**
	 * @return the password_titletext
	 */
	public WebElement getPassword_titletext() {
		return password_titletext;
	}

	/**
	 * @return the password_textfield
	 */
	public WebElement getPassword_textfield() {
		return password_textfield;
	}

	/**
	 * @return the dateofbirth_titletext
	 */
	public WebElement getDateofbirth_titletext() {
		return dateofbirth_titletext;
	}

	/**
	 * @return the dayoption
	 */
	public WebElement getDayoption() {
		return dayoption;
	}

	/**
	 * @return the monthoption
	 */
	public WebElement getMonthoption() {
		return monthoption;
	}

	/**
	 * @return the yearoption
	 */
	public WebElement getYearoption() {
		return yearoption;
	}

	/**
	 * @return the signupforournewsletter_titletext
	 */
	public WebElement getSignupforournewsletter_titletext() {
		return signupforournewsletter_titletext;
	}

	/**
	 * @return the signupforournewsletter_checkbox
	 */
	public WebElement getSignupforournewsletter_checkbox() {
		return signupforournewsletter_checkbox;
	}

	/**
	 * @return the receivespecialoffers_titletext
	 */
	public WebElement getReceivespecialoffers_titletext() {
		return receivespecialoffers_titletext;
	}

	/**
	 * @return the receivespecialoffers_checkbox
	 */
	public WebElement getReceivespecialoffers_checkbox() {
		return receivespecialoffers_checkbox;
	}

	/**
	 * @return the addressinformation_titletext
	 */
	public WebElement getAddressinformation_titletext() {
		return addressinformation_titletext;
	}

	/**
	 * @return the firstname_titletext
	 */
	public WebElement getFirstname_titletext() {
		return firstname_titletext;
	}

	/**
	 * @return the firstname_textfield
	 */
	public WebElement getFirstname_textfield() {
		return firstname_textfield;
	}

	/**
	 * @return the lastname_titletext
	 */
	public WebElement getLastname_titletext() {
		return lastname_titletext;
	}

	/**
	 * @return the lastname_textfield
	 */
	public WebElement getLastname_textfield() {
		return lastname_textfield;
	}

	/**
	 * @return the company_titletext
	 */
	public WebElement getCompany_titletext() {
		return company_titletext;
	}

	/**
	 * @return the company_textfield
	 */
	public WebElement getCompany_textfield() {
		return company_textfield;
	}

	/**
	 * @return the address_titletext
	 */
	public WebElement getAddress_titletext() {
		return address_titletext;
	}

	/**
	 * @return the address_textfield
	 */
	public WebElement getAddress_textfield() {
		return address_textfield;
	}

	/**
	 * @return the address2_titletext
	 */
	public WebElement getAddress2_titletext() {
		return address2_titletext;
	}

	/**
	 * @return the address2_textfield
	 */
	public WebElement getAddress2_textfield() {
		return address2_textfield;
	}

	/**
	 * @return the country_titletext
	 */
	public WebElement getCountry_titletext() {
		return country_titletext;
	}

	/**
	 * @return the country_textfield
	 */
	public WebElement getCountry_textfield() {
		return country_textfield;
	}

	/**
	 * @return the countryoption
	 */
	public WebElement getCountryoption() {
		return countryoption;
	}

	/**
	 * @return the state_titletext
	 */
	public WebElement getState_titletext() {
		return state_titletext;
	}

	/**
	 * @return the state_textfield
	 */
	public WebElement getState_textfield() {
		return state_textfield;
	}

	/**
	 * @return the city_titletext
	 */
	public WebElement getCity_titletext() {
		return city_titletext;
	}

	/**
	 * @return the city_textfield
	 */
	public WebElement getCity_textfield() {
		return city_textfield;
	}

	/**
	 * @return the zipcode_titletext
	 */
	public WebElement getZipcode_titletext() {
		return zipcode_titletext;
	}

	/**
	 * @return the zipcode_textfield
	 */
	public WebElement getZipcode_textfield() {
		return zipcode_textfield;
	}

	/**
	 * @return the mobilenumber_titletext
	 */
	public WebElement getMobilenumber_titletext() {
		return mobilenumber_titletext;
	}

	/**
	 * @return the mobilenumber_textfield
	 */
	public WebElement getMobilenumber_textfield() {
		return mobilenumber_textfield;
	}

	/**
	 * @return the createaccount_titletext
	 */
	public WebElement getCreateaccount_titletext() {
		return createaccount_titletext;
	}

	/**
	 * @return the createaccount_button
	 */
	public WebElement getCreateaccount_button() {
		return createaccount_button;
	}
	
}