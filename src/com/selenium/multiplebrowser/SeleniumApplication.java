package com.selenium.multiplebrowser;

import org.openqa.selenium.WebDriver;

public class SeleniumApplication {

	public static void main(String[] args) throws InterruptedException {
		//creating driver instance
		WebDriver driver=Driver.getDriver("edge");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//open the URL
		driver.get("https://www.google.com/");
	
		//close the driver
		driver.close();

	}

}
