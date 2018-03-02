package com.automationPractice.Test;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.automationPractice.base.TestBase;

public class ddTest extends TestBase {
	private static Logger log = Logger.getLogger(ddTest.class.getName());
	public ddTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void TC001_openHomePage() throws Exception{
//		test=extent.startTest("TC001_openHomePage");
		log.info("Open Automation website");
		getBrowser().intialization();
		driver.close();
//		getScreenShoot().captureScreen(driver, "test");
	}
}
