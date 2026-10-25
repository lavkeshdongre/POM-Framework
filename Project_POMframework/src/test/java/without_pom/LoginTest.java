package without_pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
	}
	
	@Test
	public void credential() {
		driver.findElement(By.id("username")).sendKeys("lavkesh");
		driver.findElement(By.id("password")).sendKeys("lavkesh@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
