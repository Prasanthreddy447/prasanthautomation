package testAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class retryAnalyzerpractise {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://danube-webshop.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	//IretryAnalyzer it excutes failed test case multiple times
	@Test(retryAnalyzer=RetryAnalyserImpl.class)
	public void novelstores()
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("noel"));
	}

}
