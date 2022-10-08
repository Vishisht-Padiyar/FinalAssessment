package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestNG1.HrmMethodOverrloading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CucumberHRM {
	private static WebDriver driver = null;

	// TODO Auto-generated method stub
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// throw new io.cucumber.java.PendingException();
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		String actualResult, expectedResult = "PIM";
		actualResult = driver.findElement(By.xpath("//img[@alt = \"client brand banner\"]")).getText();
	}
	
	

	@Given("application is in home page")
	public void application_is_in_home_page() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
	}

	@When("user enteres details and applies for leave")
	public void user_enteres_details_and_applies_for_leave() {
		
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
	}
	
	@Then("Leave application is submitted")
	public void Leave_application_is_submitted() {
		
		//Submit button
		driver.findElement(By.xpath("//button[@type = \"submit\"]")).click();
	}
	
	
	
	@When("user enteres username")
	public void user_enteres_username() {
		//Search using username
			HrmMethodOverrloading.search("Cassidy.Hope");
						
	}
	
	
	@When("user enteres username and employeename")
	public void user_enteres_username_and_employeename() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);		
		//Search using username and employeename
		HrmMethodOverrloading.search( "Anthony.Nolan", "Anthony Nolan");
	}

}
