package testAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autodropdown {
	
	@Test
	public void autodropdown() throws InterruptedException
	{
WebDriver driver = new ChromeDriver();

//not as expcted
		
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("tags")).sendKeys("as");
		Thread.sleep(5000);
		List<WebElement> items=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println(items.size());
		for(WebElement item:items)
		{
			
			System.out.println(item);
			if(item.getText().equalsIgnoreCase("JavaScript"))
			{
				item.click();
				break;
			}
		}
	}

}
