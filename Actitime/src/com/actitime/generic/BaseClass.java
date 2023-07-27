package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;
//baseclass contain all configuration methods which is common for all testcases

public class BaseClass {
   public static WebDriver driver;//static mandatory for screenshot
	@BeforeTest
	public void openBrowser() {
	Reporter.log("Open Browser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close Browser",true);	
		driver.quit();
	}
	
	
	@BeforeMethod
	public void login() throws IOException{
		Reporter.log("Login",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l= new LoginPage(driver);
		l.setLogin(un, pw);
		
	
	   
	
	}
	
	
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Reporter.log("Logout",true);
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
	
	
	
}
