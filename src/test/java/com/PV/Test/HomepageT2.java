package com.PV.Test;

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

import com.PV.base.TestBase;
import com.PV.util.CaptureScreenShot;
import com.PV.util.ExcelLib;
import com.relevantcodes.extentreports.ExtentReports;
//import com.utility.CaptureScreenShot;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomepageT2 {
public static void main(String[] args) {
	String tt="Username";
	 ExcelLib lib = new ExcelLib("E:\\Test.xlsx");
	int tt2= lib.getData1(0, 0,tt);
	 int rowCont = lib.getRowCont(0);
     int j = 0;
     for (int i = 1; i <= rowCont; i++) {
         String r = lib.getData(0, i,tt2);
         System.out.println(r);
//         obj[j][1] = lib.getData(0, i, 1);
//         j++;
     }
	 
}
}
