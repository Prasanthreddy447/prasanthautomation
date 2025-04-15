package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shadowdom {
	
	WebDriver driver;
	
	// in shodow dom elements first we need to get shadow host and later on
	//we need to get the access for root element and access the elements
	
	@Test
	public void shdowdompractise()
	{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		
		WebElement shadowhost=driver.findElement(By.xpath("(//my-paragraph)[1]"));
		SearchContext context =shadowhost.getShadowRoot();
		WebElement txt =context.findElement(By.cssSelector("slot[name='my-text']"));
		System.out.println(txt.getText());
	}

}
