package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginPages {
   public  WebDriver driver;
   
   //initailliszing driver which is store in the baseclass vai test class
   public loginPages(WebDriver driver) {
	   this.driver =  driver ;
   }
      
      public void enterUsername( String uname) {
    	  driver.findElement(By.id("username")).sendKeys(uname);
      }
      
      public void enterpassword(String pass) {
    	  driver.findElement(By.id("password")).sendKeys(pass);
      }
      
      public void loginbut() {
    	  driver.findElement(By.id("submit")).click();
      }
}
