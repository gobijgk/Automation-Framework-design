package com.automationPractice.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase extends GetPages {
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



}
