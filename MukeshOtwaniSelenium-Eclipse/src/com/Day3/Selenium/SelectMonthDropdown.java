package com.Day3.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMonthDropdown 

{
	@Test
	public void selectDDValues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		
		//It will select March
		month_dd.selectByIndex(3);
		Thread.sleep(3000);
		
		//It will select October
		month_dd.selectByValue("10");
		Thread.sleep(3000);
		
		//It will select August
		month_dd.selectByVisibleText("Aug");
		Thread.sleep(3000);
	}


}
