package com.Day1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEFBCreatePageCelebrity {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Internet Explorer Driver\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		driver.navigate().back();
        driver.close();
	}

}
