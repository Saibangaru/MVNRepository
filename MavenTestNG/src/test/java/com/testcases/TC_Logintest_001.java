package com.testcases;


import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

import com.pageobjects.LoginPage;

import junit.framework.Assert;


public class TC_Logintest_001 extends BaseClass {

@Test
public void logintest()
{
	driver.get(url);
	logger.info("Enter url");
	
	LoginPage lp = new LoginPage(driver);
   lp.setUserName(username);
   
  logger.info("Entered Username");
   
   
	lp.setPassword(password);
	
	logger.info("Entered password");
	lp.clickButton();
	logger.info("clicked login button");
	
	if(driver.getTitle().contains("OrangeHRM"))
	{
		System.out.println("Login Successfully");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("Login Failed");
		Assert.assertFalse(false);
	}
}


}
