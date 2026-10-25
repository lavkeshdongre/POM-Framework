package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPages {
	public WebDriver driver;
	
	public BlogPages(WebDriver driver) {
		this.driver= driver;
	}
	
	public void radio() {
		driver.findElement(By.id("male")).click();
	}
	public void checkbox() {
		List<WebElement> Checkbox= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(int i = 0 ;i<5;i++) {
			Checkbox.get(i).click();
		}
		
		
	}

}
