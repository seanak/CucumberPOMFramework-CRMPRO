package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase { // when this TestBase class extends Home page class then Browser can run 
	
	LoginPage  loginpage = new LoginPage(driver);
	HomePage homePage;
	ContactsPage contactsPage;
	
	@Given("^user opens browser$")
	public void user_opens_browser()  {
	    TestBase.initilize();
	    
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page()  {
		System.out.println("stephd driver "+driver);
		String loginPageTitle =  loginpage.getLoginPageTitle();
		System.out.println("login page title is "+loginPageTitle);
		//CRMPRO - CRM software for customer relationship management, sales, and support.
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", loginPageTitle);
	   
	}
	
	@Then("^user verify header$")
	public void user_verify_header() {
	    
	    loginpage.verifyLoginPageHeader();
	}

	@Then("^user enters username and password and clicks on login button$")
	public void user_enters_username_and_password_and_clicks_on_login_button(){
		
		homePage = loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}


	@Then("^Home Page is Displayed$")
	public void home_Page_is_Displayed() {
		
		String homePageTitle = homePage.verifyHomePageTitle();
		System.out.println("Home page title is :-"+ homePageTitle);
		Assert.assertEquals("CRMPRO", homePageTitle);	
		
	}
	
	@Then("^User switch to main frame$")
	public void user_switch_to_main_frame(){
	  homePage.switchToFrame();
	}

	@Then("^user go to contacts and clicks on new contacts$")
	public void user_go_to_contacts_and_clicks_on_new_contacts(){
		contactsPage = homePage.goToContactMenu();
	 }
	
	@Then("^user add contacts details$")
	public void user_add_contacts_details() {
	   contactsPage.createNewContact(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("position"));
	}

	@Then("^user save contact details$")
	public void user_save_contact_details() {
	  contactsPage.clickOnSaveCont();
	}

	
	@Then("^user close browser$")
	public void user_close_browser() {
		contactsPage.tearDown();
	    
	}

	

}
