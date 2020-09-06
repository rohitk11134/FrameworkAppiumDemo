package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.TestBase;

public class HomeScreen extends TestBase{

	TestBase base = new TestBase();
	
	final String clickToPay = "//div[text()='CLICK TO PAY']";
	
	final String refillTab = "//div[text()='Refill']";
	
	final String callServer = "//div[text()='Call Server']";
	
	final String viewCheck = "//div[text()='View Check']";
	
	final String payRemainingBalance = "//button[contains(text(),'PAY REMAINING BALANCE') or contains(text(),'Full Check')]";   //button[contains(text(),'Full Check')]
	
	
	// Tap on 'Click to Pay' button
	public void tapOnClickToPay() {

		if (base.getElement(XPATH, clickToPay) != null) {
			if (base.isDisplayed(clickToPay)) {
				base.tapElementUsingJS(clickToPay);
				wait = new WebDriverWait(this.driver, 5);
			} else {
				Assert.assertFalse(base.isDisplayed(clickToPay), "Not able to click "+clickToPay+" to Bag button");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, clickToPay), "Click to Pay button is not available");
		}
	}
	
	// Tap on 'Pay emaining balance' button
	public void tapPayRemainingBalance() {

		if (base.getElement(XPATH, payRemainingBalance) != null) {
			if (base.isDisplayed(payRemainingBalance)) {
				base.tapElementUsingJS(payRemainingBalance);
				wait = new WebDriverWait(this.driver, 5);
			} else {
				Assert.assertFalse(base.isDisplayed(payRemainingBalance), "Not able to click "+payRemainingBalance+" to Bag button");
			}
		} else {
			Assert.assertNull(base.getElement(XPATH, payRemainingBalance), "Pay Remaining Balance button is not available");
		}
	}

}
