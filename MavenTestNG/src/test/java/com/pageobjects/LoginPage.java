package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public WebDriver rdriver;
	
	public LoginPage(WebDriver ldriver)
	{
		rdriver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	
	}
	

	


	@FindBy(name="txtUsername")
	//@FindBy(id="Email")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(name="txtPassword")
	//@FindBy(id="Password")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(name="Submit")
	//@FindBy(xpath="//input[@value='Log in']")
	@CacheLookup
	WebElement button;
	
	public void setUserName(String uname)
	{
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setPassword(String upass)
	{
		txtpass.clear();
		txtpass.sendKeys(upass);
		
	}
	
	public void clickButton()
	{
		button.click();
	}
	
	
	
	

}
