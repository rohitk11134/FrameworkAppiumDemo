@RegressionTest	
Feature: One Dine - mWeb Application Regression Scenarios
	As a Registered user, I want to test regression sceanrios of the application
  	
	
	Scenario: Curbside flow type-3 - Pay Now - Make a successful payment with valid card details for curbside flow 
		Given I open the Onedine application in the mobile browser 
		And I enter the spot code as 'PAI11CU' in the seven digit spot code field
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
		Then I should be able to navigate to 'Order' screen 
		And I verify that selected category is 'Entrees' 
		And I scroll down the page till 'Cheese ravioli with marinara and chicken' menu and select the menu 
		And I tap on order button with 'Cheese ravioli with marinara and chicken' item to add it to the menu 
		Then I should be able to navigate to menu details screen 
		And I select 'Fettuccini' , 'Sausage' and 'Alfredo' as the required modifiers 
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
		
		
	Scenario: Curbside flow type-3 - Pay later (Pay At Restaurant) to make a successful order
		Given I open the Onedine application in the mobile browser 
		And I enter the spot code as 'PAI11CU' in the seven digit spot code field
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
		And I tap on Pay at the Restaurant button available on the Payment screen 
		And I tap on Order Now button 
		And I tap on Confirm button to proceed the payment 
		Then I am on payment confirmation screen
		
	
	Scenario: Online Pickup - Pay Now to make a successful payment with valid card details
		Given I open the Onedine application in the mobile browser 
		And I enter the spot code as 'PAI11OL' in the seven digit spot code field
		And I tap on submit button 
		And I verify that it navigate to check-in screen and Sign in button is displayed 
		Then I tap on Sign In button 
		And I navigate to the Sign In screen 
		And I tap on the link Sign in with a password 
		And I enter valid login credentials from the excel sheet name "Login_Success" 
		And I tap on Sign In button present in Login Screen
		Then I should be able to navigate to Pickup screen
		And I enter the Name as 'John Doe' , select Pickup Date as 'Tomorrow' and select Pickup time as '08:45 PM'
		When I submit the Next button with all the mandatory fields
		Then I should be able to navigate to 'Order' screen 
		And I verify that selected category is 'Entrees' 
		And I scroll down the page till 'Cheese ravioli with marinara and chicken' menu and select the menu 
		And I tap on order button with 'Cheese ravioli with marinara and chicken' item to add it to the menu 
		Then I should be able to navigate to menu details screen 
		And I select 'Fettuccini' , 'Sausage' and 'Alfredo' as the required modifiers 
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
	
		
	Scenario: Online Pickup - Pay Later (Pay at restaurant) to make a successful order
		Given I open the Onedine application in the mobile browser 
		And I enter the spot code as 'PAI11OL' in the seven digit spot code field
		And I tap on submit button 
		And I verify that it navigate to check-in screen and Sign in button is displayed 
		Then I tap on Sign In button 
		And I navigate to the Sign In screen 
		And I tap on the link Sign in with a password 
		And I enter valid login credentials from the excel sheet name "Login_Success" 
		And I tap on Sign In button present in Login Screen
		Then I should be able to navigate to Pickup screen
		And I enter the Name as 'John Doe' , select Pickup Date as 'Tomorrow' and select Pickup time as '11:45 PM'
		When I submit the Next button with all the mandatory fields
		Then I should be able to navigate to 'Order' screen 
		And I verify that selected category is 'Entrees' 
		And I scroll down the page till 'Cheese ravioli with marinara and chicken' menu and select the menu 
		And I tap on order button with 'Cheese ravioli with marinara and chicken' item to add it to the menu 
		Then I should be able to navigate to menu details screen 
		And I select 'Fettuccini' , 'Sausage' and 'Alfredo' as the required modifiers 
		And I tap on Add to Bag button 
		And I tap on My Bag from bottom footer 
		Then I should be able to navigate to 'My Bag' screen 
		When I click on the next buttton 
		Then I should be able to navigate to checkout screen 
		And I verify that added menu is being displayed in the screen  
		And I tap on Pay at the Restaurant button available on the Payment screen 
		And I tap on Order Now button 
		And I tap on Confirm button to proceed the payment 
		Then I am on payment confirmation screen

	Scenario Outline: Online Delivery - Pay Later (Pay at restaurant) to make a successful order
		Given I open the Onedine application in the mobile browser 
		And I enter the spot code as 'PAI11OL' in the seven digit spot code field
		And I tap on submit button 
		And I verify that it navigate to check-in screen and Sign in button is displayed 
		Then I tap on Sign In button 
		And I navigate to the Sign In screen 
		And I tap on the link Sign in with a password 
		And I enter valid login credentials from the excel sheet name "Login_Success" 
		And I tap on Sign In button present in Login Screen
		Then I should be able to navigate to Pickup screen
		And I tap on the Delivery tab
		And I enter or select the Name as <Guest Name> , Delivery Date as <Delivery Date> , Delivery Time as <Delivery Time> , Address as <Address> , City as <City> , State as <State>, Zip as <Zip Code>
		When I submit the Next button with all the mandatory fields
		Then I should be able to navigate to 'Order' screen 
		And I verify that selected category is 'Entrees' 
		And I scroll down the page till 'Cheese ravioli with marinara and chicken' menu and select the menu 
		And I tap on order button with 'Cheese ravioli with marinara and chicken' item to add it to the menu 
		Then I should be able to navigate to menu details screen 
		And I select 'Fettuccini' , 'Sausage' and 'Alfredo' as the required modifiers 
		And I tap on Add to Bag button 
		And I tap on My Bag from bottom footer 
		Then I should be able to navigate to 'My Bag' screen 
		When I click on the next buttton 
		Then I should be able to navigate to checkout screen 
		And I verify that added menu is being displayed in the screen  
		And I tap on Pay at the Restaurant button available on the Payment screen 
		And I tap on Order Now button 
		And I tap on Confirm button to proceed the payment 
		Then I am on payment confirmation screen
	
  Examples: 
    |	Guest Name	|	Delivery Date	|	Delivery Time	|	Address					|	City		|	State		|	Zip Code	|
    |	'John Doe'	|	'Tomorrow'		|	'11:45 PM'		|	'221 B, Baker Street'	|	'London'	|	'LA'		|	'85284'		|
  	