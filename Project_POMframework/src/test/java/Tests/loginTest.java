package Tests;

import org.testng.annotations.Test;

import bases.loginbase;
import pages.loginPages;

public class loginTest  extends loginbase{
	
	loginPages pages ;
	@Test
	public void verifylogin() {
		pages = new loginPages(driver);
		
		pages.enterUsername("lavkesh");
		
		pages.enterpassword("lavkesh123");
		
		pages.loginbut();
		
	}

}
