package org.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
   
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Task\\SeleniumXpath\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.id("heading304")).click();
		
		driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[26]")).click();
		
		Set<String> jk = driver.getWindowHandles();
		
		int count =0;
		for (String each:jk) {
		  if (count==0) {
			  driver.switchTo().window(each);
		  }
		  count++;
		}
	
	  
}
}
