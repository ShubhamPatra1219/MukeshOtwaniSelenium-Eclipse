package com.Day2.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class LocatorsExample2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//6-Link Text
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//7-Partial Link Text
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//8 - TagName
		//driver.findElement(By.tagName("img"));
		System.out.println(driver.findElements(By.tagName("img")).size());
		
	}

}
