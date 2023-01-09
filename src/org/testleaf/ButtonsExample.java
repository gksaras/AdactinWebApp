package org.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		WebElement btnHome = driver.findElement(By.id("home"));
		btnHome.click();
		
		WebElement buttonIcon = driver.findElement(By.xpath("//h5[text()='Button']"));
		buttonIcon.click();
		
		// to get xy position of the button
		WebElement getPosition = driver.findElement(By.id("position"));
		Point location = getPosition.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X="+x+"Y="+y);
		
		// to find the color of the button
		WebElement btnColor = driver.findElement(By.id("color"));
		String cssValue = btnColor.getCssValue("background-color");
		System.out.println(cssValue);
		
		// to find the size of the button
		WebElement btnSize = driver.findElement(By.id("size"));
		int height = btnSize.getSize().getHeight();
		int width = btnSize.getSize().getWidth();
		System.out.println("Height="+height+"Width="+width);
		
	}
}
