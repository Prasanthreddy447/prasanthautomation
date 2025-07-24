package testAutomation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {
	@Test
	public void ff()
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	WebElement ds=driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']"));
	
	String path=System.getProperty("user.dir")+"/screenshot/"+"1743067915349.png";
	
	ds.sendKeys(path);
	}
	
	//click  download test
	 //watch day 5 first 1 hr
	
	
	//shadow dom
	//if shadow root present we cannot find directly elements
	//we ahve to use only css selector for this
	//first we need find shadow host
	//later on we need find shadow root
	//from that we need to find element
	
	//Searchcontext is interface of webdriver and webelement
	
	@Test
	public void shadowdom()
	{
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://the-internet.herokuapp.com/shadowdom");
		
		WebElement du=driver1.findElement(By.xpath("//my-paragraph[1]"));//shadow host
		SearchContext context=du.getShadowRoot();  //shadow root
		//WebElement txt=context.findElement(By.xpath("//slot[@name='my-text']"));
		WebElement txt=context.findElement(By.xpath("//span[@slot='my-text']"));
		System.out.println(txt.getText());
		
		WebElement g=driver1.findElement(By.xpath("//span[contains(text(), 'different')]"));
		System.out.println(g.getText());
		
	}
	
	@Test
	public void simplealert()
	{
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://testautomationpractice.blogspot.com/");
		driver2.findElement(By.xpath("//button[@id='alertBtn']")).click();
		//Alert is interface
		Alert alert = driver2.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
	@Test
	public void confirmationalert() throws InterruptedException
	{
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://testautomationpractice.blogspot.com/");
		driver3.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert alert1 = driver3.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(5);
		alert1.dismiss();
		
		
	}
	
	@Test
	public void promptalert() throws InterruptedException
	{
		WebDriver driver4 = new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.get("https://testautomationpractice.blogspot.com/");
		driver4.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Thread.sleep(5);
		Alert alert2 = driver4.switchTo().alert();
		alert2.sendKeys("hlo");
		alert2.accept();
		alert2.dismiss();
	
	}
	
	//Alert is interface

}
