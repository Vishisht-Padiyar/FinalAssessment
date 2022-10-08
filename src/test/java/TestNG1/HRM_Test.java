package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HRM_Test {
	public WebDriver driver = null;

	@Test(priority = 1)
	public void HRMlogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open Website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		// Login details
		driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		this.driver = driver;
		

	}

	@Test(priority = 2)
	public void HRM_Leave() {
		
		
		driver.findElement(By.xpath("//li[3]/a/span")).click();

		// Apply button
		driver.findElement(By.xpath("//header/div[2]/nav/ul/li")).click();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		// Leave type
		driver.findElement(By.xpath("//div[@class = \"oxd-select-text-input\"]")).click();

		//
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();

		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-09-27");

		driver.findElement(By.xpath("//div/textarea")).sendKeys("Work from home application");

		driver.findElement(By.xpath("//button[@type = \"submit\"]")).click();
	}
	
	@Test(priority = 2)
	public void MethodOverloading() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		//Search using username
		HrmMethodOverrloading.search("Cassidy.Hope");
				
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);		
		//Search using username and employeename
		HrmMethodOverrloading.search( "Anthony.Nolan", "Anthony Nolan");
		
	}
	
}
