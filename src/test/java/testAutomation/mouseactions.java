package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseactions {
	
	
	//pause --it is used to stop sequence actions
	//to pause the action within selenium action chains
	//thread.sleep --it will stop entire excutuion of script
	//actions.pause(Duration.ofSeconds(4))
	
	
	
	
	@Test
	
public void ff() throws InterruptedException
{
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver3);
		
		
		WebElement hfd=driver3.findElement(By.xpath("//button[text()='Point Me']"));
		action.scrollToElement(hfd).perform();
		Thread.sleep(5000);
		action.moveToElement(hfd).perform();
		Thread.sleep(5000);
		
		WebElement hfd2=driver3.findElement(By.xpath("//a[text()='Laptops']"));
		action.click(hfd2).perform();
		
		WebElement hfd3=driver3.findElement(By.xpath("//button[text()='Copy Text']"));
		action.doubleClick(hfd3).perform();
		
		WebElement source=driver3.findElement(By.id("draggable"));
		WebElement target=driver3.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();
		
		
		//clicking multiple options
		Action act1 =action.keyDown(Keys.CONTROL)
				.click(target)
				.click(target)
				.keyUp(Keys.CONTROL)
				.build();
		
		act1.perform();
		
//		WebElement textField = driver.findElement(By.id("textInput"));
//        new Actions(driver)
//                .sendKeys(textField, "Selenium!")
//                .sendKeys(Keys.ARROW_LEFT)
//                .keyDown(Keys.SHIFT)
//                .sendKeys(Keys.ARROW_UP)
//                .keyUp(Keys.SHIFT)
//                .keyDown(cmdCtrl)
//                .sendKeys("xvv")
//                .keyUp(cmdCtrl)
//                .perform();
		
		//action.dragAndDropBy(sourceElement, 100, 50).build().perform();
		
		/*
		System.setProperty("webdriver.chrome.driver", "E:\\Soft Wares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url = "https://google.com";
		driver.get(Url);
		WebElement sigin = driver.findElement(By.id("gb_70"));
		//getLocation() WebElement method
		Point location = sigin.getLocation();
		System.out.println("Location of X :"+ location.getX()+ "," +"Location of Y :" +location.getY());
		//getSize() WebElement method
		Dimension size = sigin.getSize();
		System.out.println("Width :"+size.getWidth()+ "," +"Height : "+size.getHeight());
		//getText() WebElement method
		String text = sigin.getText();
		System.out.println("Text :" +text);
		//getTagName() WebElement method
		String tagName = sigin.getTagName();
		System.out.println("Tagname :"+tagName);
		//close the browser
		driver.close();
		 */
		
		
	
		
		
}

}
