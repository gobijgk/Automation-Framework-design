package com.automationPractice.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationPractice.base.TestBase;
import com.automationPractice.util.RespositoryParser;

public class HomePage extends TestBase {
	private RespositoryParser parser;
	
	
	
	//some changes
	
	private static Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriverWait wait=new WebDriverWait(driver, 20);
	 
public static final String d=prop.getProperty("url");
	
	public HomePage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
		parser=new RespositoryParser(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\object.properties");
		
	}
	public void homePage() throws InterruptedException{
		log.info("verify the Home page");
		By h=parser.getbjectLocator("verifyPage");
		
		getKey().verifyPage(prop.getProperty("verify"), getKey().findElement(h).getText());
	}

}
