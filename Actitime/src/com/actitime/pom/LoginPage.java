package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx; //declaration
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this); //initilization
	}

	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);            //utilization
	    lgBtn.click();
	}
}
