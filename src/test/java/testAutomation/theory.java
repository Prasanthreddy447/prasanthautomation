package testAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class theory {
	@Test
	public void th()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("prasanth");
		driver.findElement(By.id("password")).sendKeys("hsg");
		//here we are using sumbit instead click beacause we have type is submit and inside form tag
		driver.findElement(By.xpath("//button[@class='radius']/i")).submit();
		
	}
	
	@Test
	public void hd() throws InterruptedException, IOException
	{
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://automationbookstore.dev/");
		driver1.findElement(By.id("searchBar")).sendKeys("test");
		Thread.sleep(5);
		WebElement cross=driver1.findElement(By.xpath("//a[text()='Clear text']"));
		
		if(cross.isDisplayed())
		{
			cross.click();
		}
		
//		TakesScreenshot sc =(TakesScreenshot)driver1;
//		File src=sc.getScreenshotAs(OutputType.FILE);
//		
//		String path=System.getProperty("user.dir")+"/screenshot/"+ System.currentTimeMillis()+".png";
//		
//		FileUtils.copyFile(src, new File(path));
		
		File src=cross.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src, new File(path));
	}

}
