package com.Day2.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helper 
{
	public static void typeIntoInputBox(WebDriver driver,String id,String text)
	{
		System.out.println("Trying to enter for element whose id is"+id);
		driver.findElement(By.xpath(id)).sendKeys(text);
	}

}
