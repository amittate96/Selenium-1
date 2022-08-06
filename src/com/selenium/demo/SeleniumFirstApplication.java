package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//setting driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Tutorials\\Selenium #1\\chromedriver_win32\\chromedriver.exe");
		
		//creating driver instance
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//open the URL
		driver.get("https://www.google.com/");
		
		//manual wait for 5 second
		Thread.sleep(5000);
		
		//close the driver
		driver.close();
		
	}

}
