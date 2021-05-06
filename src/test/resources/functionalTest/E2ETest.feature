Feature: Purchase and User Update Test Automation
Description: The purpose of this file is to test Purchase and User Update features

Background: User Login
  Given User Navigates to login page
	When User enter the credentials and login
	Then User should be successfully logged in

Scenario: Customer place an order for T-Shirt
	Given User navigates to T-Shirt page
	And choose to buy the first item
	When User proceeds to checkout
	And enter the requested checkout details
	And proceed confirming order placement
	Then Order should be placed successfully
	When User navigates to order history page
	Then Order should be visible in order history page
	
Scenario: Update personal details firstname
	Given User Navtigates to Account information page
	When User choose to Update personal details
	And updates First name
	Then First name update should be successful
	And revert the test changes