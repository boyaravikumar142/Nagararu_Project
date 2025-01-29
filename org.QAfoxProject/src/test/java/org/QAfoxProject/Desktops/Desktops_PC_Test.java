package org.QAfoxProject.Desktops;

import org.QAfoxProject.GenericUtility.BaseConfiguration;
import org.QAfoxProject.PageRepository.HomePage;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Desktops_PC_Test extends BaseConfiguration {

	@Test
	public void addProduct() {

		// Create the Test Information
		test = super.report.createTest("Verify-AddProduct_Desktops_PC");

		HomePage homeobj = new HomePage(webdriverobj.driver);

		// perform mouse HoverAction---->Desktop
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		test.log(Status.PASS, "Step 1:Perform Mouse HoverAction-Desktop");

		// perform Mouse Hover and Click operation
		webdriverobj.mouseHoverToElement(homeobj.getDesktops_PC_headerlink());
		test.log(Status.PASS, "Step 2.1:Perform Mouse HoverAction-PC");
		homeobj.getDesktops_PC_headerlink().click();
		test.log(Status.PASS, "Step 2.2:Perform Click Action-PC");

		javalibraryobj.pause(5000);
		test.log(Status.INFO, "PC_Product Added Successfully");
	}
}
