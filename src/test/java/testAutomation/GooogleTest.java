package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooogleTest {
  @Test
  public void hoo() {
	  
	  
	  ChromeOptions options= new ChromeOptions();
	  options.setBrowserVersion("110");
	  
	  WebDriver driver = new ChromeDriver(options);
	  driver.get("https://accounts.lambdatest.com/register");
	  driver.findElement(By.xpath("//form[@class='form reg-custom']//input[@id='email']")).sendKeys("hi");
	  driver.findElement(By.xpath("//form[@class='form reg-custom']//input[@id='userpassword']")).sendKeys("dss");
	  
	  driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
	  
	  //difference between get and navigate
	  //get is for dynmic pages and navigate to is for static pages
	  //when we add depndencies in the pom then it will download all jar files into one folder and in local it will be .m2 file
	  
  }
}
