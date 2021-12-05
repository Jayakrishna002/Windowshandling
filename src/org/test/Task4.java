package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
   
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Task\\SeleniumXpath\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement right = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		
		Actions click = new Actions(driver);
		
		click.contextClick(right).perform();
		
		Robot test = new Robot();
		
		test.keyPress(KeyEvent.VK_DOWN);
		test.keyRelease(KeyEvent.VK_DOWN);
		
		test.keyPress(KeyEvent.VK_ENTER);
		test.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> jk =driver.getWindowHandles();
		
		int count =0;
		for(String each:jk) {
			if (count==1) {
				driver.switchTo().window(each);
			}
			count++;
		}
		Thread.sleep(count);
    	WebElement add = driver.findElement(By.xpath("(//h5[contains(text(),'Greens Technologys In ')])[1]/.."));
	    String text = add.getText();
	    System.out.println(text);
		 
		
}

}
