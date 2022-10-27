package org.justin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sa {
	static WebDriver driver;
	static String url ="https://www.flipkart.com/";
	
	public static void main(String[] arg) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oppo mobiles",Keys.ENTER);
		
		File f= new File("C:\\Users\\ABI\\eclipse-workspace\\Maruthi\\src\\test\\java\\org\\justin\\ExcelWrite.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		Workbook w= new XSSFWorkbook();
		Sheet s= w.createSheet("sheet1");
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 //System.out.println(price.size());   
		for (int i = 0;  i < name.size() ; i++) {
			Row row2 = s.createRow(i);
			Cell cell = row2.createCell(0);
			WebElement names = name.get(i);
			String text = names.getText();
            cell.setCellValue(text);
           
		
		// w.write(f1);
        
			for(int j=i;j<price.size();j++) {
				
               // Row row3 = s.createRow(j);
				Cell c1 = row2.createCell(5);
                WebElement prices = price.get(j);
				String text2 = prices.getText();

				c1.setCellValue(text2);
		
		}
		
			w.write(f1);
		
		
	   
	
		
	}
}}
