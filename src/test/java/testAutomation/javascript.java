package testAutomation;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class javascript {

	@Test
	public void javascriptelements()
	{
		ChromeOptions options= new ChromeOptions();
		  options.setBrowserVersion("110");
		  
		  WebDriver driver = new ChromeDriver(options);
		  driver.get("https://testautomationpractice.blogspot.com/");
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  String title =(String)js.executeScript("return document.title");
		  System.out.println(title);
		  
		  WebElement gd =(WebElement)js.executeScript("return document.getElementById('name')");
		  gd.sendKeys("ds");
		  
		  js.executeScript("window.scrollBy(100, document.body.scrollHeight)");
		  
		  WebElement inputbox= driver.findElement(By.id(""));
		  
		  js.executeScript("argument[0].setAtrribute('value','john');",inputbox);
		  js.executeScript("argument[0].click();",inputbox);
		  
		  js.executeScript("argument[0].scrollIntoView();",inputbox);
		  
		  js.executeScript("document.getElementById('name').click();");
		  
		
		  //interface that allows direct execution of JavaScript code within the browser's context from a test script
		  //It's useful when standard Selenium commands can't handle certain elements or tasks, especially with dynamic web content
		  
	}
}
