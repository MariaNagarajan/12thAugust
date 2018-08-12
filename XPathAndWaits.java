package com.edureka.basics;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathAndWaits {
public static WebDriver driver =null;
public static void main(String[] args) 
{
	//Launches Chrome Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	//Sets the page load timeout after launching the Chrome browser
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	// Opens Edureka URL
	driver.get("https://www.edureka.co/");
	
	//Maximizes the browser window
	driver.manage().window().maximize();
		
	//Sets Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// Sets timeout for executing any asynchronous script
	driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	
	//Searches for Selenium course and then pressing enter
	WebElement SearchBox = driver.findElement(By.id("homeSearchBar"));
	SearchBox.sendKeys("Selenium");
	SearchBox.sendKeys(Keys.ENTER);
	
	//Adds explicit wait for page to navigate to Selenium course and clicks on it
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='coursetitle course-display-title-535']")));	
	
	WebElement Course=driver.findElement(By.xpath("//h3[@class='coursetitle course-display-title-535']"));
	Course.click();
	
	//Waits for the whole Selenium course page to be loaded and gets the title of the page
	driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);	
	String appTitle = driver.getTitle();
	wait.until(ExpectedConditions.titleIs(appTitle));	
	
	//Validates the page title
	boolean result = appTitle.equals("Selenium 3.0 WebDriver Online Training | Selenium Certification Course | Edureka");

	System.out.println("Result - " + result);
	
	//Navigates back to the previous page
	driver.navigate().back();
	
	//Waits for the whole page to be loaded and selects "All courses" from the menu option
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
	WebElement AllCourse=driver.findElement(By.xpath("//*[@id=\"load_allcourses\"]/a"));
	
	AllCourse.click();
	
	//Adds fluent script to wait for whole page to be loaded under "All course"
	FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
	wait1.pollingEvery(200, TimeUnit.MILLISECONDS);
	wait1.withTimeout(1, TimeUnit.MINUTES);
	wait1.ignoring(NoSuchElementException.class);										

	WebElement a = wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"load_allcourses\"]/a"))));
	a.click();
	
	//Closes Browser
	driver.close();

}}


