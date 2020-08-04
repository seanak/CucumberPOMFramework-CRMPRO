package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.TestBase;

public class ContactsPage extends TestBase{
	LoginPage  loginpage;
	HomePage homePage;

	
	
	By fName = By.id("first_name");
	By lName = By.id("surname");
	By pos = By.id("company_position");
	By saveBtn = By.xpath("//input[2][@value ='Save']");
	
	//constructor 
	public ContactsPage(WebDriver driver){
		TestBase.driver= driver;
		loginpage = new LoginPage(driver);
		homePage = new HomePage(driver);
		
	}
	
	//methods 
	
	public void createNewContact(String firstName,String lastname,String position){
	driver.findElement(fName).sendKeys(firstName);
	driver.findElement(lName).sendKeys(lastname);
	driver.findElement(pos).sendKeys(position);
	}
	
	public void clickOnSaveCont(){
		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
	}
	
	public void tearDown(){
		driver.quit();
	}

}
