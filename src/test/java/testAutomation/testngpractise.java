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
	//dependsOnMethods="" 
	//failed test cases will be in testng-failed.xml
	//modify the failed testcase and run the failed.xml
	//in testng.xml file we have packagename.classname
	//alwaysRun = true -->this either dependonmethods fail or skipped i need to run that current test case
	//priority test case will be runned first later on in alphabtic order it will run
	//
	
	
	
	
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
