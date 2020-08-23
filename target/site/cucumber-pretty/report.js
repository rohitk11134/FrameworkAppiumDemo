$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/RegressionSuite.feature");
formatter.feature({
  "name": "One Dine - mWeb Application Regression Scenarios",
  "description": "\tAs a Registered user, I want to test regression sceanrios of the application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.scenario({
  "name": "Curbside flow type-3 - Pay Now - Make a successful payment with valid card details for curbside flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Onedine application in the mobile browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingSteps.i_open_the_Onedine_application_in_the_mobile_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the spot code as \u0027PAI11CU\u0027 in the seven digit spot code field",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_enter_the_spot_code_as_in_the_seven_digit_spot_code_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_tap_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that it navigate to check-in screen and Sign in button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_verify_that_it_navigate_to_check_in_screen_and_Sign_in_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Sign In screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.navigateToSignInScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the link Sign in with a password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_the_link_Sign_in_with_a_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid login credentials from the excel sheet name \"Login_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_login_credentials_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button present in Login Screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button_present_in_Login_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to spot number screen and verify the message displayed on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "SpotNumberSteps.i_navigate_to_spot_number_screen_and_verify_the_message_displayed_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Spot Number from the excel sheet \"SpotNo_Success\" in the Spot Number field",
  "keyword": "And "
});
formatter.match({
  "location": "SpotNumberSteps.i_enter_the_Spot_Number_from_the_excel_sheet_in_the_Spot_Number_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on next arrow button and submit the spot number",
  "keyword": "And "
});
formatter.match({
  "location": "SpotNumberSteps.i_tap_on_next_arrow_button_and_submit_the_spot_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027Order\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that selected category is \u0027Entrees\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_verify_that_selected_category_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll down the page till \u0027Cheese ravioli with marinara and chicken\u0027 menu and select the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_scroll_down_the_page_till_menu_and_select_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on order button with \u0027Cheese ravioli with marinara and chicken\u0027 item to add it to the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_order_button_with_item_to_add_it_to_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to menu details screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_menu_details_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Fettuccini\u0027 , \u0027Sausage\u0027 and \u0027Alfredo\u0027 as the required modifiers",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_select_and_as_the_required_modifiers(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Add to Bag button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_Add_to_Bag_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on My Bag from bottom footer",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_tap_on_My_Bag_from_bottom_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027My Bag\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the next buttton",
  "keyword": "When "
});
formatter.match({
  "location": "MyBagSteps.i_click_on_the_next_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to checkout screen",
  "keyword": "Then "
});
formatter.match({
  "location": "MyBagSteps.i_should_be_able_to_navigate_to_checkout_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that added menu is being displayed in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_verify_that_added_menu_is_being_displayed_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay Now button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to Payment screen of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_should_be_able_to_navigate_to_Payment_screen_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the valid card details into the fields from the excel sheet name \"Payment_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_enter_the_valid_card_details_into_the_fields_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select No Tip as a tip amount",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_select_No_Tip_as_a_tip_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay Now button available on payment screen",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_Now_button_available_on_payment_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Confirm button to proceed the payment",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Confirm_button_to_proceed_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on payment confirmation screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_am_on_payment_confirmation_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Curbside flow type-3 - Pay later (Pay At Restaurant) to make a successful order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Onedine application in the mobile browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingSteps.i_open_the_Onedine_application_in_the_mobile_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the spot code as \u0027PAI11CU\u0027 in the seven digit spot code field",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_enter_the_spot_code_as_in_the_seven_digit_spot_code_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_tap_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that it navigate to check-in screen and Sign in button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_verify_that_it_navigate_to_check_in_screen_and_Sign_in_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Sign In screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.navigateToSignInScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the link Sign in with a password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_the_link_Sign_in_with_a_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid login credentials from the excel sheet name \"Login_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_login_credentials_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button present in Login Screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button_present_in_Login_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to spot number screen and verify the message displayed on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "SpotNumberSteps.i_navigate_to_spot_number_screen_and_verify_the_message_displayed_on_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Spot Number from the excel sheet \"SpotNo_Success\" in the Spot Number field",
  "keyword": "And "
});
formatter.match({
  "location": "SpotNumberSteps.i_enter_the_Spot_Number_from_the_excel_sheet_in_the_Spot_Number_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on next arrow button and submit the spot number",
  "keyword": "And "
});
formatter.match({
  "location": "SpotNumberSteps.i_tap_on_next_arrow_button_and_submit_the_spot_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027Order\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that selected category is \u0027Entrees\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_verify_that_selected_category_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll down the page till \u0027Cheese ravioli with marinara and chicken\u0027 menu and select the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_scroll_down_the_page_till_menu_and_select_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on order button with \u0027Cheese ravioli with marinara and chicken\u0027 item to add it to the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_order_button_with_item_to_add_it_to_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to menu details screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_menu_details_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Fettuccini\u0027 , \u0027Sausage\u0027 and \u0027Alfredo\u0027 as the required modifiers",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_select_and_as_the_required_modifiers(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Add to Bag button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_Add_to_Bag_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on My Bag from bottom footer",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_tap_on_My_Bag_from_bottom_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027My Bag\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the next buttton",
  "keyword": "When "
});
formatter.match({
  "location": "MyBagSteps.i_click_on_the_next_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to checkout screen",
  "keyword": "Then "
});
formatter.match({
  "location": "MyBagSteps.i_should_be_able_to_navigate_to_checkout_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that added menu is being displayed in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_verify_that_added_menu_is_being_displayed_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay at the Restaurant button available on the Payment screen",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_at_the_Restaurant_button_available_on_the_Payment_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Order Now button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Order_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Confirm button to proceed the payment",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Confirm_button_to_proceed_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on payment confirmation screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_am_on_payment_confirmation_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Online Pickup - Pay Now to make a successful payment with valid card details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Onedine application in the mobile browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingSteps.i_open_the_Onedine_application_in_the_mobile_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the spot code as \u0027PAI11OL\u0027 in the seven digit spot code field",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_enter_the_spot_code_as_in_the_seven_digit_spot_code_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_tap_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that it navigate to check-in screen and Sign in button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_verify_that_it_navigate_to_check_in_screen_and_Sign_in_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Sign In screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.navigateToSignInScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the link Sign in with a password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_the_link_Sign_in_with_a_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid login credentials from the excel sheet name \"Login_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_login_credentials_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button present in Login Screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button_present_in_Login_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to Pickup screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PickupSteps.i_should_be_able_to_navigate_to_Pickup_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Name as \u0027John Doe\u0027 , select Pickup Date as \u0027Tomorrow\u0027 and select Pickup time as \u002708:45 PM\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PickupSteps.i_enter_the_Name_as_select_Pickup_Date_as_and_select_Pickup_time_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the Next button with all the mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "PickupSteps.i_submit_the_Next_button_with_all_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027Order\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that selected category is \u0027Entrees\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_verify_that_selected_category_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll down the page till \u0027Cheese ravioli with marinara and chicken\u0027 menu and select the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_scroll_down_the_page_till_menu_and_select_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on order button with \u0027Cheese ravioli with marinara and chicken\u0027 item to add it to the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_order_button_with_item_to_add_it_to_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to menu details screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_menu_details_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Fettuccini\u0027 , \u0027Sausage\u0027 and \u0027Alfredo\u0027 as the required modifiers",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_select_and_as_the_required_modifiers(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Add to Bag button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_Add_to_Bag_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on My Bag from bottom footer",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_tap_on_My_Bag_from_bottom_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027My Bag\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the next buttton",
  "keyword": "When "
});
formatter.match({
  "location": "MyBagSteps.i_click_on_the_next_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to checkout screen",
  "keyword": "Then "
});
formatter.match({
  "location": "MyBagSteps.i_should_be_able_to_navigate_to_checkout_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that added menu is being displayed in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_verify_that_added_menu_is_being_displayed_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay Now button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to Payment screen of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_should_be_able_to_navigate_to_Payment_screen_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the valid card details into the fields from the excel sheet name \"Payment_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_enter_the_valid_card_details_into_the_fields_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select No Tip as a tip amount",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_select_No_Tip_as_a_tip_amount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay Now button available on payment screen",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_Now_button_available_on_payment_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Confirm button to proceed the payment",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Confirm_button_to_proceed_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on payment confirmation screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_am_on_payment_confirmation_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Online Pickup - Pay Later (Pay at restaurant) to make a successful order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Onedine application in the mobile browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingSteps.i_open_the_Onedine_application_in_the_mobile_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the spot code as \u0027PAI11OL\u0027 in the seven digit spot code field",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_enter_the_spot_code_as_in_the_seven_digit_spot_code_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_tap_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that it navigate to check-in screen and Sign in button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_verify_that_it_navigate_to_check_in_screen_and_Sign_in_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Sign In screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.navigateToSignInScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the link Sign in with a password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_the_link_Sign_in_with_a_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid login credentials from the excel sheet name \"Login_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_login_credentials_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button present in Login Screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button_present_in_Login_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to Pickup screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PickupSteps.i_should_be_able_to_navigate_to_Pickup_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Name as \u0027John Doe\u0027 , select Pickup Date as \u0027Tomorrow\u0027 and select Pickup time as \u002711:45 PM\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PickupSteps.i_enter_the_Name_as_select_Pickup_Date_as_and_select_Pickup_time_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the Next button with all the mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "PickupSteps.i_submit_the_Next_button_with_all_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027Order\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that selected category is \u0027Entrees\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_verify_that_selected_category_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll down the page till \u0027Cheese ravioli with marinara and chicken\u0027 menu and select the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_scroll_down_the_page_till_menu_and_select_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on order button with \u0027Cheese ravioli with marinara and chicken\u0027 item to add it to the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_order_button_with_item_to_add_it_to_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to menu details screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_menu_details_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Fettuccini\u0027 , \u0027Sausage\u0027 and \u0027Alfredo\u0027 as the required modifiers",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_select_and_as_the_required_modifiers(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Add to Bag button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_Add_to_Bag_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on My Bag from bottom footer",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_tap_on_My_Bag_from_bottom_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027My Bag\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the next buttton",
  "keyword": "When "
});
formatter.match({
  "location": "MyBagSteps.i_click_on_the_next_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to checkout screen",
  "keyword": "Then "
});
formatter.match({
  "location": "MyBagSteps.i_should_be_able_to_navigate_to_checkout_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that added menu is being displayed in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_verify_that_added_menu_is_being_displayed_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay at the Restaurant button available on the Payment screen",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_at_the_Restaurant_button_available_on_the_Payment_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Order Now button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Order_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Confirm button to proceed the payment",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Confirm_button_to_proceed_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on payment confirmation screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_am_on_payment_confirmation_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Online Delivery - Pay Later (Pay at restaurant) to make a successful order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open the Onedine application in the mobile browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter the spot code as \u0027PAI11OL\u0027 in the seven digit spot code field",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify that it navigate to check-in screen and Sign in button is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on Sign In button",
  "keyword": "Then "
});
formatter.step({
  "name": "I navigate to the Sign In screen",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on the link Sign in with a password",
  "keyword": "And "
});
formatter.step({
  "name": "I enter valid login credentials from the excel sheet name \"Login_Success\"",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on Sign In button present in Login Screen",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to navigate to Pickup screen",
  "keyword": "Then "
});
formatter.step({
  "name": "I tap on the Delivery tab",
  "keyword": "And "
});
formatter.step({
  "name": "I enter or select the Name as \u003cGuest Name\u003e , Delivery Date as \u003cDelivery Date\u003e , Delivery Time as \u003cDelivery Time\u003e , Address as \u003cAddress\u003e , City as \u003cCity\u003e , State as \u003cState\u003e, Zip as \u003cZip Code\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I submit the Next button with all the mandatory fields",
  "keyword": "When "
});
formatter.step({
  "name": "I should be able to navigate to \u0027Order\u0027 screen",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify that selected category is \u0027Entrees\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "I scroll down the page till \u0027Cheese ravioli with marinara and chicken\u0027 menu and select the menu",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on order button with \u0027Cheese ravioli with marinara and chicken\u0027 item to add it to the menu",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to navigate to menu details screen",
  "keyword": "Then "
});
formatter.step({
  "name": "I select \u0027Fettuccini\u0027 , \u0027Sausage\u0027 and \u0027Alfredo\u0027 as the required modifiers",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on Add to Bag button",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on My Bag from bottom footer",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to navigate to \u0027My Bag\u0027 screen",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on the next buttton",
  "keyword": "When "
});
formatter.step({
  "name": "I should be able to navigate to checkout screen",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify that added menu is being displayed in the screen",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on Pay at the Restaurant button available on the Payment screen",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on Order Now button",
  "keyword": "And "
});
formatter.step({
  "name": "I tap on Confirm button to proceed the payment",
  "keyword": "And "
});
formatter.step({
  "name": "I am on payment confirmation screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Guest Name",
        "Delivery Date",
        "Delivery Time",
        "Address",
        "City",
        "State",
        "Zip Code"
      ]
    },
    {
      "cells": [
        "\u0027John Doe\u0027",
        "\u0027Tomorrow\u0027",
        "\u002711:45 PM\u0027",
        "\u0027221 B, Baker Street\u0027",
        "\u0027London\u0027",
        "\u0027LA\u0027",
        "\u002785284\u0027"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Online Delivery - Pay Later (Pay at restaurant) to make a successful order",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the Onedine application in the mobile browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingSteps.i_open_the_Onedine_application_in_the_mobile_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the spot code as \u0027PAI11OL\u0027 in the seven digit spot code field",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_enter_the_spot_code_as_in_the_seven_digit_spot_code_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_tap_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that it navigate to check-in screen and Sign in button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LandingSteps.i_verify_that_it_navigate_to_check_in_screen_and_Sign_in_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Sign In screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.navigateToSignInScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the link Sign in with a password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_the_link_Sign_in_with_a_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid login credentials from the excel sheet name \"Login_Success\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_login_credentials_from_the_excel_sheet_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Sign In button present in Login Screen",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_tap_on_Sign_In_button_present_in_Login_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to Pickup screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PickupSteps.i_should_be_able_to_navigate_to_Pickup_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on the Delivery tab",
  "keyword": "And "
});
formatter.match({
  "location": "PickupSteps.i_tap_on_the_Delivery_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter or select the Name as \u0027John Doe\u0027 , Delivery Date as \u0027Tomorrow\u0027 , Delivery Time as \u002711:45 PM\u0027 , Address as \u0027221 B, Baker Street\u0027 , City as \u0027London\u0027 , State as \u0027LA\u0027, Zip as \u002785284\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "PickupSteps.i_enter_or_select_the_Name_as_Delivery_Date_as_Delivery_Time_as_Address_as_City_as_State_as_Zip_as(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit the Next button with all the mandatory fields",
  "keyword": "When "
});
formatter.match({
  "location": "PickupSteps.i_submit_the_Next_button_with_all_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027Order\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that selected category is \u0027Entrees\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_verify_that_selected_category_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll down the page till \u0027Cheese ravioli with marinara and chicken\u0027 menu and select the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_scroll_down_the_page_till_menu_and_select_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on order button with \u0027Cheese ravioli with marinara and chicken\u0027 item to add it to the menu",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_order_button_with_item_to_add_it_to_the_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to menu details screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_menu_details_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \u0027Fettuccini\u0027 , \u0027Sausage\u0027 and \u0027Alfredo\u0027 as the required modifiers",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_select_and_as_the_required_modifiers(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Add to Bag button",
  "keyword": "And "
});
formatter.match({
  "location": "OrderDetailsSteps.i_tap_on_Add_to_Bag_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on My Bag from bottom footer",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_tap_on_My_Bag_from_bottom_footer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to \u0027My Bag\u0027 screen",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderDetailsSteps.i_should_be_able_to_navigate_to_screen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the next buttton",
  "keyword": "When "
});
formatter.match({
  "location": "MyBagSteps.i_click_on_the_next_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to navigate to checkout screen",
  "keyword": "Then "
});
formatter.match({
  "location": "MyBagSteps.i_should_be_able_to_navigate_to_checkout_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that added menu is being displayed in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "MyBagSteps.i_verify_that_added_menu_is_being_displayed_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Pay at the Restaurant button available on the Payment screen",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Pay_at_the_Restaurant_button_available_on_the_Payment_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Order Now button",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Order_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I tap on Confirm button to proceed the payment",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentSteps.i_tap_on_Confirm_button_to_proceed_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on payment confirmation screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentSteps.i_am_on_payment_confirmation_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});