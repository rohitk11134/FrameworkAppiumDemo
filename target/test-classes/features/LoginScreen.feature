Feature: Login Screen 
	In order to test Landing Page of OneDine's application in mobile browser
  	As a Registered user
  	I want to specify the features of Login page

Background: flow till Check-in screen
	Given I open the Onedine application in the mobile browser
	And I enter the Spot Code from the excel sheet "SpotCode_Success" in the Spot Code field
	And I tap on submit button
	And I verify that it navigate to check-in screen and Sign in button is displayed 

@sanity 
Scenario: To check the messages displayed in check-in screen after entering a valid spot code 
	Then I verify the check-in messages displayed on the check-in screen

@sanity 
Scenario: To cancel Check-in and go back to the Landing screen 
	And I tap on Cancel check-in link present in the Check-in screen
	Then I get redirected back to Landing screen	

@sanity 
Scenario: To verify the checked-in places displayed in the check-in screen and login screen are the same 
	Then I tap on Sign In button
	And I verify the checked-in place displayed on Login screen is the same to that of check-in screen
	
@sanity 
Scenario: To Verify Successful Sign In to the OneDine application with a password
	Then I tap on Sign In button
	And I navigate to the Sign In screen
	And I tap on the link Sign in with a password
	And I enter valid login credentials from the excel sheet name "Login_Success"
	And I tap on Sign In button present in Login Screen
	Then I naviagte to spot number screen and verify the message displayed on the screen
	
@sanity
Scenario: Login with invalid credential and verify the error messages displayed
	Then I tap on Sign In button
	And I navigate to the Sign In screen
	And I tap on the link Sign in with a password
	And I enter valid login credentials from the excel sheet name "Login_Failure"
	And I tap on Sign In button present in Login Screen
	Then I verify the error message(s) displayed on Login Screen
	
@regression 
Scenario: Login with blank credential and verify the error messages displayed
	Then I tap on Sign In button
	And I navigate to the Sign In screen
	And I tap on the link Sign in with a password
	And I enter valid login credentials from the excel sheet name "LoginBlank_Failure"
	And I tap on Sign In button present in Login Screen
	Then I verify the error message(s) displayed on Login Screen