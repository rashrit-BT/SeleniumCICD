package com.axis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// test
public class firstSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.axis360qa.baker-taylor.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		//driver.quit();

	}

}
