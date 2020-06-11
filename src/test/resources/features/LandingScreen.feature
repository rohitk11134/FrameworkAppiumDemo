Feature: Landing Screen 
	In order to test Landing Page of OneDine's application in mobile browser
  	As a Registered user
  	I want to specify the features of Landing page

@sanity 
Scenario: Launch the Onedine web app in the mobile browser 
	Given I open the Onedine application in the mobile browser 
	And I verify that QR code scanner and Spot Code fields are displayed 
	
	
@sanity 
Scenario: Enter and Submit the valid spot code and navigate to the Check-in screen 
	Given I open the Onedine application in the mobile browser 
	And I enter the Spot Code from the excel sheet "SpotCode_Success" in the Spot Code field 
	And I tap on submit button 
	And I verify that it navigate to check-in screen and Sign in button is displayed 
	
	
@sanity 
Scenario: Enter an invalid spot code and verify the error message displayed on the screen 
	Given I open the Onedine application in the mobile browser 
	And I enter the Spot Code from the excel sheet "SpotCode_Failure" in the Spot Code field 
	And I tap on submit button 
	And I verify that the error message(s) are displayed 
	
	
@regression 
Scenario: Enter an empty spot code and verify the error message displayed on the screen 
	Given I open the Onedine application in the mobile browser 
	And I enter the Spot Code from the excel sheet "EmptySpotCode_Failure" in the Spot Code field 
	And I tap on submit button 
	And I verify that the error message(s) are displayed