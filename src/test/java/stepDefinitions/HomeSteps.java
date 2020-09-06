package stepDefinitions;

import cucumber.api.java.en.When;
import pages.HomeScreen;

public class HomeSteps {

	HomeScreen homeScreen = new HomeScreen();

	@When("I tap on Click to Pay button")
	public void i_tap_on_Click_to_Pay_button() {
	    // Write code here that turns the phrase above into concrete actions
		homeScreen.tapOnClickToPay();
	}
	
	@When("I tap on Pay Remaining Balance button")
	public void i_tap_on_Pay_Remaining_Balance_button() {
	    // Write code here that turns the phrase above into concrete actions
		homeScreen.tapPayRemainingBalance();
	}

	
}
