Feature: Spot Number Screen 
	In order to test Landing Page of OneDine's application in mobile browser
  	As a Registered user
  	I want to specify the features of Spot Number screen after login

Background: flow till Sign in to the application
	Given I open the Onedine application in the mobile browser
	And I enter the Spot Code from the excel sheet "SpotCode_Success" in the Spot Code field
	And I tap on submit button
	And I verify that it navigate to check-in screen and Sign in button is displayed
	Then I tap on Sign In button
	And I navigate to the Sign In screen
	And I tap on the link Sign in with a password
	And I enter valid login credentials from the excel sheet name "Login_Success"
	And I tap on Sign In button present in Login Screen

@sanity
Scenario: To verify if user navigated to Spot number screen after login to the application 
	Then I navigate to spot number screen and verify the message displayed on the screen
		
@sanity
Scenario: Enter the valid spot number into the field and submit the form 
	Then I navigate to spot number screen and verify the message displayed on the screen
	And I enter the Spot Number from the excel sheet "SpotNo_Success" in the Spot Number field
	And I tap on next arrow button and submit the spot number
	Then it navigates to the Order screen and I verify if the Order tab is selected in the bottom footer
	
	
@sanity
Scenario: Enter the field with empty or blank spot number and verify the displayed error message 
	Then I navigate to spot number screen and verify the message displayed on the screen
	And I enter the Spot Number from the excel sheet "SpotNo_Failure" in the Spot Number field
	And I tap on next arrow button and submit the spot number
	Then I verify the error message displayed
	
@sanity
Scenario: Enter special characters as an invalid spot number into the field and verify the displayed error message 
	Then I navigate to spot number screen and verify the message displayed on the screen
	And I enter the Spot Number from the excel sheet "EmptySpotNo_Failure" in the Spot Number field
	And I tap on next arrow button and submit the spot number
	Then I verify the error message displayed