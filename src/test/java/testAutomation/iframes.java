package testAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframes {
	@Test
	public void switchtoiframes()
	{
		
		//iframe is nothing but inserting any third party content 
		//if u write one parent frame then if u need swith again to normnal then it is driver.switchto().defaultcontent();
		//if u have nested frames then it is driver.switchto().parentframe(); to immediate parent
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("demo-frame")));
		
		
	}

}
