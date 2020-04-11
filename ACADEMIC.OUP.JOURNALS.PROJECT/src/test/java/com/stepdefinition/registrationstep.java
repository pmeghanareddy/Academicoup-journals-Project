package com.stepdefinition;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.library;
import com.pages.registrationpage;
import com.pages.signinpage;
import com.seleniumutility.seleniumutility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registrationstep 
{
//	Logger LOG = LogManager.getLogger(signinpage.class.getName());
	
	WebDriver driver;
	
	seleniumutility util;
	
	final static Logger LOG=LogManager.getLogger(signinpage.class.getName());
	
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Exception 
		{
			 driver = library.launchApplication();
			 LOG.info("Browser is opened");
			 driver.get("https://academic.oup.com/journals");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			
			
		}
		@When("^User Navigates to Registration Page$")
		public void user_Navigates_to_Registration_Page() throws Exception 
		{
			
			LOG.info("Registration page is opened");
			registrationpage rsp = new registrationpage(driver);
			
			rsp.registerAccount();
			Thread.sleep(5000);

			
		}
		
		@Then("^User enters email id password and confirm password \"([^\"]*)\"and \"([^\"]*)\" \"([^\"]*)\"$")
		public void user_enters_email_id_password_and_confirm_password_and(String arg1, String arg2, String arg3) throws InterruptedException {
		
		   LOG.info("Clicked email and password");
			registrationpage rsp = new registrationpage(driver);
			rsp.credentials(arg1,arg2);
			rsp.Registerbutton();
			Thread.sleep(3000);
			
		}
		
		
		
		
		
		@And("^Message displayed Registration Successfull$")
		public void message_displayed_Registration_Successfull() throws Exception 
		{
			seleniumutility util = new seleniumutility(driver);
			util.takeSnapShot("D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\ScreenShot\\register.png");
			System.out.println("Registration Successfull");
		}
		
		public void  close() 
		{
			  driver.close();
			}

	}

	
