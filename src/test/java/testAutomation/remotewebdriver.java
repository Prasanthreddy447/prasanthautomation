package testAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class remotewebdriver {
	
	WebDriver driver;
  @Test
  public void sample() throws MalformedURLException, InterruptedException {
	  
	   ChromeOptions options = new ChromeOptions();
	   options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	   
	   String strhub= "http://10.0.12.8:4444";
	   
	   driver= new RemoteWebDriver(new URL(strhub), options);
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   
	   driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("test");
		Thread.sleep(5);
		WebElement cross=driver.findElement(By.xpath("//a[text()='Clear text']"));
		
		if(cross.isDisplayed())
		{
			cross.click();
		}
	   
	   
  }
}
