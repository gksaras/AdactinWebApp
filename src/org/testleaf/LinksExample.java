package org.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		WebElement homePage = driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();
		
		
		WebElement hyperLinkIcon = driver.findElement(By.xpath("//h5[text()='HyperLink']"));
		hyperLinkIcon.click();
		
		WebElement findWhere = driver.findElement(By.partialLinkText("Find where"));
		findWhere.click();
		
	}
}
