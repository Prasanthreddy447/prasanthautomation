package testAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngpractise {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String Browser)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get("https://danube-webshop.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void novelstores()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("novel"));
	}
	
	//test will exceuted based on alphabatic order if we don't give priority
	//enabled = false then test will not execute
	//dependsOnMethods="Methodname" 
	//failed test cases will be in testng-failed.xml
	//modify the failed testcase and run the failed.xml
	//in testng.xml file we have packagename.classname
	//alwaysRun = true -->this either dependonmethods fail or skipped i need to run that current test case
	//if u dont give priority then it will take as default as 0
	//first negative priority and then default then if u give priority as 0 then that one and other priority
	//In the context of Selenium and TestNG, "alwaysRun" refers to a TestNG attribute that ensures a test method 
	//is executed regardless of whether it's part of a group or if other tests in the group fail. It forces a method to 
	//run even if other methods it depends on fail, or if the method is part of a group that is not currently being executed.
	
	
	//In Selenium, "assert" and "verify" (or "soft assert") are both used to check if a condition is true during testing, 
	//but they differ in how the test continues after a failure. Assertions stop the test if a condition is false,
	//marking the test as failed, 
	//while verifications (soft assertions) allow the test to continue even if a condition is false, 
	//reporting the failure later
	
	
	@Test
	public void crimestores()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("crime"));
	}
	
	
	@Test
	public void Fantasy()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Fantasy')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("fantasy"));
	}
	
	
	@Test
	public void Horror()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Horror')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("horror"));
	}
	
	
	

}
