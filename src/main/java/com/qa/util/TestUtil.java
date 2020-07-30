package com.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestUtil {
	
		static int PAGE_LOAD_WAIT = 60;
		static int IMPLICIT_WAIT = 	60;
		static JavascriptExecutor jsexe;
		
		
		

		public static void flashElement(WebElement ele) throws InterruptedException
		{
			jsexe = (JavascriptExecutor)TestBase.driver;
			
			String elementDefautbgColor = ele.getCssValue("background-color");
			//System.out.println("-----elementDefautbgColor of WebElement is "+elementDefautbgColor);
			
			jsexe.executeScript("arguments[0].setAttribute('style' , 'background: yellow; border: 2px solid red;'); ", ele);
			Thread.sleep(500);
			jsexe.executeScript("arguments[0].setAttribute('style' , 'backgroundColor= "+elementDefautbgColor+"'); ", ele);
		
		}
	

}
