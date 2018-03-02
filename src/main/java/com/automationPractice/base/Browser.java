package com.automationPractice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser extends TestBase {
public Browser() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

public void intialization(){
	String browser = prop.getProperty("browser");
	if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(browser.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\IEDriverServer.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	driver.get(prop.getProperty("url"));
}


}
