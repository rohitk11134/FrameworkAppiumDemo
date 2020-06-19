Feature: Payment Screen 
	In order to test Payment Screen of OneDine's application in mobile browser
  	As a Registered user
  	I want to specify the features of Payment screen

Background: flow till Sign in to the application and entering the spot code
	Given I open the Onedine application in the mobile browser
	And I enter the Spot Code from the excel sheet "SpotCode_Success" in the Spot Code field
	And I tap on submit button
	And I verify that it navigate to check-in screen and Sign in button is displayed
	Then I tap on Sign In button
	And I navigate to the Sign In screen
	And I tap on the link Sign in with a password
	And I enter valid login credentials from the excel sheet name "Login_Success"
	And I tap on Sign In button present in Login Screen
	Then I navigate to spot number screen and verify the message displayed on the screen
	And I enter the Spot Number from the excel sheet "SpotNo_Success" in the Spot Number field
	And I tap on next arrow button and submit the spot number
	
@sanity
Scenario: Make a successfull payment with valid card details for curbside flow
	Then I should be able to navigate to 'Order' screen
	And I verify that selected category is 'Beverages'
	And I scroll down the page till 'Coffee' menu and select the menu
	And I tap on order button with 'Coffee' item to add it to the menu
	Then I should be able to navigate to menu details screen
	And I tap on Add to Bag button
	And I tap on My Bag from bottom footer
	Then I should be able to navigate to 'My Bag' screen
	When I click on the next buttton
	Then I should be able to navigate to checkout screen
	And I verify that added menu is being displayed in the screen
	And I tap on Pay Now button
	Then I should be able to navigate to Payment screen of the application
	And I enter the valid card details into the fields from the excel sheet name "Payment_Success"
	And I select No Tip as a tip amount
	And I tap on Pay Now button available on payment screen
	And I tap on Confirm button to proceed the payment
	Then I am on payment confirmation screen
	
	
@regression
Scenario: Make a unsuccessfull payment with invalid card details for curbside flow
	Then I should be able to navigate to 'Order' screen
	And I verify that selected category is 'Beverages'
	And I scroll down the page till 'Coffee' menu and select the menu
	And I tap on order button with 'Coffee' item to add it to the menu
	Then I should be able to navigate to menu details screen
	And I tap on Add to Bag button
	And I tap on My Bag from bottom footer
	Then I should be able to navigate to 'My Bag' screen
	When I click on the next buttton
	Then I should be able to navigate to checkout screen
	And I verify that added menu is being displayed in the screen
	And I tap on Pay Now button
	Then I should be able to navigate to Payment screen of the application
	And I enter the invalid card details into the fields from the excel sheet name "PaymentTip_Failure"
	And I tap on Pay Now button available on payment screen
	Then error message(s) are displayed on the payment screen
	
	