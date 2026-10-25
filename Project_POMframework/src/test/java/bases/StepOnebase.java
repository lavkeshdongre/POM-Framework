package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class StepOnebase {
	public WebDriver driver;
	@BeforeMethod
	public void launchbrowser() {
		
		driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		
		
	}

}
