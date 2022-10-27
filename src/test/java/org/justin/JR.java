package org.justin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JR {
	static WebDriver driver;
	static String url ="https://www.flipkart.com/";
	
	public static void main(String[] arg) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		Thread.sleep(3000);
			Actions a = new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		a.moveToElement(ele).build().perform();
		WebElement ele1= driver.findElement(By.xpath("//a[contains(text(),'Laptop Accessories')]"));
		a.moveToElement(ele1).build().perform();
		WebElement ele2= driver.findElement(By.xpath("//a[contains(text(),'Mouse')]"));
		
		a.moveToElement(ele2).build().perform();
		
		
		
	}
}
