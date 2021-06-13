package com.Day2.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();		
		
		//1-Locator - Id
		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.sendKeys("Admin");
		
		//2-Name Locator
		By pass = By.name("txtPassword");
		driver.findElement(pass).sendKeys("admin123");
		
		//3-ClassName will not be unique always
		//driver.findElement(By.className("textInputContainer")).click();
		
		//4-Xpath
		//driver.findElement(By.xpath("//*[@id=\"frmLogin\"]")).click();
		
		//5-CSS
		driver.findElement(By.cssSelector("input#btnLogin")).click();

	}

}
