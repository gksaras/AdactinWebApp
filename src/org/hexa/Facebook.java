package org.hexa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
	/*	WebElement color = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div/img"));
		String cssValue = color.getCssValue("color");
		System.out.println(cssValue);
		
		WebElement head = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text = head.getText();
		System.out.println(text); 	*/
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("jacksparrow@gmail.com");
		WebElement txtPassword = driver.findElement(By.name("pass"));
		txtPassword.sendKeys("pirates@123");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
		
		//driver.quit();
	}
}
