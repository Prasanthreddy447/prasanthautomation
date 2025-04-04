package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseactions {
	
	
	@Test
	
public void ff() throws InterruptedException
{
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver3);
		
		
		WebElement hfd=driver3.findElement(By.xpath("//button[text()='Point Me']"));
		action.scrollToElement(hfd);
		Thread.sleep(5000);
		action.moveToElement(hfd).perform();
		Thread.sleep(5000);
		
		WebElement hfd2=driver3.findElement(By.xpath("//a[text()='Laptops']"));
		action.click(hfd2).perform();
		
		WebElement hfd3=driver3.findElement(By.xpath("//button[text()='Copy Text']"));
		action.doubleClick(hfd3).perform();
		
		WebElement source=driver3.findElement(By.id("draggable"));
		WebElement target=driver3.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();
	
		
		
}

}
