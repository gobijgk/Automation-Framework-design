package com.automationPractice.Test;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationPractice.base.TestBase;
import com.automationPractice.util.CaptureScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
//import com.utility.CaptureScreenShot;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomepageTest extends TestBase{
	private static Logger log = Logger.getLogger(HomepageTest.class.getName());
	
public HomepageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
//		extent = new ExtentReports(File.separator
//				+ "Extent.html", true);

		
	}
//@BeforeMethod
public void openUrl(){
	
	log.info("Open Automation website");
	getBrowser().intialization();	
}
@Test
public void TC001_openHomePage() throws Exception{
//	test=extent.startTest("TC001_openHomePage");
	log.info("Open Automation website");
	getBrowser().intialization();
	gethomePage().homePage();
//	getScreenShoot().captureScreen(driver, "test");
}
@AfterMethod
public void tearDown(ITestResult result) throws Exception{
driver.close();	
}
}
