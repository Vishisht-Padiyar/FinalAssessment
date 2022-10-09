package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Login details		
		
		//Updating user name and password field using
		
		
		// 1. xpath
		driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
		
		
		// 2. name
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
		
	
		
		//Login button
		driver.findElement(By.xpath("//button")).click();
		
		//field 1: Admin using Xpath
		driver.findElement(By.xpath("//a/span")).click();
		
		//field 2: Leave using link text
		driver.findElement(By.linkText("Leave")).click();
		
		//field 3: PIM by link text
		driver.findElement(By.linkText("PIM")).click();
		
		//field 4: Time by link text
		driver.findElement(By.linkText("Time")).click();

	}

}
