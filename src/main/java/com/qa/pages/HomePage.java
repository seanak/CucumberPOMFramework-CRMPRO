package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.TestBase;


public class HomePage extends TestBase {
	
	WebDriver driver;
	Actions action;
	
	By frame = By.xpath("//frame[@name='mainpanel']");
	By homePageHeader = By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[1]");
	By contactMenu = By.xpath("//*[@id='navmenu']/ul/li[4]/a");
	By contactSubMenu = By.xpath("//li/a[@title='New Contact']");
	
	

	//constructor
 	
	public HomePage(WebDriver driver){
		this.driver=driver;
		action = new Actions(driver);
	}
	
	//methods
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public void switchToFrame(){
		WebElement frameMain = driver.findElement(frame);
		driver.switchTo().frame(frameMain);
		
	}
	 public void goToContactMenu(){
		WebElement parentCon = driver.findElement(contactMenu);
		action.moveToElement(parentCon).build().perform();
		driver.findElement(contactSubMenu).click();
		 
	 }

}
