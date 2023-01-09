package org.task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\salin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement userName = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','gknhotel')", userName);
		
		WebElement password = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','GreensWork')", password);
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		
		File src1 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src1);
		
		File dest1=new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\AdactinHotelApp\\AdactinLogin.png");
		FileUtils.copyFile(src1, dest1);
		
		Thread.sleep(3000);	
		
		Actions act=new Actions(driver);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		act.moveToElement(btnLogin).click(btnLogin).perform();
		
		WebElement location = driver.findElement(By.name("location"));
		Select l = new Select(location);
		l.selectByVisibleText("New York");
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select h = new Select(hotel);
		h.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.name("room_type"));
		Select r = new Select(roomType);
		r.selectByVisibleText("Standard");
		
		WebElement numberOfRooms = driver.findElement(By.name("room_nos"));
		Select n = new Select(numberOfRooms);
		n.selectByVisibleText("1 - One");
		
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys("11/11/2022");
		
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys("12/11/2022");
		
		WebElement adultsPerRoom = driver.findElement(By.name("adult_room"));
		Select a = new Select(adultsPerRoom);
		a.selectByVisibleText("1 - One");
		
		WebElement childPerRoom = driver.findElement(By.name("child_room"));
		Select c = new Select(childPerRoom);
		c.selectByVisibleText("0 - None");
		
		Thread.sleep(3000);
		
		File src2 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src2);
		
		File dest2=new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\AdactinHotelApp\\AdactinSearchHotel.png");
		FileUtils.copyFile(src2, dest2);
		
		Thread.sleep(3000);	
		
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		act.moveToElement(btnSearch).click(btnSearch).perform();
		
		WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
		radioButton.click();
		
    	Thread.sleep(3000);
	
		File src3 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src3);
		
		File dest3=new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\AdactinHotelApp\\AdactinSelectHotel.png");
		FileUtils.copyFile(src3, dest3);
		
		Thread.sleep(3000);			
		
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		
		WebElement scrollDown = driver.findElement(By.id("book_now"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("Jack");
		
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys("Sparrow");
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("Pirates Street,Caribbean Sea");
		
		WebElement creditCardNumber = driver.findElement(By.id("cc_num"));
		creditCardNumber.sendKeys("3456123409874783");
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select ct = new Select(cardType);
		ct.selectByVisibleText("Master Card");
		
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select m = new Select(expMonth);
		m.selectByVisibleText("July");
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(expYear);
		y.selectByVisibleText("2022");
		
		WebElement ccvNumber = driver.findElement(By.id("cc_cvv"));
		ccvNumber.sendKeys("234");
		
		Thread.sleep(3000);
		
		File src4 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src4);

		File dest4 = new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\AdactinHotelApp\\AdactinBookHotel.png");
		FileUtils.copyFile(src4, dest4);

		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
		
		Thread.sleep(10000);
		
		File src5 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src5);

		File dest5 = new File("C:\\Users\\salin\\OneDrive\\Pictures\\Saved Pictures\\AdactinHotelApp\\AdactinBookingConfirmation.png");
		FileUtils.copyFile(src5, dest5);

		WebElement text1 = driver.findElement(By.id("hotel_name"));
		String Hotel_Name = text1.getAttribute("value");
		System.out.println("Hotel_Name : "+Hotel_Name);
		
		WebElement text2 = driver.findElement(By.id("location"));
		String Location = text2.getAttribute("value");
		System.out.println("Location : "+Location);
		
		WebElement text3 = driver.findElement(By.id("room_type"));
		String Room_Type = text3.getAttribute("value");
		System.out.println("Room_Type : "+Room_Type);
		
		WebElement text4 = driver.findElement(By.id("arrival_date"));
		String Arrival_Date = text4.getAttribute("value");
		System.out.println("Arrival_Date : "+Arrival_Date);
		
		WebElement text5 = driver.findElement(By.id("departure_text"));
		String Departure_Date = text5.getAttribute("value");
		System.out.println("Departure_Date : "+Departure_Date);
		
		WebElement text6 = driver.findElement(By.id("total_rooms"));
		String Total_Rooms = text6.getAttribute("value");
		System.out.println("Total_Rooms : "+Total_Rooms);
		
		WebElement text7 = driver.findElement(By.id("adults_room"));
		String Adults_Per_Room = text7.getAttribute("value");
		System.out.println("Adults_Per_Room : "+Adults_Per_Room);
		
		WebElement text8 = driver.findElement(By.id("children_room"));
		String Children_Per_Room = text8.getAttribute("value");
		System.out.println("Children_Per_Room : "+Children_Per_Room);
		
		WebElement text9 = driver.findElement(By.id("price_night"));
		String Price_Per_Night = text9.getAttribute("value");
		System.out.println("Price_Per_Night : "+Price_Per_Night);
		
		WebElement text10 = driver.findElement(By.id("total_price"));
		String Total_Price = text10.getAttribute("value");
		System.out.println("Total_Price : "+Total_Price);
		
		WebElement text11 = driver.findElement(By.id("gst"));
		String GST = text11.getAttribute("value");
		System.out.println("GST : "+GST);
		
		WebElement text12 = driver.findElement(By.id("final_price"));
		String Final_Price = text12.getAttribute("value");
		System.out.println("Final_Price : "+Final_Price);
		
		WebElement text13 = driver.findElement(By.id("first_name"));
		String First_Name = text13.getAttribute("value");
		System.out.println("First_Name : "+First_Name);
		
		WebElement text14 = driver.findElement(By.id("last_name"));
		String Last_Name = text14.getAttribute("value");
		System.out.println("Last_Name : "+Last_Name);
		
		WebElement text15 = driver.findElement(By.id("address"));
		String Address = text15.getAttribute("value");
		System.out.println("Address : "+Address);
		
		WebElement text16 = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
		String Order_No = text16.getAttribute("value");
		System.out.println("Order_No : "+Order_No);

	}
	
}
