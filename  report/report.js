$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Amazon.feature");
formatter.feature({
  "name": "Purchase of an item in Amazon Online Shopping",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AmazonTask"
    }
  ]
});
formatter.scenario({
  "name": "price validation of mobile phone and to remove it from cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AmazonTask"
    }
  ]
});
formatter.step({
  "name": "Open firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "testMethods.TestMethods.open_firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Url",
  "keyword": "When "
});
formatter.match({
  "location": "testMethods.TestMethods.enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input the mobile name from the excel sheet in the search box and submit",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.input_the_mobile_name_from_the_excel_sheet_in_the_search_box_and_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the first link in the appeared List of mobiles",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.click_the_first_link_in_the_appeared_list_of_mobiles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Switch to child window and click on the Add to Cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.click_on_the_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on proceed to checkout button",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.click_on_proceed_to_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login pop up appears input the mobile number from excel sheet",
  "keyword": "When "
});
formatter.match({
  "location": "testMethods.TestMethods.login_pop_up_appears_input_the_mobile_number_from_excel_sheet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input the password from excel sheet",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.input_the_password_from_excel_sheet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the current window",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.close_the_current_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Switch to the main window",
  "keyword": "And "
});
formatter.match({
  "location": "testMethods.TestMethods.switch_to_the_main_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on cart",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.click_on_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete the added cart and close the main window",
  "keyword": "Then "
});
formatter.match({
  "location": "testMethods.TestMethods.delete_the_added_cart_and_close_the_main_window()"
});
formatter.result({
  "status": "passed"
});
});