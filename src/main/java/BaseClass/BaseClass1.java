package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.Util1;

public class BaseClass1 {
	
     static WebDriver driver = null;	
	
     
     public static WebDriver getDriver(String browser) throws IOException
     {
    	 System.out.println(driver);
    	 
    	 if(driver== null)
    		 
    	 {
    		 System.out.println("Mayur ");
    		 if (browser==("chrome"))
    			 
    		 {
    			 System.setProperty("Webdriver.chrome.driver", "src\\main\\resources\\Browser\\chromedriver.exe");
    	
    		     driver=new ChromeDriver();}
    		 else if(browser.equals("firefox"))
    		 {
    			 System.setProperty("Webdriver.gecko.driver","src\\main\\resources\\Browser\\geckodriver.exe");
    			 driver=new FirefoxDriver();
    		 }
    		 driver.get(Util1.getproperty("url"));
    			 driver.manage().window().maximize();
    			 
    			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    			 
    			 return driver;
    			 
    	 }
    	 
    	 else
    	 {
    		 System.out.println("in else");
    		 return driver;
    	 }}}
