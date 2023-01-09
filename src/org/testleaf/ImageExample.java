package org.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		//WebElement firstImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		//firstImage.click();
		
		// to find whether the image is broken or not
		WebElement brokenImage = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		// naturalWidth = 0 (broken image)=> css properrty
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("broken");
		}else {
			System.out.println("not broken");
		}
	}
}
