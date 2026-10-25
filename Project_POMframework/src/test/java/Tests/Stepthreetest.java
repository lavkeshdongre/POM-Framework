package Tests;

import org.openqa.selenium.WebDriver;

import bases.StepOnebase;
import pages.Steptwopages;

public class Stepthreetest extends StepOnebase{
	
	Steptwopages page1;
	
	@org.testng.annotations.Test
	void Test() {
		
		page1 = new Steptwopages(driver);
		page1.Enterusername("lavkesh");\
		page1.Enterpassword("dongre");
		page1.clickbtn();
		
	}
	
	

}
