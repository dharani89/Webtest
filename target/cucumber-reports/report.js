$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E2ETest.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase and User Update Test Automation",
  "description": "Description: The purpose of this file is to test Purchase and User Update features",
  "id": "purchase-and-user-update-test-automation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 43105600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User Navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the credentials and login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userNavigatesToLoginPage()"
});
formatter.result({
  "duration": 5412926800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userLogin()"
});
formatter.result({
  "duration": 3894312200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userLoginSuccessful()"
});
formatter.result({
  "duration": 34400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Customer place an order for T-Shirt",
  "description": "",
  "id": "purchase-and-user-update-test-automation;customer-place-an-order-for-t-shirt",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User navigates to T-Shirt page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User proceeds to checkout",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "enter the requested checkout details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "proceed confirming order placement",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Order should be placed successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User navigates to order history page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Order should be visible in order history page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userNavigatesToProductPage()"
});
formatter.result({
  "duration": 3230812400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.chooseToBuyFirstItem()"
});
formatter.result({
  "duration": 306674000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.proceedToCheckout()"
});
formatter.result({
  "duration": 8184534500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enterCheckoutDetails()"
});
formatter.result({
  "duration": 7689105000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.proceedOrderConfirmation()"
});
formatter.result({
  "duration": 1925861900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.orderSuccessfullyPlaced()"
});
formatter.result({
  "duration": 23000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.navigateToOrderHistoryPage()"
});
formatter.result({
  "duration": 1685674900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validateOrderHistoryPage()"
});
formatter.result({
  "duration": 44958300,
  "status": "passed"
});
formatter.after({
  "duration": 112701700,
  "status": "passed"
});
formatter.before({
  "duration": 2086700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User Login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User Navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the credentials and login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userNavigatesToLoginPage()"
});
formatter.result({
  "duration": 4850585400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userLogin()"
});
formatter.result({
  "duration": 3802731000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userLoginSuccessful()"
});
formatter.result({
  "duration": 21600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Update personal details firstname",
  "description": "",
  "id": "purchase-and-user-update-test-automation;update-personal-details-firstname",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "User Navtigates to Account information page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User choose to Update personal details",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "updates First name",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "First name update should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "revert the test changes",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.navigateToAccountInformationPage()"
});
formatter.result({
  "duration": 1754787400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.chooseToUpdatePersonalDetails()"
});
formatter.result({
  "duration": 1142805800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.updateFirstName()"
});
formatter.result({
  "duration": 1109396300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.firstNameUpdateValidation()"
});
formatter.result({
  "duration": 90300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.revertChange()"
});
formatter.result({
  "duration": 6445898000,
  "status": "passed"
});
formatter.after({
  "duration": 117406500,
  "status": "passed"
});
});