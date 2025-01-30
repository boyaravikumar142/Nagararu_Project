package org.QAfoxProject.GenericUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class contains reusable methods to perform the driver related
 * operations*
 * 
 * @author NAGARAJU
 **/

public class WebDriverLibrary {

	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;

	/**
	 * This method launches the Specified browser
	 * 
	 * @param browser
	 * @return
	 **/

	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			static_driver = driver;
			break;
		case "firefox":
			driver = new FirefoxDriver();
			static_driver = driver;
			break;
		case "edge":
			driver = new EdgeDriver();
			static_driver = driver;
			break;
		default:
			System.out.println("Invalid browser Info");
		}
		return driver;
	}

	/***
	 * This method maximizes the browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	/**
	 * This Method is used to navigate the application via url
	 * 
	 */
	public void navigatetoApp(String url) {
		driver.get(url);
	}

	/**
	 * This method used to close the browser
	 */

	public void closeBrowser() {
		driver.close();
	}

	/**
	 * This method used to close the browser
	 */
	public void closeAllBrowser() {
		driver.quit();
	}

	/**
	 * This method Waits Until element or elements are found
	 * 
	 * @param time
	 */
	public void waitUntilElementFound() {
		driver.manage().timeouts().implicitlyWait(PathConstant.DURATION, TimeUnit.MILLISECONDS);
	}

	/**
	 * This method Waits Until element is visible on the Web Page
	 * @param element
	 * 
	 */
	public void waitUntilElementFound(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, PathConstant.DURATION);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	/**
	 * This method is used to mouse hover on an element
	 * 
	 * @param element
	 */
	
	public void mouseHoverToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).perform();

	}
	
	/**
	 * This method is used to double click on an element
	 * 
	 * @param element 
	 */
	public void doubleClickOnElement(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	/**
	 * This method is used to right click on an element
	 * 
	 * @param element 
	 */
	public void rightClickOnElement(WebElement element) {
		action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/**
	 * This method is used to drag and drop an element to target location
	 * 
	 * @param source
	 * @param target 
	 */
	public void dragAndDropElement(WebElement source,  WebElement target) {
		action = new Actions(driver);
		action.dragAndDrop(source,target).perform();
	}
	
	/**
	 * This method is used to select an element from drop down based on index
	 * 
	 * @param element
	 * @param index 
	 */
	public void selectFromDropdown(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);

	}
	
	/**
	 * This method is used to select an element from drop down based on value
	 * attribute
	 * 
	 * @param element
	 * @param value 
	 */
	public void selectFromDropdown(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
		
	}
	
	/**
	 * This method is used to select an element from drop down based on visible text
	 * 
	 * @param element
	 * @param visibletext 
	 */
	public void selectFromDropdown(String visibletext, WebElement element) {
		select = new Select(element);
		select.selectByVisibleText(visibletext);
		
	}
	
	/**
	 * This method is used to switch to frame based on index
	 * 
	 * @param index
	 */
	public void switchToFrame(int index){
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch to frame based on id or name attribute value
	 * 
	 * @param idOrName
	 */
	public void switchToFrame(String idOrName){
		driver.switchTo().frame(idOrName);
	}
	
	/**
	 * This method is used to switch to frame based on frame element
	 * 
	 * @param element
	 */
	public void switchToFrame(WebElement element){
		driver.switchTo().frame(element);
	}
	
	
	/**
	 * This method is used to switch back to default window 
	 */
	public void switchToDefaultWindow(){
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to switch back to Parent Window/Frame
	 */
	public void switchToParentFrame(){
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method handles alert pop up
	 * 
	 * @param status
	 */
	public void handleAlert(String status){
		Alert al = driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
			al.accept();
		else
			al.dismiss();
	}
	
	/**
	 * This method converts dynamic xpath to WebElement
	 * 
	 * @param commonPath
	 * @param replaceData
	 * @return
	 */
	public WebElement convertDynamicXpathToWebElement(String commonPath, String replaceData){
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
	}
	
}