package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Util1;

public class LoginPage extends Util1{

	
	WebDriver driver;
	
	//WebElements
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	
	private WebElement emailId;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordField;
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginBtn;
	
	
	
	
	//constructor
	
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
		this.driver= driver;
	}
	//public methods
	public void enterEmail() throws IOException
	{
		emailId.sendKeys( getproperty("username"));
	}
	public void enterPassword() throws IOException
	
	{
		passwordField.sendKeys( getproperty("password"));
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
}
