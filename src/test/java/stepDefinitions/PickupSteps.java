package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PickupScreen;

public class PickupSteps {
	
	PickupScreen pickUpScreen = new PickupScreen();
	
	@Then("I should be able to navigate to Pickup screen")
	public void i_should_be_able_to_navigate_to_Pickup_screen() {
		pickUpScreen.verifyPickUpScreen();
	}

	@Then("I enter the Name as {string} , select Pickup Date as {string} and select Pickup time as {string}")
	public void i_enter_the_Name_as_select_Pickup_Date_as_and_select_Pickup_time_as(String guestName, String pickUpDate, String pickUpTime) {
		pickUpScreen.populcatePickUpScreenFields(guestName, pickUpDate, pickUpTime);
	}

	@When("I submit the Next button with all the mandatory fields")
	public void i_submit_the_Next_button_with_all_the_mandatory_fields() {
		pickUpScreen.submitNextButton();
	}

}
