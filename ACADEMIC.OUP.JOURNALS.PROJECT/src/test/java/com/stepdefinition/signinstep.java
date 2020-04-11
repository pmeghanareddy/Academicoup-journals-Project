package com.stepdefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.baseclass.library;
import com.excelutility.excel_datadriven;
import com.pages.signinpage;
import com.seleniumutility.seleniumutility;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signinstep 
{
	//Logger LOG = LogManager.getLogger(signinpage.class.getName());
	
	
	final static Logger LOG=LogManager.getLogger(signinpage.class.getName());
	seleniumutility util;
	
	WebDriver driver ;
	
	signinpage signin;
	
	excel_datadriven excel ;
	
	  @Given("^I launch Chrome in signin$")
	  
   public void i_launch_Chrome() throws IOException 
   {
		//	 launchBrowser();
		  
		     driver = library.launchApplication();
		  
		     LOG.info("Browser is opened");
		     
		     System.out.println("Browser is Launched");
		     
		     signin = new signinpage(driver);
		  
   }		     
   


	@When("^I open Academic oup page$")
	
	  public void i_open_academic_oup_page() 
	{
	      
	 System.out.println("Academic oup page opens");
  	 
  	 LOG.info("Academic oup page is opened");
  	  
	 driver.get("https://academic.oup.com/journals");
    }
	  

    @Then("^I verify that user enter$")
    
      public void i_verify_that_user_enter_and() throws InterruptedException, IOException  
    {
    	excel_datadriven excel=new excel_datadriven();
	      String pwd = excel.excel_password(1);
	      String email = excel.excel_username(1);

		  signinpage sp = new signinpage(driver);
		  sp.signin_inspect();
		  
		  try {
			sp.signin_username(email);
			sp.signin_password(pwd);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  //sp.signinbuttoninspect();
		  Thread.sleep(5000);
		//  sp.signin_username(arg1);
		//  sp.signin_password(arg2);

	    LOG.info("Username and Password is enetered");
		  
		System.out.println("username and password entered");
   
    }

   @And("^I clicks the signin button$")
   public void i_clicks_the_signin_button() throws InterruptedException 
   {
	      signinpage sp = new signinpage(driver);
		 
	      sp.signinbuttoninspect();
		 
	       LOG.info("Click the signin button");
	      	  
		    util = new seleniumutility(driver);
		    
			util.takeSnapShot("D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\ScreenShot\\signin.png");
			
			System.out.println("ScreenShot taken");
		   }
		
		public void  close() {
			  driver.close();
			}

			
		}



   
      

	

