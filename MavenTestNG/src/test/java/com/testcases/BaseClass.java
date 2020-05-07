package com.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
public  static WebDriver driver;
//calling url, useraName, password, driverpath from readcofig.java	
public String url=readconfig.getUrl();
 public  String username=readconfig.getUname();
 public String password=readconfig.getPassWord();
 public static Logger logger;
 
 //passing parameter to run program on desired browsser
 
 @Parameters("browser")
 @BeforeClass
 public void setup( String br)
 {
	 if(br.equals("chrome"))
	 {
		 
	 
	 System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			//	System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
 driver= new ChromeDriver();
 }
 else
 {
	 System.out.println("Chrome browser is not available");
 }
  logger=Logger.getLogger("BaseClass");
 PropertyConfigurator.configure("log4j.properties");
 
 }
 
 @AfterClass
 public void teardown()
 {
	 driver.close();
 }
}
