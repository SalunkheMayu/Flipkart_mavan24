package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {

	
	public static String getproperty(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("Configuration\\config.properties");
			Properties p = new Properties();
			p.load(file);
			
			String property = p.getProperty(key);
			
			return property;
					
			
	}
	
	public static WebElement explicitWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newElement = wait.until(ExpectedConditions.visibilityOf(element));
		return newElement;
	}
	
}
