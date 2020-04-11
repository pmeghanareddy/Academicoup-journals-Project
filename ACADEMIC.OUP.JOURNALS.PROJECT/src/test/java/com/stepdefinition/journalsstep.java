package com.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.library;
import com.pages.journalspage;
import com.pages.signinpage;
import com.seleniumutility.seleniumutility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class journalsstep {
	
//	Logger LOG = LogManager.getLogger(signinpage.class.getName());
	
	WebDriver driver;
	
	seleniumutility util;
	
	journalspage journals;
	
	final static Logger LOG=LogManager.getLogger(signinpage.class.getName());
	
	@Given("^User has the home page with signin in journals AtoZ$")
	public void user_has_the_home_page_with_signin_in_journals_AtoZ() throws Throwable 
	{
	     driver = library.launchApplication();
		 LOG.info("Journals A to Z and Microscopy is clicked");
		 driver.get("https://academic.oup.com/journals");
	}

	@When("^click on Journals A to Z item and select Alphabet M$")
	public void click_on_Journals_A_to_Z_item() throws Throwable 
	{
	
    	LOG.info("More content and Advance articles is clicked");
		
		journalspage jp = new journalspage(driver);
		
		jp.leavemenu();
	    
	}

	@Then("^verify the perticular Alphabet data is displayed$")
	public void verify_the_perticular_Alphabet_data_is_displayed() throws Throwable {
		
//		add screenshot
	   
		util = new seleniumutility(driver);
		util.takeSnapShot("D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\ScreenShot\\journals.png");
		System.out.println("ScreenShot taken");
	   }
	
	public void  close() {
		  driver.close();
		}

		
	}



