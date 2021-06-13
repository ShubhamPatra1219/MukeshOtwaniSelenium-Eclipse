package com.Day2.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
		WebDriver driver = null;
	     
		@Test
	     public void test1()
	     {
	    	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium Practices\\Required Softwares\\Browser Drivers\\Chrome Drivers\\83.0.4103.39\\chromedriver.exe");
	    	 //WebDriver 
	    	 driver = new ChromeDriver();
	    	 driver.get("http://learn-automation.com");
	    	 String title = driver.getTitle();
	    	 boolean value = title.contains("Selenium");
	    	 System.out.println("Status is:"+value);
	     }
	    	
	    @Test
	    public void test2()
	    {
	    	driver.quit();
	    }
	    	 
	     
    
	}


