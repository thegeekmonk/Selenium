package page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import parent.GoogleSearch;

public class GoogleSearchPage extends GoogleSearch
{	
	public static List<WebElement> elements;
	
	
	//logic of google search and extracting result
	public void runTestScript()
	{
		driver.get("https://google.com");
		WebElement element = driver.findElement(By.name("q"));		
		
		element.sendKeys(searchString);
		
		driver.findElement(By.className("gNO89b")).click();
		
		//searching for input string in results generated by google
		elements = driver.findElements(By.partialLinkText(searchString));		
		
	}
		

}