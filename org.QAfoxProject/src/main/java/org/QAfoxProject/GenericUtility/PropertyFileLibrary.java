package org.QAfoxProject.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

/**
 * This Class provides Reusable Method TO Perform CRUD in the Property File
 * 
 */

public class PropertyFileLibrary {

	FileInputStream fis;
	FileOutputStream fos;
	Properties property;

	public void initPropertFile() {
		// **Steps To Fetch The Data From The External Resources--Excel File**

		// 1.Convert the Physical File into Java Understandable
		try {
			new FileInputStream(PathConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. Create an Object for the Property Class
		property = new Properties();

		//3. Load the Property File
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * This Method is Used To read the Data in the Property File
	 * 
	 */
	
	public String readProperty(String key) {
		
		//Fetch the data - By Calling getProperty()
		return property.getProperty(key);
		
	}
	
	/**
	 * This Method is Used To Write the Data in the Property File
	 * 
	 */
	
	public void writeProperty(String key, String value) {
		//Enter the Data
		property.put(key, value);
		
		//create an instance for FileOutputStream Class
		try {
			fos = new FileOutputStream(PathConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Store the Data
		try {
			property.store(fos, "Updated the New Key-Value Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * This Method is Used to Display the Property
	 * 
	 */
	public void displayProperty(String key) {
		String data = property.getProperty(key);
		Reporter.log(key+":"+data,true);

	}

}