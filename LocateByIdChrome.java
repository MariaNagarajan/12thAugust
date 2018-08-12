package com.edureka.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateByIdChrome {


public static WebDriver driver =null;
	

	public static void main(String[] args) 
	{
		//Initialize Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		// Open URL		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		
		//LocateBy ID
		WebElement SearchBox = driver.findElement(By.id("homeSearchBar"));
		SearchBox.sendKeys("Selenium");
		SearchBox.isEnabled();
		
		//LocateBy XPath
		/*WebElement TextBoxXPath = driver.findElement(By.xpath("//*[@id=\"homeSearchBar\"]"));
		TextBoxXPath.sendKeys("Selenium");
		TextBoxXPath.isEnabled();*/
		
		
		WebDriverWait wait = new WebDriverWait(driver, 90);
        /*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"homeSearchBarIcon\"]")));*/
		
		WebElement SearchIcon= driver.findElement(By.xpath("//*[@id=\"homeSearchBarIcon\"]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"homeSearchBarIcon\"]")));
        SearchIcon.click();
        
        //LocateBy LinkText
		
				WebElement LoginLinkText = driver.findElement(By.linkText("Log In"));
				LoginLinkText.click();
				driver.navigate().to("https://www.edureka.co/");
				
		//LocateBy Partial Link Text
				
				WebElement LoginLinkPartialText = driver.findElement(By.partialLinkText("Lo"));
				LoginLinkPartialText.click();
				
		//LocateBy Tagname
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++)		
		{		
			System.out.println(list.get(i).getText());
			
		}	
		
			
		//Close Browser
		driver.close();

}}


