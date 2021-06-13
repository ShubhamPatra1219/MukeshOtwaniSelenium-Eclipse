package com.Day1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeFBCreatePageCelebrity {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Microsoft Edge Driver\\edgedriverV81\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		driver.navigate().back();
        driver.close();
	}

}
