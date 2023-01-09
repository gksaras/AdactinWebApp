package org.testleaf;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.click();
		//setDate.sendKeys("01/12/2022");
		
		WebElement btnNext = driver.findElement(By.xpath("//a[@title='Next']"));
		btnNext.click();
		
		WebElement selectDate = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		selectDate.click();
		
	}
}
