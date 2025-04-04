package testAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class windowHandles {
	@Test
	public void window()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String parentwind=driver.getWindowHandle();
		System.out.println(parentwind);
		
		Actions act = new Actions(driver);
		WebElement div=driver.findElement(By.id("tabButton"));
		act.scrollToElement(div);
		
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String>s=driver.getWindowHandles();
		
		for(String c:s)
		{
			if(!c.equalsIgnoreCase(parentwind))
			{
				driver.switchTo().window(c);
			}
			
		}
		
		driver.switchTo().window(parentwind);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.quit();
		
		
		
	}

}
