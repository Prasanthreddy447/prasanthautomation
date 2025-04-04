package paraleeltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classTwo {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void sample21()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test21......" +id);
	}
	
	@Test
	public void sample22()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test22......" +id);
	}
	
	@Test
	public void sample23()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test23......" +id);
	}
		
	
		
	
		
	

}
