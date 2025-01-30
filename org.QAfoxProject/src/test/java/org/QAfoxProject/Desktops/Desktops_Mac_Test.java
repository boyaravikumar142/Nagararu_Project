package org.QAfoxProject.Desktops;

import java.util.concurrent.TimeUnit;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepository.HomePage;
import org.QAfoxProject.PageRepository.MacPage;
import org.QAfoxProject.PageRepository.Mac_1;
import org.QAfoxProject.PageRepository.Mac_Final;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

public class Desktops_Mac_Test extends BaseConfiguration {

	@Test(enabled=true, priority=-2)
	public void addProduct_Desktops_Mac() {

		webdriverobj.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Create the Test Information
		test = report.createTest("Verify-AddProduct_Desktops_Mac");

		//Create an Object for the Home Page
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Validate the URL of the WebPage after Login using Assertion
		String expectedurl = "https://tutorialsninja.com/demo/index.php?route=account/account";
		String actualurl = webdriverobj.driver.getCurrentUrl();
		test.log(Status.INFO, actualurl);
		Assert.assertEquals(expectedurl, actualurl);
		test.log(Status.PASS, "Step 1: URL of the Web Page after Login Verified Successfully");

		//Perform Mouse HoverAction---->Desktop
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		test.log(Status.PASS, "Step 2:Perform Mouse HoverAction-Desktops");
		homeobj.getDesktop_headertext().click();
		test.log(Status.PASS, "Step 2.2:Perform click Action-Desktops");

		javalibraryobj.pause(5000);
		//Perform Mouse Hover---->Mac
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_mac_headertext());
		test.log(Status.PASS, "Step 3.1:Perform Mouse HoverAction-Mac");
		
		//Perform the Click Action------>Mac
		homeobj.getDesktop_mac_headertext().click();
		test.log(Status.PASS, "Step 3.2:Perform click Action-MAC");

		javalibraryobj.pause(3000);
		
		//Validate the Page Title text using Assertion
		Mac_1 mac1obj = new Mac_1(webdriverobj.driver);
		String expectedtitle_text = "Mac";
		String actualtitle_text = mac1obj.getMac_textfield().getText();
		System.out.println(actualtitle_text);
		//Create an Object for the Soft Assert Class to perform Validation
		SoftAssert softobj = new SoftAssert();
		
		//Validate the "Mac Textfield" using Soft Assertion
		softobj.assertEquals(expectedtitle_text,actualtitle_text);
		test.log(Status.PASS, "Step 5: Mac_Text Element Verified Successfully");
		
		//Validate the "iMac Hyperlinktext" for the Product using Soft Assertion
		softobj.assertTrue(mac1obj.getImac_hypertext().isDisplayed() && mac1obj.getImac_hypertext().isEnabled());
		test.log(Status.PASS, "Step 5.1: iMac_hypertext Element Verified Successfully");
		
		//Perform the Click Action--iMac_Hyperlink
		mac1obj.getImac_hypertext().click();
		test.log(Status.PASS, "Step : iMac_hypertext Element Clicked Successfully");
		
		MacPage macobj = new MacPage(webdriverobj.driver);
		
		//Validate the "iMac Textfield" for the Product using Soft Assertion
		String expected_textfield = "iMac";
		String actual_textfield = macobj.getImac_textfield().getText();
		softobj.assertEquals(expected_textfield,actual_textfield);
		test.log(Status.PASS, "Step : iMac_textfield Element Verified Successfully");
		
		//Validate the "Brand nametext" for the Product using Soft Assertion
		String expected_Brand_nametext = "Brand: Apple";
		String actual_Brand_nametext = macobj.getBrand_nametext().getText();
		softobj.assertEquals(expected_Brand_nametext,actual_Brand_nametext);
		test.log(Status.PASS, "Step : Brand_nametext Element Verified Successfully");
		
		//Validate the "Product_Code_Text" for the Product using Soft Assertion
		String expected_Product_code_text = "Product Code:Product 14";
		String actual_Product_code_text = macobj.getProduct_code_text().getText();
		softobj.assertEquals(expected_Product_code_text,actual_Product_code_text);
		test.log(Status.PASS, "Step : Product_Code_Text Element Verified Successfully");
		
		//Validate the "Avaliability_text" for the Product using Soft Assertion
		String expected_Avaliability_text = "Availability:Out Of Stock";
		String actual_Avaliability_text = macobj.getAvaliability_text().getText();
		softobj.assertEquals(expected_Avaliability_text,actual_Avaliability_text);
		test.log(Status.PASS, "Step : Avaliability_text Element Verified Successfully");
		
		//Validate the "Product_Price_text" for the Product using Soft Assertion
		String expected_Product_price_text = "$122.00";
		String actual_Product_price_text = macobj.getProduct_price_text().getText();
		softobj.assertEquals(expected_Product_price_text,actual_Product_price_text);
		test.log(Status.PASS, "Step : Product_Price_text Element Verified Successfully");
		
		//Validate the "Excisetax_Price_text" for the Product using Soft Assertion
		String expected_Excisetax_price_text = "Ex Tax:$100.00";
		String actual_Excisetax_price_text = macobj.getExcisetax_price_text().getText();
		softobj.assertEquals(expected_Excisetax_price_text,actual_Excisetax_price_text);
		test.log(Status.PASS, "Step : Excisetax_Price_text Element Verified Successfully");
		
