package com.edureka.basics;

import org.openqa.selenium.By;

/*import java.util.List;*/

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.support.ui.ExpectedConditions;*/
/*import org.openqa.selenium.support.ui.WebDriverWait;*/

public class FindWebElementsByAllLocators {

public static WebDriver driver =null;
	

	public static void main(String[] args) 
	{
		//Initialize Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		// Open URL		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//LocateBy Id
		//WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		/*WebElement Email = driver.findElement(By.id("email"));
		
		Email.sendKeys("mari.balraj@gmail.com");
		
		//LocateBy CSSSelector
		WebElement Pass = driver.findElement(By.cssSelector("input#pass"));		
		
		String encodePassword="cml5YUAyMDE1";
			
		Pass.sendKeys(decodeStr(encodePassword));
		
		WebElement Login=driver.findElement(By.cssSelector("input#u_0_8"));
		Login.click();*/
		
		//LocateBy Name
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Mariya");
		
		//LocateBy ClassName
		//LocateBy XPath
		WebElement SurName=driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));		
		SurName.sendKeys("Balraj");
		
		//LocateBy LinkText
		WebElement LinkText=driver.findElement(By.linkText("Why do I need to provide my date of birth?"));
		LinkText.click();
		
		//LocateBy PartialLinkText
		WebElement PartialLinkText=driver.findElement(By.partialLinkText("Why do I need to provide"));
		PartialLinkText.click();
		
		//driver.close();
		//Close Browser
		

}
	/*public static String decodeStr(String encodeStr)
	{
		byte[] decode=Base64.decodeBase64(encodeStr);
		return new String(decode);
	}*/
}