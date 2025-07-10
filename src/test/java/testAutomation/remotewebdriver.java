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
	
	//Want to run tests in parallel across multiple machines? Then, Grid is for you.
	
//	Provide an easy way to run tests in parallel on multiple machines
//	Allow testing on different browser versions
//	Enable cross platform testing
	
	//selenioum grid has 4 ways to setup
	//standalone --where single machine registered as hub and node
	//hub and node: single hub and multiple nodes on different machines registered to hub
	
	

	// first download the selenium server
	//open the cmd prompt where file downloaded
	//we will use command java -jar selenium-server-4.31.0.jar standalone --selenium-manger true
	// it will give u one url and give that url in below strhub
	//open the url in browser check the sessions
	
	
	//second way
	//first open the cmd prompt their first run the hub
	//java -jar selenium-server-4.31.0.jar hub
	//it will give u one url donot close the cmd prompt
	//open another cmd prompt their run the node
	//java -jar selenium-server-4.31.0.jar node
	//it will give one url which will be registerd to hub ..in session it will show u the node url
	
	
	//research 
	
	
	WebDriver driver;
  @Test
  public void sample() throws MalformedURLException, InterruptedException {
	  
	   ChromeOptions options = new ChromeOptions();
	   options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	   options.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
	   
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


