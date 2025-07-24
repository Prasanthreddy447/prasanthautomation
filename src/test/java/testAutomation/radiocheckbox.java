package testAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class radiocheckbox {
	
	@Test
	public void has()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		boolean issel=driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected();
		
		if(issel)
		{
			driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		}
		
	}
	
	
	@Test
	public void hd()
	{
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://testautomationpractice.blogspot.com/");
		driver1.findElement(By.id("female")).click();
	}
	
	@Test
	public void hdd() throws InterruptedException
	{
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://demoblaze.com/");
		Thread.sleep(5000);
		List<WebElement> we=driver2.findElements(By.cssSelector("h4.card-title"));
		for(WebElement list:we)
		{
			if(list.getText().equalsIgnoreCase("Samsung galaxy s6"))
			{
			    list.click();
			    break;
			}
			

		}
		
	}
	
	@Test
	public void hss() throws InterruptedException
	{
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		
		Select s = new Select(driver3.findElement(By.id("country")));
		List<WebElement>l=s.getOptions();
		for(WebElement f:l)
		{
			System.out.println(f.getText());
		}
		
		s.selectByVisibleText("Canada");
	}
	
	
	
	// Selenium offers a isMultiple() method. This method, available within the Select class in Selenium, 
	//determines whether a dropdown element supports multiple selections.
	
	//The isMultiple() method specifically checks if the dropdown 
	//element allows for selecting multiple options at once
	
	@Test
	public void jh() throws InterruptedException
	{
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		
		Select s = new Select(driver3.findElement(By.id("colors")));
		
		if(s.isMultiple())
		{
			s.selectByValue("green");
			s.selectByIndex(1);
			
			
		}
		
		List<WebElement> o=s.getAllSelectedOptions();
		System.out.println(o.size());
		for(WebElement i:o)
		{
			System.out.println(i.getText());
		}
	}
	
	
	
	
	

}
