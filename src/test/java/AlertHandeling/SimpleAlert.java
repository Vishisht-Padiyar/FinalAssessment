package AlertHandeling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SimpleAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Vishisht\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		  
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		  
		  
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert HdfcAlert=driver.switchTo().alert();
		String actualResult = HdfcAlert.getText();
		HdfcAlert.accept();
		driver.switchTo().defaultContent();
		System.out.println(actualResult);
		String expectedResult= "Customer ID cannot be left blank." ;
		
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualResult, expectedResult);
		System.out.println("After assertion");
	}

}
