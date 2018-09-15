package com.selenium.PackageCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium 2.53 Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		/*
		System.setProperty("webdriver.gecko.driver","D:\\Selenium 3.10 Files\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/
		
		driver.get("http://leaftaps.com/opentaps/");

		driver.findElement(By.xpath("//input[contains(@name,'USERNAME')]")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[contains(@name,'PASSWORD')]")).sendKeys("crmsfa");

		//driver.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')] ")).click();
		
		driver.findElement(By.xpath(".//*[@id='login']/p[3]/input")).click();
		
			
		Thread.sleep(2000);
		
		driver.quit();

	}

}
