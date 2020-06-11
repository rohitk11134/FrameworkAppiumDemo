package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LandingScreen;
import pages.LoginScreen;
import reader.StaticDataProvider;

public class LandingSteps {
	
	LandingScreen landingScreen = new LandingScreen();

	@Given("I open the Onedine application in the mobile browser")
	public void i_open_the_Onedine_application_in_the_mobile_browser() {
		landingScreen.verifyWelcomeMessage();
	}
	
	@Given("I verify that QR code scanner and Spot Code fields are displayed")
	public void i_verify_that_QR_code_scanner_and_Spot_Code_fields_are_displayed() {
	    landingScreen.verifyQRScannerDisplayed();
	}
	
	@Given("I enter the Spot Code from the excel sheet {string} in the Spot Code field")
	public void i_enter_the_Spot_Code_from_the_excel_sheet_in_the_Spot_Code_field(String sheetName) throws IOException {
	    //To get the data from excel sheet
		String[][] testData = StaticDataProvider.getExcelData(sheetName);
		// To populate the spot code field
		landingScreen.populateLandingScreenFields(testData);
		}

	@Given("I tap on submit button")
	public void i_tap_on_submit_button() {
	    // Tap on Next arrow mark button
		landingScreen.tapNextButton();
	}

	@Given("I verify that it navigate to check-in screen and Sign in button is displayed")
	public void i_verify_that_it_navigate_to_check_in_screen_and_Sign_in_button_is_displayed() {
		landingScreen.isSignInButtonDisplayed();
	}


	@Given("I verify that the error message\\(s) are displayed")
	public void i_verify_that_the_error_message_s_are_displayed() {
	    landingScreen.verifyScreenErrorMessage();
	}


	
}