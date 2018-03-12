package com.automationPractice.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.automationPractice.pages.HomePage;
import com.automationPractice.util.CaptureScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase  {
	public static WebDriver driver;
	public static Properties prop;
//	public ExtentReports extent;
//	public ExtentTest test;
	public TestBase() throws Exception {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\config\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\config\\object.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		extent = new ExtentReports (System.getProperty("user.dir") +"\\target\\surefire-reports\\Extent.html", true);
	}

//	public class GetPages {
//		common classes
		 public Browser browser=null;
		public Keywords key = null;
		public CaptureScreenShot screenshot=null;
		
//		pages
	   public HomePage homePage=null;
	    
	    
		public Keywords getKey() {
			if (key == null) {
				try {
					return new Keywords();
				} catch (Exception e) {
					// TODO Auto-generated catch block

					e.printStackTrace();
				}
			}

			return key;
		}
		public Browser getBrowser() {
			if (browser == null) {
				try {
					return new Browser();
				} catch (Exception e) {
					// TODO Auto-generated catch block

					e.printStackTrace();
				}
			}

			return browser;
		}
		
		public CaptureScreenShot getScreenShoot() {
			if (screenshot == null) {
				try {
					return new CaptureScreenShot();
				} catch (Exception e) {
					// TODO Auto-generated catch block

					e.printStackTrace();
				}
			}

			return screenshot;
		}
		
		public HomePage gethomePage(){
			if (homePage == null) {
				try {
					return new HomePage();
				} catch (Exception e) {
					// TODO Auto-generated catch block

					e.printStackTrace();
				}
			}

			return homePage;
		}

}
