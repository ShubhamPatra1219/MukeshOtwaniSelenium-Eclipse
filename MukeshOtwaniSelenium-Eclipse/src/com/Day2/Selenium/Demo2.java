package com.Day2.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Helper.typeIntoInputBox(driver, "txtUsername", "admin");
	}

}
