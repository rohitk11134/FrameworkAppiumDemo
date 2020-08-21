package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.TestBase;
import utilities.CommonUtility;
import utilities.WebForm;

public class PickupScreen extends TestBase {

	TestBase base = new TestBase();

	CommonUtility commonUtility = new CommonUtility();

	WebForm webForm = new WebForm();

	// Pickup Screen Elements
	final String name_Field = "//input[@name='guestName']";

	final String pickUpDate_Field = "//input[@name='selectedDate']";

	final String pickUpTime_Field = "//input[@id='react-select-2-input']";

	final String nextButton = "//button[@type='submit'][contains(text(), 'Next')]";

	public String[] fields = { name_Field, pickUpDate_Field, pickUpTime_Field };

	// the error fields.
	final String FORM_ERROR = ".//*[contains(@class, 'error')]";

	final String[] ERROR_MESSAGE_FIELDS = { FORM_ERROR };

	// error message map (Key-Value Pair)
	HashMap<String, String> pickUpScreenErrorMessageMap = new HashMap<String, String>();

	String expectedMessageKeys = "";

	// Verify if the current screen is Pickup screen
	public void verifyPickUpScreen() {
		// TODO Auto-generated method stub
		base.waitForElementToBeVisible(By.xpath(name_Field));
		String currentUrl = base.getCurrentURL();
		Assert.assertTrue(currentUrl.toLowerCase().contains("pickup-time"), "Does not navigate to Pickup screen");

	}

	// Populate the data in to the pickup screen fields
	public void populcatePickUpScreenFields(String guestName, String pickUpDate, String pickUpTime) {
		// TODO Auto-generated method stub
		base.populateFields(name_Field, guestName);
		
		if(pickUpDate.equalsIgnoreCase("Today")) {
			base.populateFields(pickUpDate_Field, pickUpDate);
		} else if (pickUpDate.equalsIgnoreCase("Tomorrow")) {
			pickUpDate = getPickUpDate(1);
		}
		base.populateFields(pickUpDate_Field, pickUpDate);
		base.pressENTER(pickUpDate_Field);
		
		base.populateFields(pickUpTime_Field, pickUpTime);
		base.pressTAB(pickUpTime_Field);
	}

	public String getPickUpDate(int n) {
		// get a calendar instance, which defaults to "now"
		Calendar calendar = Calendar.getInstance();

		// add days to the date/calendar
		calendar.add(Calendar.DAY_OF_YEAR, n);

		// now get the required date
		Date date = calendar.getTime();

		DateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY");
		String dateToSelect = dateFormat.format(date);
		System.out.println("Date To Select: " + dateToSelect);
		return dateToSelect;
	}

	// Tap on 'Next' button with all the mandatory fields filled
	public void submitNextButton() {

		if (base.getElement(XPATH, nextButton) != null) {
			if (base.isDisplayed(nextButton)) {
				base.tapElement(nextButton);
				wait = new WebDriverWait(this.driver, 5);
			} else {
				Assert.fail(base.isDisplayed(nextButton) + " - Next button is not displayed");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, nextButton), " - Next button is not present on the Pickup screen");
		}
	}

	// Verify the error or success message once next button is tapped
	public void verifyScreenErrorMessage() {

		pickUpScreenErrorMessageMap.put("empty_GuestName", "Name field is required");
		pickUpScreenErrorMessageMap.put("pickUpTime_Req", "Select Time field is required");

		// List of all error message displayed in the screen
		List<String> actualValidationMsg = base.getValidationMessages(ERROR_MESSAGE_FIELDS);

		// List of error-keys of all error messages displayed
		List<String> actualValidationMsgKeys = webForm.getActualErrorMessageKeys(actualValidationMsg,
				pickUpScreenErrorMessageMap);

		// Comparing expected error message keys from excel to actual error keys of
		// displayed error messages
		webForm.compareMessageKeys(expectedMessageKeys, actualValidationMsgKeys);
	}

}
