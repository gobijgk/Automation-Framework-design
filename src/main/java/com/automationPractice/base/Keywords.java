package com.automationPractice.base;

import java.util.List;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Keywords extends TestBase {
WebDriverWait wait=new WebDriverWait(driver, 10);
	public Keywords() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void verifyPage(String expected, boolean actual) {
		Assert.assertTrue(expected, actual);

	}

	public WebElement findElement(By by) {

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return element;

	}

	public List<WebElement> findElementS(By by) {

		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		return elements;

	}
}
