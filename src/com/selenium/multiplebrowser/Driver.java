package com.selenium.multiplebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	static WebDriver driver = null;

	public static WebDriver getDriver(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium Tutorials\\Selenium #3\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium Tutorials\\Selenium #3\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
		
			System.setProperty("webdriver.edge.driver",
					"D:\\Selenium Tutorials\\Selenium #3\\edgedriver_win64\\msedgedriver.exe");
		
			driver = new EdgeDriver();

		}
		return driver;
	}
}
