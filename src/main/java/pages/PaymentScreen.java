package pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.CommonUtility;
import utilities.WebForm;

public class PaymentScreen extends TestBase {

	TestBase base = new TestBase();

	CommonUtility commonUtility = new CommonUtility();

	WebForm webForm = new WebForm();

	final String cardNumber = "//input[@placeholder='Card number']";

	final String fullName = "//input[@id='tsep-fullName']";

	final String expiryDate = "//input[@placeholder='MM/YY']";

	final String CVV = "//input[@name='tsep-cvv2'][@placeholder='CVV'][@type='number']";

	final String zipCode = "//input[@id='tsep-zip']";

	public String[] fields = { cardNumber, fullName, expiryDate, CVV, zipCode };

	final String tipAmount = "//div[contains(text(),'No Tip')]";

	final String confirmButton = "//button[@type='button'][contains(text(),'Confirm')]";

	final String pay_NowButton = "//button[@class='btn btn-primary od-btn-primary w-100']";

	final String noTipButton = "//div[contains(text(),'No Tip')]";

	// the error fields.
	final String FORM_ERROR = ".//*[@class='error']";

	final String TOAST_ERROR = "//div[@role='alert']";

//	final String TOAST_ERROR = "//div[@class='notification_notificationBar__3SXBY notification_notificationOpen__OwCns notification_alertDanger__Fa5MG']";

	final String[] ERROR_MESSAGE_FIELDS = { FORM_ERROR, TOAST_ERROR };

	String expectedMessageKeys = "";

	// error message map (Key-Value Pair)
	HashMap<String, String> paymentScreenErrorMessageMap = new HashMap<String, String>();


	public void verifyPaymentScreen() {
		// TODO Auto-generated method stub
		System.out.println("TBD");
	}

	// To enter the excel data into Payment screen fields
	public void populatePaymentScreenFields(String[][] formData) {

		// TO get the error/success message key from excel sheet
		expectedMessageKeys = commonUtility.flatten(formData)[commonUtility.flatten(formData).length - 1];
		// To check if the size of formdata and fields are same
		boolean outcome = webForm.checkFormFieldsData(formData, fields);
		Assert.assertTrue(webForm.checkFormFieldsData(formData, fields));

		base.scrollToElementUsingJS(cardNumber);
		// To enter the data
		if (outcome) {
			webForm.enterData(formData, fields);
		}
	}


	public void tapPayNowButton() {

		if (base.getElement(XPATH, pay_NowButton) != null) {
			if (base.isDisplayed(pay_NowButton)) {
				base.tapElement(pay_NowButton);
				wait = new WebDriverWait(this.driver, 5);
				base.delay(5000L);
			} else {
				Assert.assertFalse(base.isDisplayed(pay_NowButton), "Not able to tap on 'Pay Now' button");
			}
		} else {
			Assert.fail("Pay Now button is not displayed" + base.getElement(XPATH, pay_NowButton));
		}
	}


	public void tapConfirmButton() {

		if (base.getElement(XPATH, confirmButton) != null) {
			if (base.isDisplayed(confirmButton)) {
				base.tapElement(confirmButton);
				wait = new WebDriverWait(this.driver, 5);
				base.delay(6000L);
			} else {
				Assert.assertFalse(base.isDisplayed(confirmButton), "Not able to tap on 'Confrim' button");
			}
		} else {
			Assert.fail("Confirm button is not displayed" + base.getElement(XPATH, confirmButton));
		}
	}


	public void verifyScreenErrorMessage() {

		paymentScreenErrorMessageMap.put("invalid_CardDetails", "Card information entered is invalid");
		paymentScreenErrorMessageMap.put("invalid_TipCardDetails", "Invalid tip and card details");

		// List of all error message displayed in the screen
		List<String> actualValidationMsg = base.getValidationMessages(ERROR_MESSAGE_FIELDS);

		// List of error-keys of all error messages displayed
		List<String> actualValidationMsgKeys = webForm.getActualErrorMessageKeys(actualValidationMsg,
				paymentScreenErrorMessageMap);

		// Comparing expected error message keys from excel to actual error keys of displayed error messages
		webForm.compareMessageKeys(expectedMessageKeys, actualValidationMsgKeys);
	}


	public void verifyPaymentConfirmationScreen() {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
	}


	public void selectTipAmount() {

		if (base.getElement(XPATH, noTipButton) != null) {
			if (base.isDisplayed(noTipButton)) {
				base.tapElement(noTipButton);
				wait = new WebDriverWait(this.driver, 5);
				base.delay(2000L);
			} else {
				Assert.assertFalse(base.isDisplayed(noTipButton), "Not able to tap on 'No Tip' button");
			}
		} else {
			Assert.fail("No Tip button is not displayed" + base.getElement(XPATH, noTipButton));
		}
	}
}
