package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class journalspage {

	WebDriver driver;
	
//	Logger LOG = Logger.getLogger(journalspage.class.getName());
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='navbar']//a[@href='https://academic.oup.com/journals/pages/journals_a_to_z']")
	WebElement Journal;
	
	@FindBy(how = How.XPATH, using = "//a[@href='#M']")
	WebElement m;
	
	@FindBy(how = How.XPATH, using ="//a[@href='https://academic.oup.com/jmicro']")
	WebElement microscopy;
	
//	By morecontent = By.xpath("//*[@id=\"site-menu-item-1447804\"]/a");
//	By advancearticles = By.xpath("//*[@id=\"site-menu-item-1447808\"]/a");
	
	public journalspage(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
//	    click performance
	
		public void leavemenu() throws Exception 
		{
			Journal.click();
			
		  //  Thread.sleep(3000);
			
			m.click();
			// Thread.sleep(2000);
	    	
	    	 
			microscopy.click();
			// Thread.sleep(2000);
			
			
			
//   		LOG.info("Journals A to Z and Microscopy is clicked");
			
//			Thread.sleep(3000);
			
//			driver.findElement(morecontent).click();
//			driver.findElement(advancearticles).click();
//			LOG.info("More content and Advance articles is clicked");
			
		}
	
}
