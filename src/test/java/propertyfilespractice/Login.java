package propertyfilespractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	
	WebDriver driver;
	
	Properties prop;
	@BeforeMethod
	public void setup() throws IOException
	{
		prop = new Properties();
		String Path = System.getProperty("user.dir")+"//src//test//resources//proprtiesfile//config.properties";
		FileInputStream fs = new FileInputStream(Path);
		prop.load(fs);
		
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		
		}
		
	}
	
	
	@Test
	public void Logincred()
	{
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).submit();
		
	}

}
