package org.QAfoxProject.GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
  *This Class Provide the Reusable Method To Perform JavScript Related Actions
  *
  *@author NAGARAJU
  */
public class JavaScriptLibrary {

	public JavascriptExecutor javascriptobj;
	
	/**
	 *This Method Used To Enter the Data in Disabled Element
	 *@param element
	 *@param data
	 */
	
	public void enterData_DisbledElement(WebElement element, String data) {
		
		javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		//javascriptobj.executeScript("arguments[0].value='hfashjkfajksn'",element);
		javascriptobj.executeScript("arguments[0].value='" + data +"'",element);
	}
	
	 /**
	 *This Method Used To Enter the Data in Disabled Textfield-Element
	 *@param element
	 */
	 public void click_DisabledElement(WebElement element) {
	    javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
	    javascriptobj.executeScript("arguments[0].click();",element);
	}
	
	 /**
	  *This Method Used To Scroll On WebPage
	  *
	  */
	 public void defaultVerticalScrollBy() {
		 javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		 javascriptobj.executeScript("window.scrollBy(1000,1000)");
	 }
	 
	 /**
	  *This Method Used To Scroll On WebPage
	  *
	  */
	 public void defaultVerticalScrollTo() {
		 javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		 javascriptobj.executeScript("window.scrollTo(1000,1000)");
	 }
	 
	 /**
	  *This Method Used To Scroll Until the Element Visible
	  *@param element
	  *@param value
	  */
	 public void scrollUsingView(WebElement element, boolean value ) {
		 javascriptobj = (JavascriptExecutor) WebDriverLibrary.static_driver;
		 javascriptobj.executeScript("arguments[0].scrollIntoView(" + value +");",element);
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
