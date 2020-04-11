package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class resourcespage 
{

	WebDriver driver;
	
//	Logger LOG = Logger.getLogger(resourcespage.class.getName());
	
	
	 @FindBy(how = How.XPATH, using = "//div[@class='navbar']//li[@id='site-menu-item-1481330']/a[@href='/journals/#']")
	 
	 WebElement resources;
	 
	 @FindBy(how = How.XPATH, using = "//div[@class='navbar']//a[@href='https://academic.oup.com/journals/pages/authors']")
	 
	 WebElement authors;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"site-menu-item-1481345\"]/a")
	 
	 WebElement librarians;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"site-menu-item-1481346\"]/a")
	 
	 WebElement societies;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"site-menu-item-1481347\"]/a")
	 
	 WebElement sponsors_advertisers ;		 
			 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"site-menu-item-1481348\"]/a")
	 
	 WebElement press;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"site-menu-item-1481349\"]/a")
	 
	 WebElement agents;
	
	public resourcespage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void resources_resourcesmenu() throws Exception 
	{
	    resources.click();
//	    LOG.info("clicked on resourcesmenu");
	   // Thread.sleep(3000);
	}
	
	
	public void authors() throws Exception 
	{
		authors.click();
//		LOG.info("clicked on authors");
		//Thread.sleep(3000);
	}
	
	
	public void librarians() throws Exception 
	{
		librarians.click();
//		LOG.info("Librarians is clicked");
//		Thread.sleep(3000);
		}
	
	
	public void societies() throws Exception 
	{
	societies.click();
//	LOG.info("Societies is clicked");
//	Thread.sleep(3000);
	}
	
	
	public void sponsors_advertisers() throws Exception 
	{
	sponsors_advertisers.click();
//	LOG.info("sponsers_advertisers is clicked");
//	Thread.sleep(3000);
	}
	
	
	public void press() throws Exception 
	{
	press.click();
//	LOG.info("press is clicked");
//	Thread.sleep(3000);
	}
	
	
	public void agents() 
	{
	agents.click();
//	LOG.info("agents is clicked");
	
	}

}

