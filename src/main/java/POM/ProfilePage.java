package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Util1;


    	public class ProfilePage extends Util1{
		WebDriver driver;
		@FindBy(xpath=("//div[@class='_1ruvv2']"))	
	    WebElement profileFullName;


		public ProfilePage(WebDriver driver){
			
			PageFactory.initElements(driver, this);
			
			this.driver= driver;
		}

		public boolean getFullProfileName(){
			
			WebElement element = explicitWait(driver, profileFullName);
			
			String pName = (profileFullName.getText());
			if(pName.equals("Mayur Salunkhe"))
			{
				return true ;
			}
			return false;
	
}}
