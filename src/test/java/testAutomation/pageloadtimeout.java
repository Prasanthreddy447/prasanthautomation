package testAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pageloadtimeout {
	@Test
	public void loadtimepage()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestingplayground.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Class Attribute")).click();
	}

}

//In Selenium WebDriver, pageLoadTimeout specifies the maximum time to wait for a web page to 
//load before throwing a TimeoutException. If a page doesn't load within the specified time,
//the script will stop, and an exception will be raised. By default, the pageLoadTimeout is set to 300 seconds (5 minutes). 