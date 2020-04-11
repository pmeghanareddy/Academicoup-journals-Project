package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class library  // using screenshot and configuration
{
 public static WebDriver driver;
 
 //final static Logger LOG=LogManager.getLogger(library.class.getName());
 public static Properties prop;
 static String currentPath = System.getProperty("user.dir");	
 
 public static WebDriver launchApplication() throws IOException
 {
	 if(driver!=null)
	 {
		 return driver;
	 }
	 FileInputStream fis = new FileInputStream("D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\configurationproperty\\config.property");
	 
	 prop = new Properties();
	 prop.load(fis);
	 String browser=prop.getProperty("browser");
	// String url=prop.getProperty("url");
	 
	 try {
		 if (browser.equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
	 else if(browser.equalsIgnoreCase("chrome"))
	{
		     System.setProperty("webdriver.chrome.driver","D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\Drivers\\chromedriver.exe");
		     driver = new ChromeDriver();
	 }
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 //  driver.get(url);
	 
	 }
	 
	 catch(WebDriverException e)
	 {
		 System.out.println("browser could not be launched");
	 }
	return driver;
	 
 }
 
 
public void quit()
{
	driver.close();
}
}