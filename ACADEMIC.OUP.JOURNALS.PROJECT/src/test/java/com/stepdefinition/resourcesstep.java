package com.stepdefinition;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.library;
import com.pages.resourcespage;
import com.pages.signinpage;
import com.seleniumutility.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class resourcesstep 
{

//	Logger LOG = LogManager.getLogger(signinpage.class.getName());
	
	WebDriver driver ;

	seleniumutility util;

	final static Logger LOG=LogManager.getLogger(signinpage.class.getName());
	
	@Given("^I launch Chrome$")
	public void i_launch_Chrome() throws IOException  
	{
		driver = library.launchApplication();
		System.out.println("Chrome launched");
		LOG.info("Browser is Opened");
		
		
	}
	
	@When("^Resources Page is opened$")
	public void resources_Page_is_opened() throws Throwable {

		LOG.info("clicked on resourcesmenu");
		
		driver.get("https://academic.oup.com/journals");
		
		Thread.sleep(5000);
		resourcespage rsp = new resourcespage(driver);
		rsp.resources_resourcesmenu();
		
	   
	}


	@Then("^clicks the Resources$")
	public void clicks_the_Resources() throws Throwable {
		resourcespage rsp = new resourcespage(driver);
				
		rsp.authors();
		
	    util = new seleniumutility(driver);
		util.takeSnapShot("D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\ScreenShot\\resources.png");
		System.out.println("ScreenShot taken");
	   }
	
	
	public void  close() {
		  driver.close();
		}

}


