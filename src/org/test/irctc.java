package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Task\\SeleniumXpath\\Driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.irctc.co.in/nget/train-search");
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}

}
