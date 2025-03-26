package testAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class siblings {
	@Test
	public void hd()
	{
		ChromeOptions options= new ChromeOptions();
		  options.setBrowserVersion("110");
		  
		  WebDriver driver = new ChromeDriver(options);
		  driver.get("https://testautomationpractice.blogspot.com/");
		  //List<WebElement> items=driver.findElements(By.xpath("//td[contains(text(),'Learn Selenium')]/following-sibling::td"));
		  // IT will give u only one particular siblings i.e 3
		  
		  //List<WebElement> itemss=driver.findElements(By.xpath("//td[contains(text(),'Learn Selenium')]/following::td"));
		  //it will give u all sibilingss 125
		  
		  String author=driver.findElement(By.xpath("//td[contains(text(),'2000')]/following-sibling::td[3]")).getText();
		  System.out.println(author);
		//td[contains(text(),'2000')]/preceding-sibling::td[3]
		  
		  
		  
//		  for(WebElement i:items)
//		  {
//			  System.out.println(i.getText());
//		  }
		  
	}

}
