package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.signinpage;

public class signinpage {
	
//	Logger LOG = Logger.getLogger(signinpage.class.getName());
	
	WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//li[@class='oup-header-menu-item desktop']/*[@id='header-account-info-user-fullname']/i")
	
	WebElement signin;		
			
			
	@FindBy(how = How.ID, using = "user_LoginFormPopup")
			
	WebElement username;
	
	
	@FindBy(how = How.ID, using = "pass_LoginFormPopup")
	
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@class='signin-button button']")
	
	WebElement signinbutton;
	
	
	//opens browser
	
	public signinpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Click Sign In 
	
	public void signin_inspect()
	{
		signin.click();
//		LOG.info("Signin is clicked");
	}
	
	//enter Username
	
	public void signin_username(String userid)
	{
		username.sendKeys(userid);
//		LOG.info("entered Name in the username field");
	}
	
	//enter password
	
	public void signin_password(String pass)
	{
		password.sendKeys(pass);
//		LOG.info("entered password in the username field");
	}
	
	//click sign in button
	
	public void signinbuttoninspect()
	{
		signinbutton.click();
		
//		LOG.info("clicked signin button");
	}

	
	
	public void signinbutton()
	{
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(signinbutton));
		
	    signinbutton.click();
	    
//	    LOG.info("Click the signin button");
	    }
	
	
	/*  public void  close() {
		  driver.close();
		}*/
	}




