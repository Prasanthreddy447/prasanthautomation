package testAutomation;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RealtiveLocators {
	
	
    @Test
	public void relativeloc()
	{
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://automationbookstore.dev/");
    	
    	driver.manage().window().maximize();
    	
    	String att=driver.findElement(with(By.tagName("li"))
    			.toLeftOf(By.id("pid6"))
    			.below(By.id("pid1")))
    			.getDomAttribute("id");
    	
    	System.out.println(att);
    	
    	
    	
    	
    	WebElement emailLabel = driver.findElement(
                RelativeLocator.with(By.tagName("label")).above(webelement);
        );
		
	}
    
    //Relative locator is in advanced locators when u don't have any attribute to for finding element then
    //u will go for side or below element.
    
    

}
