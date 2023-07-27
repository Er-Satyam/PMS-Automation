package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//use for reporting and monitoring of the testcases
public class ListnerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 String name=result.getName();//fetching same name as testmethod
			
		 TakesScreenshot ts= (TakesScreenshot) driver;//type cast the driver to takesscreenshot
		        File src = ts.getScreenshotAs(OutputType.FILE);//method use to press print screen button and take screenshot
		
		        File dest= new File("./ScreenShot/"+name+".png");//creating the folder and ref variable
		    
		        try {
					FileUtils.copyFile(src, dest);//copy file from ram to folder
				
		        } catch (IOException e) {
					
				}

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestStart(ITestResult result) {


		
	}

	@Override
	public void onTestSuccess(ITestResult result) {


	}
	

}
