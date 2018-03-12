package com.automationPractice.Test;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Before;
import org.openqa.selenium.By;
//import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertScreenshot {
	WebDriver driver;
	@BeforeMethod
	public void init() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	}

	@Test
	public void bla() throws Exception  {
	    WebElement element = driver.findElement(By.xpath("//input[@type=\"button\"]"));
	    // Trigger the alert
	    element.click();
	    BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	    ImageIO.write(image, "png", new File("E:\\gobi.png"));
	    driver.switchTo().alert().accept();
	}
}
