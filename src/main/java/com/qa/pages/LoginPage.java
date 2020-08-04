package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.qa.stepDefinitions.HomePageSteps;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	TestBase testbase;
	TestUtil timeUtil;
	HomePageSteps homePS;
	JavascriptExecutor js;
	
	
	By username  = By.xpath("//input[@name='username']");
	By password  = By.xpath("//input[@name='password']");
	By loginButton  = By.xpath("//input[@class='btn btn-small']");
	By loginPageHeader  = By.xpath("//a[@class='navbar-brand']");
	
	//constructor of the class 
	
	public LoginPage(WebDriver driver){
		//here I gave driver value from base page to maintain only one session id through out test.
		//If I use this.driver then driver value is null and then null pointer exception is coming.
		TestBase.driver = driver; 
		System.out.println(driver);
		timeUtil = new TestUtil();
		
	}
	
	//methods/ page actions 
	
	public String getLoginPageTitle(){
		return driver.getTitle();	
		
	}
	
	public boolean verifyLoginPageHeader(){
		return driver.findElement(loginPageHeader).isDisplayed();
	}
	
	public HomePage doLogin(String email, String pwd) throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(username).sendKeys(email);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		//Thread.sleep(6000);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_WAIT, TimeUnit.MILLISECONDS);
		return new HomePage(driver);
	}
	

	
	/*
		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		
		@FindBy(xpath="//input [@name='password']")
		WebElement password;
		
		@FindBy(xpath="//input[@class='btn btn-small']")
		WebElement loginButton;
		
		@FindBy(xpath="//a[@class='navbar-brand']")
		WebElement LoginPageHeader;

		
		
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}

		
		
		
		public String getLoginPageTitle(){
			return driver.getTitle();
		}

		public boolean verifyLoginPageHeader(){
			return LoginPageHeader.isDisplayed();
		}
		
		public HomePage login(String email, String pwd){
		
			username.sendKeys(email);
			
			password.sendKeys(pwd);
			
			loginButton.click();
			
			return new HomePage(driver);
		}
*/
}
