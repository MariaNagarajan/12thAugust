package com.edureka.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElementsUsingAllLocators {

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
		WebElement Email = driver.findElement(By.id("email"));
		
		Email.sendKeys("mari.balraj@gmail.com");
		
		//LocateBy CSSSelector
        WebElement Pass=driver.findElement(By.cssSelector("input#pass"));
        Pass.sendKeys("***");
		
		
		//LocateBy Name
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Mariya");
		
		//LocateBy XPath
		WebElement SurName=driver.findElement(By.xpath("//*[@id=\"u_0_l\"]"));		
		SurName.sendKeys("Balraj");
		
		//LocateBy LinkText
		WebElement LinkText=driver.findElement(By.linkText("Why do I need to provide my date of birth?"));
		LinkText.click();
		
		//LocateBy PartialLinkText
		WebElement PartialLinkText=driver.findElement(By.partialLinkText("Why do I need to provide"));
		PartialLinkText.click();
		
		//Close Browser
		driver.close();
		
		

}
	
}