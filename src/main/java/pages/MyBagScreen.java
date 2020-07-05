package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.TestBase;
import utilities.CommonUtility;
import utilities.WebForm;

public class MyBagScreen extends TestBase {

	TestBase base = new TestBase();

	CommonUtility commonUtility = new CommonUtility();

	WebForm webForm = new WebForm();

	final String myBagTab = "//div[@class='footer footerBtm']//div[2]";

	final String nextButton = "//div[@class='offset-2 col-8 col-sm-4 offset-sm-4 text-center']//button[@class='btn btn-primary od-btn-primary w-100 my-2 text-uppercase'][contains(text(),'Next')]";
																							
	final String payNowButton = "//button[@type='button'][@class='btn btn-primary od-btn-primary w-100']";


	public void tapOnMyBagTab() {
		// Tap on 'My Bag' tab
		if (base.getElement(XPATH, myBagTab) != null) {
			if (base.isDisplayed(myBagTab)) {
				base.tapElement(myBagTab);
				wait = new WebDriverWait(this.driver, 5);
				base.delay(3000L);
			} else {
				Assert.assertFalse(base.isDisplayed(myBagTab), "Not able to tap on 'My Bag' tab");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, myBagTab), "My Bag Tab is not present on the footer");
		}
	}


	public void tapOnNextButton() {
		// Tap on 'NEXT' tab
		if (base.getElement(XPATH, nextButton) != null) {
			if (base.isDisplayed(nextButton)) {
				base.tapElement(nextButton);
				wait = new WebDriverWait(this.driver, 5);
				base.delay(3000L);
			} else {
				Assert.assertFalse(base.isDisplayed(nextButton), "Not able to tap on 'NEXT' tab");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, nextButton), "NEXT button is not present on the footer");
		}
	}


	public void verifyCheckOutScreen() {

		if (base.getElement(XPATH, payNowButton) != null && base.isDisplayed(payNowButton)) {
			Assert.assertTrue(base.isDisplayed(payNowButton), "Pay Now button is not displayed");
		} else {
			Assert.fail("Pay Now button is not displayed");
		}
	}


	public void verifyAddedMenuIsDisplayed() {

		// To Be Done
	}


	public void tapOnPayNowButton() {
		
		if (base.getElement(XPATH, payNowButton) != null ) {
			if(base.isDisplayed(payNowButton)){
				base.tapElement(payNowButton);
				wait = new WebDriverWait(this.driver, 5);	
				base.delay(5000L);
			} else {
				Assert.assertFalse(base.isDisplayed(payNowButton), "Not able to tap on 'Pay Now' tab");
			}
		} else {
			Assert.fail("Pay Now button is not displayed"+base.getElement(XPATH, payNowButton));
		}
	}

}
