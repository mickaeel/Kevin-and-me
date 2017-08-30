package com.fourstay.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.fourstay.models.User;
import com.fourstay.pages.GeneralAccountSettings;
import com.fourstay.pages.HomePage;
import com.fourstay.pages.UserAccountPage;
import com.fourstay.utilities.Page;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLoginStepDefs {
	HomePage homePage = new HomePage();
	GeneralAccountSettings accountSettings = new GeneralAccountSettings();

	@Given("^the user is on the FourStay homepage$")
	public void the_user_is_on_the_FourStay_homepage() throws Throwable {
		homePage.open();
	}

	@Given("^the user signs in using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_signs_in_using_and(String email, String password) throws Throwable {

		homePage.login(email, password);
	}

	@When("^the user goes to the user general settings page$")
	public void the_user_goes_to_the_user_general_settings_page() throws Throwable {
		UserAccountPage userAccountPage = new UserAccountPage();
		// Page.waitForClickable(userAccountPage.profilePicture, 10);
		Page.waitForPageToLoad();
		userAccountPage.profilePicture.click();
		userAccountPage.editProfile.click();
	}

	@Then("^the user full name should be \"([^\"]*)\" \"([^\"]*)\"$")
	public void the_user_full_name_should_be(String firstName, String lastName) throws Throwable {
		Page.waitForPageToLoad();
		Page.sleep(3000);
		assertEquals(firstName, accountSettings.firstNameInputBox.getAttribute("value"));
		assertEquals(lastName, accountSettings.lastNameInputBox.getAttribute("value"));

	}

	@Then("^the user phone number should be \"([^\"]*)\"$")
	public void the_user_phone_number_should_be(String phoneNumber) throws Throwable {
		assertEquals(phoneNumber, accountSettings.phoneNumber.getAttribute("value"));
	}

	@Then("^the user email should be \"([^\"]*)\"$")
	public void the_user_email_should_be(String email) throws Throwable {
		assertEquals(email, accountSettings.emailBox.getAttribute("value"));
	}

	@Then("^bed options should have the following entries:$")
	public void bed_options_should_have_the_following_entries(List<String> list) throws Throwable {
		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}
		// click on the dropdown
		// get the web element list of all options
		// compare with the expected list

	}

	@Then("^the user information should be displayed on general settings page$")
	public void the_user_information_should_be_displayed_on_general_settings_page(List<User> users) throws Throwable {
		System.out.println(users.size());
		for (User user : users) {
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getEmail());
			System.out.println(user.getPassword());
			System.out.println(user.getPhoneNumber());
			System.out.println("**********************************");
		}
	}

	
	//  Are we going to use it at work?
	
	
	
	@When("^the user signs in$")
	public void the_user_signs_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // create your own users object
		// save it in class level
		// sign in useing your own user object
	}

	@Then("^the user information should be displayed on general settings$")
	public void the_user_information_should_be_displayed_on_general_settings() throws Throwable {
	    //  use the same ofject from above for verifying
	}
	
	
	
	


}

// noun
// when we describe 4stay project
// what are the nouns will be most commonly used

// user ,host, payment, place, location, order, search, logo






