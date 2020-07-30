package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement userPassword;
		
		@FindBy(xpath="//input[@class='btn btn-small']")
		WebElement loginButton;
		
		@FindBy(xpath="//a[@class='navbar-brand']")
		WebElement LoginPageHeader;

		
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}

		
		
		
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}

		public boolean verifyLoginPageHeader(){
			return LoginPageHeader.isDisplayed();
		}
		
		public HomePage login(String email, String pwd) throws InterruptedException{
			TestUtil.flashElement(username);
			username.sendKeys(email);
			
			TestUtil.flashElement(userPassword);
			userPassword.sendKeys(pwd);
			
			TestUtil.flashElement(loginButton);
			loginButton.click();
			
			return new HomePage(driver);
		}

}