		//Validate the "Qty_Header_text" for the Product using Soft Assertion
		String expected_Qty_header_text = "Qty";
		String actual_Qty_header_text = macobj.getQty_header_text().getText();
		softobj.assertEquals(expected_Qty_header_text, actual_Qty_header_text);
		test.log(Status.PASS, "Step : Qty_Header_text Element Verified Successfully");
		
		//Validate the "Qty_textfield" for the selected product using Soft Assertion
		softobj.assertTrue(macobj.getQty_textfield().isDisplayed() && macobj.getQty_textfield().isEnabled());
		test.log(Status.PASS, "Step : Qty_textfield Element Verified Successfully");
		
		//Perform the Click Action--Qty_textfield
		macobj.getQty_textfield().click();
		test.log(Status.INFO, "Step : Qty_textfield Element Clicked Successfully");
		macobj.getQty_textfield().clear();
		test.log(Status.INFO, "Step : Qty_textfield Element Cleared Successfully");
		macobj.getQty_textfield().sendKeys("2");
		test.log(Status.INFO, "Step : In Qty_textfield Element, Qty Entered Successfully");
		
		//Validate the "Add to Cart" button using Soft Assertion
		softobj.assertTrue(macobj.getAddtocartbutton().isDisplayed() && macobj.getAddtocartbutton().isEnabled());
		test.log(Status.PASS, "Step : Add to Cart Button Element Verified Successfully");
		
		//Perform the Click Action--Add to Cart button
		macobj.getAddtocartbutton().click();
		test.log(Status.INFO, "Step : Add to Cart Button Element Clicked Successfully");
		
		//macobj = new MacPage(webdriverobj.driver);
		
		//Validate the "iMac_product_addedtextmessage" displayed using Soft Assertion
		//String expected_iMac_product_addedtextmessage = "Success: You have added ";
		//String actual_iMac_product_addedtextmessage = macobj.getiMac_product_addedtextmessage().getText();
		//System.out.println(actual_iMac_product_addedtextmessage);
		//softobj.assertEquals(expected_iMac_product_addedtextmessage, actual_iMac_product_addedtextmessage);
		//test.log(Status.INFO, "Step : iMac_product_addedtextmessage Element displayed Successfully");

		//Validate the "Shopping Cart" button using Soft Assertion
		softobj.assertTrue(macobj.getCartbutton().isDisplayed() && macobj.getCartbutton().isEnabled());
		test.log(Status.PASS, "Step : Shoppingcart Button Element Verified Successfully");
						
		//Perform the Click Action--Shopping Cart
		javalibraryobj.pause(4000);
		macobj.getCartbutton().click();
		test.log(Status.INFO, "Step : Shopping Cart Button Element Clicked Successfully");
		
		//Validate the "View Cart" button using Soft Assertion
		softobj.assertTrue(macobj.getView_cart_hypertext().isDisplayed() && macobj.getView_cart_hypertext().isEnabled());
		test.log(Status.PASS, "Step : View Cart Button Element Verified Successfully");
		
		//Perform the Click Action--View Cart Hyperlink
		macobj.getView_cart_hypertext().click();
		test.log(Status.INFO, "Step : View Cart Hyperlink Element Clicked Successfully");
		
		Mac_Final macfinalobj = new Mac_Final(webdriverobj.driver); 
		
		//Validate the "Checkout" button using Soft Assertion
		softobj.assertTrue(macfinalobj.getCheckoutbutton().isDisplayed() && macfinalobj.getCheckoutbutton().isEnabled());
		test.log(Status.PASS, "Step : Checkout Button Element Verified Successfully");
		
		//Perform the Click Action--Checkout
		macfinalobj.getCheckoutbutton().click();
		test.log(Status.INFO, "Step : Checkout Button Element Clicked Successfully");
		
		//Validate the "Alert_textmessage" displayed using Soft Assertion
		//String expected_alert_textmessage = "Products marked with *** are not available in the desired quantity or not in stock!     ";
		//String actual_alert_textmessage = macfinalobj.getAlert_textmessage().getText();
		//softobj.assertEquals(expected_alert_textmessage, actual_alert_textmessage);
		//test.log(Status.PASS, "Step : Products Alert_textmessage Element Verified Successfully");
		
		macobj.getCartbutton().click();
		macobj.getCartitemsclearbutton().click();
		
		macfinalobj.getContinuebutton().click();
		//Navigate back to the Home Page
		//webdriverobj.driver.navigate().to("https://tutorialsninja.com/demo/");
		
		test.log(Status.INFO, "Desktops_Mac_Product Added to Cart and Checkout Performed Successfully");
		
		softobj.assertAll();
	}
	
	@Test
	public void m1() {
		
		webdriverobj.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Create the Test Information
		test = report.createTest("Verify_Tablets_Module is Opening Successfully");

		//Create an Object for the Home Page
		HomePage homeobj = new HomePage(webdriverobj.driver);

		homeobj.getTabletsheaderlink().click();
	}

}
