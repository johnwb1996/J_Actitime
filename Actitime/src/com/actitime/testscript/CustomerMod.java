package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerMod extends BaseClass{
		
	@Test
	public static  void TestCreateCustomerdemo()
	{
		Reporter.log("TestCreateCustomer",true);
		
	}
	
	@Test
	public static  void TestDeleteCustomerdemo()
	{
		Reporter.log("TestDeleteCustomer",true);
	}
	@Test
	public static  void TestModifyCustomerdemo()
	{
		Reporter.log("TestModifyCustomer",true);

		
	}

}
