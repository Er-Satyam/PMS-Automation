package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TaskListPage {
	 @FindBy(xpath="//div[text()='Add New']")
		private WebElement addNew;
		
		@FindBy(xpath="//div[text()='+ New Customer']")
		private WebElement newcust; //declaration
		
		@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
		private WebElement custName;
		
		@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
		private WebElement custDes; //declaration

		
		
		@FindBy(xpath="//div[@class='selectedItem' ]/div[text()='- Select Customer -']")
		private WebElement selectCust; //declaration
		
		
	
		@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][normalize-space()='Big Bang Company']")
		private WebElement selectComp; //declaration
		
		
		
		
		@FindBy(xpath="//div[contains(text(),'Create Customer')]")
		private WebElement createCust; //declaration
		
		
		
		
		
		
		
		public TaskListPage(WebDriver driver) {
			PageFactory.initElements(driver, this); //initilization
		}

		
		public void addNew() {
			                                     //utilization
		    addNew.click();
		}
		
		
		public void newCust() {
	                                             //utilization
			newcust.click();
             }
		
		
		public void custName() {
            //utilization
          custName.sendKeys("HDFC_002");
         }
		
		public void custDes() {
            //utilization
			custDes.click();
			custDes.sendKeys("Banking Project");
           }
		
		public void selectCust() {
            //utilization
			selectCust.click();
			
           }
		
		public void selectComp() {
            Reporter.log("company selected",true);     //utilization
			selectComp.click();
			
           }
		
		public void createCust() {
            //utilization
			createCust.click();
			
           }
		
		
		
		
		
		}

