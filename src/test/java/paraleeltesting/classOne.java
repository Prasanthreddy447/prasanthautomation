package paraleeltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classOne {
	
	//running parallel
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	
	@Test
	public void sample11()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test11......" +id);
	}
	
	@Test
	public void sample12()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test12....." +id);
	}
	
	@Test
	public void sample13()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test13......" +id);
	}
	
	

}
