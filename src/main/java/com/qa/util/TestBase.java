package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	    public static WebDriver driver;
		public static Properties prop;
		
		public TestBase(){
			prop = new Properties();
			
			String path = ("C:/Users/hp-pc/workspace/cucumberBDDPOM/src/main/java/com/qa/config/config.properties"); 
		
			try {
				FileInputStream fis = new FileInputStream(path);
				prop.load(fis);
			} catch (FileNotFoundException e) {
				System.out.println("some issue with cofig.prop please check and correct your config...");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		
		}
		
		public static void initilize(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("chrome")){
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();		
			//driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);		
			driver.get(prop.getProperty("url"));
		}
	
	
	
	
}
