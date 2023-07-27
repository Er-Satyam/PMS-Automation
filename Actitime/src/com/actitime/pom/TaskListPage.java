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
		
		
		@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
		private WebElement actualCustomerFld;
		
		
		
		
		public TaskListPage(WebDriver driver) {
			PageFactory.initElements(driver, this); //initilization
		}

		
		public WebElement getAddNewBtn() {
			                                     //utilization
		   return addNew;
		}
		
		
		public WebElement getNewCustomerBtn() {
	                                             //utilization
		return	newcust;
             }
		
		
		public WebElement getEnterCustNameTbx() {
            //utilization
         return custName;
         }
		
		public WebElement getEnterCustDespTbx() {
            //utilization
			return custDes;
			
           }
		
		public WebElement getSelectCustDD() {
            //utilization
			return selectCust;
			
           }
		
		public WebElement getBigBangCompany() {
            Reporter.log("company selected",true);     //utilization
			return selectComp;
			
           }
		
		public WebElement getCreateCustomerBtn() {
            //utilization
			return createCust;
			
           }
		
		
		
		public WebElement getActualCustomerFld() {
			return actualCustomerFld;
		}
		
		
		}

