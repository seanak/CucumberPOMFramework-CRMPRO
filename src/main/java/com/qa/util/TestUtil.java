package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestUtil {
	
		public static int PAGE_LOAD_WAIT = 10000;
		public static int IMPLICIT_WAIT = 	10000;
		static JavascriptExecutor jsexe;
		
		
		

		public static void flashElement(By ele) throws InterruptedException
		{
			jsexe = (JavascriptExecutor)TestBase.driver;
			
			String elementDefautbgColor = ((WebElement) ele).getCssValue("background-color");
			//System.out.println("-----elementDefautbgColor of WebElement is "+elementDefautbgColor);
			
			jsexe.executeScript("arguments[0].setAttribute('style' , 'background: yellow; border: 2px solid red;'); ", ele);
			Thread.sleep(500);
			jsexe.executeScript("arguments[0].setAttribute('style' , 'backgroundColor= "+elementDefautbgColor+"'); ", ele);
		
		}
	

}
