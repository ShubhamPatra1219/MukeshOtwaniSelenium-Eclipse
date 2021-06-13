package com.Day3.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookDropdown2 
{
	@Test
	public void selectDDValues() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
				
		//Action on Month Drop-down
		WebElement month_dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_dropdown);
		WebElement selected_value = month_dd.getFirstSelectedOption();
		//It should return month
		System.out.println("Before Selection selected value is: "+selected_value.getText());
		
		//It will select March
		month_dd.selectByIndex(3);
		Thread.sleep(3000);
		WebElement selected_value1 = month_dd.getFirstSelectedOption();
		System.out.println("After Selection selected value is: "+selected_value1.getText());

		

	}


}
