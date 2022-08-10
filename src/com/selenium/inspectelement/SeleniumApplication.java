package com.selenium.inspectelement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumApplication {

	public static void main(String[] args) throws InterruptedException {
		//setting driver property
		
		WebDriver driver=Driver.GetDriver("chrome");
		
		//open the URL
		driver.get("https://learnpr0grammin9.w3spaces.com");
		
		//send full name
		driver.findElement(By.id("Field1")).sendKeys("Learn Pr0grammin9");
		
		//send email
		driver.findElement(By.id("Field3")).sendKeys("LearnPr0grammin9@gmail.com");
	
		//send message
		driver.findElement(By.id("Field4")).sendKeys("Welcome to my page Learn Pr0grammin9");
		
		//close the browser
		//driver.close();

	}

}
