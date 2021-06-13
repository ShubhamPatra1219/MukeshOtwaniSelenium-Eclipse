package com.Day2.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {
	
	static String value;
	static WebElement local_radio;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio'][@name='sex']//following::label"));
		
		for (int i=0;i<radio.size();i++)
		{
			local_radio = radio.get(i);
			//String value = local_radio.getAttribute("label");
			value = local_radio.getText();
			System.out.println("Values from radio buttons are ======>>"+value);
		}
		
		if(value.equalsIgnoreCase("Custom"))
		{
			local_radio.click();
		}
		//driver.close();

	}

}
