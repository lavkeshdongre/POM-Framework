package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steptwopages {
	WebDriver driver;
	
	public Steptwopages(WebDriver driver) {
		this.driver= driver;
	}
	public void Enterusername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
		
	}
	public void Enterpassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	public void clickbtn() {
		driver.findElement(By.id("submit")).click();
	}

}
