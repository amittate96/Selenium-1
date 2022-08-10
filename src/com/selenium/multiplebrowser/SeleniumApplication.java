package com.selenium.multiplebrowser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumApplication {

	public static void main(String[] args) throws InterruptedException {
		//setting driver property
		
		WebDriver driver=Driver.GetDriver("chrome");
		
		//maximize the window
		//driver.manage().window().maximize();
		
		//open the URL
		driver.get("https://google.com");

		//close the browser
	  // driver.close();

	}

}
