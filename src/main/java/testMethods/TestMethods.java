package testMethods;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChildWindow;
import pages.MainWindow;

public class TestMethods {
	
	@Given("^Open firefox browser$")
    public void open_firefox_browser() {
     
	MainWindow.openBrowser();	
	}

    @When("^Enter Url$")
    public void enter_url() {
    	MainWindow.enterUrl();
      
    
    }
    
    @Then("^Input the mobile name from the excel sheet in the search box and submit$")
    public void input_the_mobile_name_from_the_excel_sheet_in_the_search_box_and_submit() throws IOException {
        
    	MainWindow.mobileSearch();
    }
   
    @Then("^Click the first link in the appeared List of mobiles$")
    public void click_the_first_link_in_the_appeared_list_of_mobiles() {
    	
        MainWindow.clickFirstLink();
    }

    @Then("^Switch to child window and click on the Add to Cart button$")
    public void click_on_the_add_to_cart_button() {
        
    	MainWindow.switchToChildWindowAndClickonAddtoCart();
    }
    
    @Then("^Click on proceed to checkout button$")
    public void click_on_proceed_to_checkout_button() {
        ChildWindow.proceedToCheckout();
    }

    @When("^Login pop up appears input the mobile number from excel sheet$")
    public void login_pop_up_appears_input_the_mobile_number_from_excel_sheet() throws IOException {
        ChildWindow.inputMobileNumber();
    	
    }


    @Then("^Click on continue button$")
    public void click_on_continue_button() {
    	ChildWindow.clickContinueButton();
        
    }

    @Then("^Input the password from excel sheet$")
    public void input_the_password_from_excel_sheet() throws IOException {
        ChildWindow.inputPassword();
    }

    @Then("^Click on the login button$")
    public void click_on_the_login_button() {
    	ChildWindow.clickOnLoginButton();
        
    }

    @Then("^Close the current window$")
    public void close_the_current_window() {
        ChildWindow.closeCurrentWindow();
    }
    
    @And("^Switch to the main window$")
    public void switch_to_the_main_window() {
        ChildWindow.switchToMainwindow();
    }

    @Then("^Click on cart$")
    public void click_on_cart() {
        
    	ChildWindow.clickOnCart();
    }

    @Then("^Delete the added cart and close the main window$")
    public void delete_the_added_cart_and_close_the_main_window() {
        
    	ChildWindow.clickDeleteCartButton();
    }
   
}
