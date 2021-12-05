package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Task\\SeleniumXpath\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");//
		
		  driver.findElement(By.name("headerSearch")).sendKeys("Celling fan",Keys.ENTER);
		  
		  WebElement click = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
		  
		  Actions rite = new Actions(driver);
		  rite.contextClick(click).perform();
		  
		  Robot js = new Robot();
			js.keyPress(KeyEvent.VK_DOWN);
			js.keyRelease(KeyEvent.VK_DOWN);
			
			js.keyPress(KeyEvent.VK_ENTER);
			js.keyRelease(KeyEvent.VK_ENTER);
			 Set<String> allid = driver.getWindowHandles();
				
				int count = 0;
				for (String each:allid) {
					if (count==1) {
						driver.switchTo().window(each);
					}
					count++;
				}
}
}
