package com.automationPractice.util;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.automationPractice.base.TestBase;
 
public class CaptureScreenShot extends TestBase {
	
	public CaptureScreenShot() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
private static final DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd SSS");
	
	public static String captureScreen(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination
            String desg=System.getProperty("user.dir")+"\\src\\main\\resources\\Screenshot\\"+fileWithPath+".png";
                File DestFile=new File(desg);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
				return desg;

    
	}
	
	public static String generateFileName(ITestResult result){
		Date date = new Date();
		String fileName = result.getName()+ "_" + dateFormat.format(date);
		return fileName;	
	}
}