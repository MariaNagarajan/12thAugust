package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByNameChrome {

public static WebDriver driver =null;
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		WebElement SearchIcon = driver.findElement(By.id("homeSearchBarIcon"));
				SearchIcon.click();
				WebElement DataScience = driver.findElement(By.className("button ga_master_call course-display-title-584"));
				DataScience.click();
	}
}