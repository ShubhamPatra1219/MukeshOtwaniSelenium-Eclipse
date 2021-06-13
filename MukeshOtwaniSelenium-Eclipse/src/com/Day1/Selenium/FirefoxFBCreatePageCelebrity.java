package com.Day1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxFBCreatePageCelebrity {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Gekodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		driver.navigate().back();
        driver.close();

	}

}
