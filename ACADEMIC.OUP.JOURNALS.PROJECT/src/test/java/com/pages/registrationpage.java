package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class registrationpage
{
	
//	Logger LOG = Logger.getLogger(signinpage.class.getName());
	
    WebDriver driver;
	
 //   By click_Register=By.className("register");
    
    
    @FindBy(how = How.CLASS_NAME, using = "register")
    
    WebElement click_Register;
    
    @FindBy(how = How.XPATH, using = "//input[@id='EmailAddress']")
    
    WebElement click_email;
    
    @FindBy(how = How.XPATH, using ="//input[@id='Password']")
    
	WebElement click_password;
	
    @FindBy(how = How.XPATH, using ="//input[@id='ConfirmPassword']")
    
	WebElement click_confirmpassword;
	

    @FindBy(how = How.ID, using ="registerBtn")
    		
    WebElement click_registerbtn;

    @FindBy(how = How.XPATH, using = "//a[@class='logged-in-link signout-button']")
    
    WebElement click_signoutbtn;

    
    
	public registrationpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void registerAccount()
	{
		click_Register.click();
	}
	public void credentials(String usrname,String password) throws InterruptedException
	{
		
		click_email.sendKeys(usrname);
		click_password.sendKeys(password);
		click_confirmpassword.sendKeys(password);
		
		Thread.sleep(5000);
	}
	public void Registerbutton() throws InterruptedException
	{
		click_registerbtn.click();
		Thread.sleep(5000);
	}
	
	
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='header-account-info-user-fullname']")).click();
		Thread.sleep(2000);
		WebElement signout = driver.findElement(By.xpath("//a[@class='logged-in-link signout-button']"));
		signout.click();
	}
	
	/*public void Quit()
	{
		driver.close();
	}*/
	
	
}




	
	