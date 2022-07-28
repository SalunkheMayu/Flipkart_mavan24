package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass1;
import POM.HomePage;
import POM.LoginPage;

public class VeryfyUserCanLogIn {

	static WebDriver driver;
	 LoginPage lp;
	 
	 HomePage hp;
	 
	@BeforeClass
	
	public void beforeClass() throws IOException
	{
		driver = BaseClass1.getDriver("chrome");
	}
	
	@BeforeMethod
	
	
	public void beforeMethod()
	{
		  lp = new LoginPage(driver);
		  hp = new HomePage(driver);
	}
	
	@Test
	public void veryfyUserCanLogIn()throws IOException, InterruptedException
	{
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLoginBtn();
		hp.getProfileName();
		
		
		Assert.assertTrue(hp.getProfileName());
	}
	
	@AfterMethod

	public void afterMethod()
	{
		
	}
	
	
	@AfterClass

	public void afterclass()
	{
		
	}
	
	
	
	
	
	
	
	
	
}
