package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	//cucumber class

		@RunWith(Cucumber.class)
		
		@CucumberOptions
		(
				
				features = "src/test/resources/Features",
				

				plugin = {"pretty", "html:target/cucumber-html-report",
			                        "json:target/cucumber-json-report",
				                    "junit:target/cucumber-junit-report",
				                    "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
				
	    		tags = {"@tc_01_registration, @tc_02_signin, @tc_03_journals, @tc_04_resources"},
	    				glue = {"com.stepdefinition"},
		
		monochrome = true
		
		)
		
		
		public class loginrunner
		{
			 @AfterClass
		      public static void extendReport()
		    {
		        Reporter.loadXMLConfig("D:\\ACADEMIC.OUP.JOURNALS.PROJECT\\src\\test\\resources\\TestData\\extent-config.xml");
		        Reporter.setSystemInfo("user", System.getProperty("user.name"));
		        Reporter.setSystemInfo("os", "Windows");
		        Reporter.setTestRunnerOutput("Sample test runner output message");
		    }
			
		}

		

		
		
		