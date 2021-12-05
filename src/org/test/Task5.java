package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task5 {
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
		Thread.sleep(3000);
		 driver.findElement(By.name("name")).sendKeys("Jaya Krishna");
		 driver.findElement(By.name("email")).sendKeys("123@gmail.com");
		 driver.findElement(By.name("phone")).sendKeys("1234567890");
		 WebElement cour = driver.findElement(By.name("courses"));
		 Select choose = new Select(cour);
		 choose.selectByIndex(6);
		 WebElement branch = driver.findElement(By.name("branch"));
		 Select bran = new Select(branch);
		 bran.selectByIndex(3);
		 WebElement time = driver.findElement(By.name("time"));
		 Select tim = new Select(time);
		 tim.selectByIndex(3);
		 driver.findElement(By.name("comments")).sendKeys("Awesome");
		 	 
		
	}

}
	

	

