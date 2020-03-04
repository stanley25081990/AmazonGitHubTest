@AmazonTask
Feature: Purchase of an item in Amazon Online Shopping 

Scenario: price validation of mobile phone and to remove it from cart
Given Open firefox browser
When Enter Url 
Then Input the mobile name from the excel sheet in the search box and submit
Then Click the first link in the appeared List of mobiles
Then Switch to child window and click on the Add to Cart button
Then Click on proceed to checkout button
When Login pop up appears input the mobile number from excel sheet
Then Click on continue button
Then Input the password from excel sheet
Then Click on the login button
Then Close the current window
And Switch to the main window
Then Click on cart
Then Delete the added cart and close the main window

 