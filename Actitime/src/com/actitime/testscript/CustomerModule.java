package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;



@Listeners(com.actitime.generic.ListnerImplementation.class)//listeners annotation with full qualified name of class
public class CustomerModule extends BaseClass {       //class name same as module

	
	@Test
	public void testCreateCustomer() {   //testmethod name same as testcases
		Reporter.log("Create Customer" ,true);
		//for making the testcase fail
		
		
		//next make this testcase data driven
		
	}
	
	
	
}
