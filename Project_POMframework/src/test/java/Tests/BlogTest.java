package Tests;

import org.testng.annotations.Test;

import bases.Blogbase;
import pages.BlogPages;

public class BlogTest extends Blogbase{
	BlogPages page;
	@Test
	public void radio() {
		page = new BlogPages(driver);
		page.radio();
		
		page.checkbox();
	}
	

}
