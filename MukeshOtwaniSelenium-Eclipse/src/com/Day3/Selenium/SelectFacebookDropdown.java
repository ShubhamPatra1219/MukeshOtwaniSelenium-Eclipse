package com.Day3.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropdown 
{
	@Test
	public void selectDDValues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Action on Day Drop-down
		WebElement day_dropdown = driver.findElement(By.id("day"));
		Select day_dd = new Select(day_dropdown);
		//It will select 09
		day_dd.selectByIndex(9);
		Thread.sleep(3000);
		//It will select 25
		day_dd.selectByValue("25");
		Thread.sleep(3000);		
		//It will select 30
		day_dd.selectByVisibleText("30");
		Thread.sleep(3000);
		
		//Action on Month Drop-down
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
		
		//Action on Year Drop-down
		WebElement year_dropdown = driver.findElement(By.id("year"));
		Select year_dd = new Select(year_dropdown);
		//It will select 2016
		year_dd.selectByIndex(5);
		Thread.sleep(3000);
		//It will select 1987
		year_dd.selectByValue("1987");
		Thread.sleep(3000);		
		//It will select 2005
		year_dd.selectByVisibleText("2005");
		Thread.sleep(3000);
	}


}
