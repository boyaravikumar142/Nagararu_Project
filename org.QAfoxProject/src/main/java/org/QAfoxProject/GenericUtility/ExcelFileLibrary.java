package org.QAfoxProject.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This Class provides Reusable Methods To Perform CRUD in Excel File
 * 
 * @author NAGARAJU
 **/

public class ExcelFileLibrary {

	FileInputStream fis;
	FileOutputStream fos;
	Workbook wb;
	DataFormatter df;

	/**
	 * This Method is Used To Fetch the Single Data From the Excel File
	 * 
	 * @param SheetName
	 * @param Column Name
	 * @param Row Number
	 * @return
	 * 
	 */
	public String readSingleData(String sheet, int row, int column) {

		// 3. Read the String Data from the Excel and Return it
		return wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

	}

	/**
	 * This Method is Used To Fetch the Specific Column Data From the Excel File
	 * 
	 * @param sheet
	 * @param column
	 * @return
	 */
	public ArrayList<Object> readSpecificColumnData(String sheet, int column) {

		// Fetch All the Data From One Specific Column---From Excel File

		int lastrow = wb.getSheet(sheet).getLastRowNum();

		ArrayList<Object> value = new ArrayList<Object>();

		for (int i = 1; i <= lastrow; i++) {

			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			value.add(data);

		}
		return value;
	}

	/**
	 * This Method is Used To Fetch the Specific Row Data From the Excel File
	 * 
	 * @param sheet
	 * @param row
	 * @return
	 */
	public ArrayList<Object> readSpecificRowData(String sheet, int row) {

		// Fetch The Last Cell Number in One Specific Row----From the Excel File
		int lastcolumn = wb.getSheet(sheet).getRow(row).getLastCellNum();
		System.out.println("Last Cell Value of the Cell is: " + lastcolumn);

		ArrayList<Object> value = new ArrayList<Object>();

		for (int i = 0; i < lastcolumn; i++) {

			String data = wb.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
			System.out.print(data + "\t");

		}

		return value;
	}

	/**
	 * This Method is Used To Fetch the Multiple Records of Data From the Excel File
	 * 
	 * @param sheet
	 * @param expectedTestName
	 * @return
	 */
	public Map<String, String> readMultipleRecords(String sheet, String expectedTestName) {
		System.out.println("Read the Multiple Records of Data from the Excel File");

		Map<String, String> map = new HashMap<>();
		Sheet sh = wb.getSheet(sheet);

		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			if (df.formatCellValue(sh.getRow(i).getCell(1)).equals(expectedTestName)) {
				for (int j = i; j <= sh.getLastRowNum(); j++) {
					String key = df.formatCellValue(sh.getRow(j).getCell(2));
					String value = df.formatCellValue(sh.getRow(j).getCell(3));
					map.put(key, value);
					if (key.equals("#####"))
						break;
				}
				break;
			}
		}
		return map;
	}

	/**
	 * This Method is Used To Fetch the Specific Row Data From the Excel File
	 * 
	 * @param sheet
	 * @param row
	 * 
	 */
	public void displayMultipleRecords(String sheet, int row) {

		// 3. Fetch the Data from the Multiple Record
		// (Exclude Last Column Data in Each Records....)

		int lastrow = wb.getSheet(sheet).getLastRowNum();

		for (int i = 1; i <= lastrow; i++) {
			int lastcolumn = wb.getSheet(sheet).getRow(i).getLastCellNum();
			for (int j = 0; j < lastcolumn; j++) {
				String data = wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "\t");
			}
			System.out.println();
		}

	}

	/**
	 * This Method is Used To Initialize the Workbook
	 */
	public void initExcel() {

		// **Steps To Fetch The Data From The External Resources--Excel File**

		// 1. Convert the Physical File into Java Understandable
		try {
			fis = new FileInputStream(PathConstant.EXCEL_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. Create An WorkBook Using WorkBookFactory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 3. Initialize the Data Formatter
		df = new DataFormatter();
	}

	/**
	 * This Method is Used To Close the Workbook
	 *
	 */
	public void closeExcel()
	{

		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This Method is Used To Write the Single Data to the Workbook
	 *@param SheetName
	 *@param Row num
	 *@param Column Number
	 *@param data
	 *
	 */
	public void writeSingleData_NewRow(String sheet, int row, int column, String data)
	{
	
		//Create New Row and Create Data
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
		
		//Write the data
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}	

	}
	
	/**
	 * This Method is Used To Update the Single Data to the Workbook
	 *
	 */
	public void updateSingleData_ExistingRow(String sheet, int row, int column, String data) {
		
		//Update the Row in a specific column of Data
		wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);	

	}

}
