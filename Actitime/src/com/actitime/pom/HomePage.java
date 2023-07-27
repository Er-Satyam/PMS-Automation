package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab; //declaration
	
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this); //initilization
	}

	public void setLogout() throws InterruptedException {
		   Thread.sleep(4000);                             //utilization
	    logout.click();
	}
	
	public void setTasksTab() {
                                        //utilization
           tasksTab.click();
}
}
