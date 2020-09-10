package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import parent.GoogleSearch;
import script.GoogleSearchPage;

public class GoogleSearchTest extends GoogleSearch
{

	private GoogleSearchPage page;
	
	public GoogleSearchTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Before
	public void initialize()
	{
		page = new GoogleSearchPage();
//		page.setConfiguration();
		page.runTestScript();
	}
	
	
	@Test
	public void testGoogleSearchPage()
	{
		for(WebElement element : page.elements)
			assertTrue(element.getText().contains(page.searchString));
	}

}