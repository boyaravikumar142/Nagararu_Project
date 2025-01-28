package org.QAfoxProject.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This Class contains reusable methods to perform java related operations
 *
 * @author NAGARAJU
 *
 **/
public class JavaLibrary {

	/**
	 * This method is used to pause the script execution for the specified time
	 *
	 * @param time
	 */
	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to fetch the Current date and time
	 *
	 * @return
	 */
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}

	/**
	 * This method generates random number within the specified limit
	 *
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
		
}
