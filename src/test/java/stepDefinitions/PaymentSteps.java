package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Then;
import pages.MyBagScreen;
import pages.PaymentScreen;
import reader.StaticDataProvider;

public class PaymentSteps {
	
	PaymentScreen payment = new PaymentScreen();
	MyBagScreen myBag = new MyBagScreen();
	
	@Then("I tap on Pay Now button")
	public void i_tap_on_Pay_Now_button() {
		myBag.tapOnPayNowButton();
	}

	@Then("I should be able to navigate to Payment screen of the application")
	public void i_should_be_able_to_navigate_to_Payment_screen_of_the_application() {
		payment.verifyPaymentScreen();
	}

	@Then("I enter the valid card details into the fields from the excel sheet name {string}")
	public void i_enter_the_valid_card_details_into_the_fields_from_the_excel_sheet_name(String sheetName) throws IOException {
		String[][] testData = StaticDataProvider.getExcelData(sheetName);
	    payment.populatePaymentScreenFields(testData);
	}

	@Then("I select No Tip amount")
	public void i_select_No_Tip_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I tap on Pay Now button available on payment screen")
	public void i_tap_on_Pay_Now_button_available_on_payment_screen() {
	    payment.tapPayNowButton();
	}

	@Then("I tap on Confirm button to proceed the payment")
	public void i_tap_on_Confirm_button_to_proceed_the_payment() {
	    payment.tapConfirmButton();
		}

	@Then("I am on payment confirmation screen")
	public void i_am_on_payment_confirmation_screen() {
		payment.verifyPaymentConfirmationScreen();
	}

	@Then("I enter the invalid card details into the fields from the excel sheet name {string}")
	public void i_enter_the_invalid_card_details_into_the_fields_from_the_excel_sheet_name(String sheetName) throws IOException {
		String[][] testData = StaticDataProvider.getExcelData(sheetName);
	    payment.populatePaymentScreenFields(testData);
	}

	@Then("error message\\(s) are displayed on the payment screen")
	public void error_message_s_are_displayed_on_the_payment_screen() {
	    // Write code here that turns the phrase above into concrete actions 
		payment.verifyScreenErrorMessage();
	}

}
