package stepdef;

//import static ;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class useloginstepdef {
	
	
	WebDriver driver;
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	//thgis for static 
//	@When("user enters credentials")
//	public void user_enters_username_as_and_password_as() {
//	    
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).submit();
	
	
//	}
	
	
	//this for paramterztion and outline
//	@When("user enters username as {string} and password as {string}")
//	public void user_enters_username_as_and_password_as(String string, String string2) {
//		driver.findElement(By.id("username")).sendKeys(string);
//		driver.findElement(By.id("password")).sendKeys(string2);
//		driver.findElement(By.className("radius")).submit();
//	}
	
	
	//datatable with lsit
//	@When("user enters credentials")
//	public void user_enters_credentials(DataTable username) {
//		
//		List<List<String>> li=username.asLists();
//		String string=li.get(0).get(0);
//		String string2=li.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(string);
//		driver.findElement(By.id("password")).sendKeys(string2);
//		driver.findElement(By.className("radius")).submit();
//		
//	}
//	
//	
//	    
//	@Then("should display message success")
//	public void should_display_message_success(DataTable name) {
//		
//		List<String> s=name.asList();
//		String msg=s.get(0);	
//		//div[contains(text(), 'You logged into a secure area!')]
////		boolean dis=driver.findElement(By.xpath("")).isDisplayed();
////		Assert.assertTrue(dis);
//		boolean dis=driver.findElement(By.xpath("//div[contains(text(), '"+ msg +"')]")).isDisplayed();
//		Assert.assertTrue(dis);
//		
//	}
	
	
	//datatable with map
	@When("user enters credentials")
	public void user_enters_credentials(DataTable usernamemap) {
		List<Map<String, String>> data =usernamemap.asMaps();
		
		String string= data.get(0).get("username");
		String string2=data.get(0).get("password");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.className("radius")).submit();
		
	}
	
	
	    
	@Then("should display message success")
	public void should_display_message_success(DataTable name) {
		
		List<String> s=name.asList();
		String msg=s.get(0);	
		//div[contains(text(), 'You logged into a secure area!')]
//		boolean dis=driver.findElement(By.xpath("")).isDisplayed();
//		Assert.assertTrue(dis);
		boolean dis=driver.findElement(By.xpath("//div[contains(text(), '"+ msg +"')]")).isDisplayed();
		Assert.assertTrue(dis);
		
	}

}
