package com.Day1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EdgeFacebookRegistration {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Microsoft Edge Driver\\edgedriverV81\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Mike");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Jason");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("Test@abc.com");
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("Test@abc.com");
		driver.findElement(By.xpath("//input[@type=\"password\"and @name=\"reg_passwd__\"]")).sendKeys("Password@1234");
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		day.selectByValue("16");
		Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByVisibleText("Aug");
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		year.selectByIndex(50);
		driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"2\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"and @name=\"websubmit\"]")).click();
		/*
		 * try { driver.wait(300); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
