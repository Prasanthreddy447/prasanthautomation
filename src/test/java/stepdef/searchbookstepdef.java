package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchbookstepdef {
	
	WebDriver driver;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://danube-webshop.herokuapp.com/");
	    
	}
	@When("user seach for nivel&stories")
	public void user_seach_for_nivel_stories() {
	    
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	    
	}
	@Then("should display the novem books")
	public void should_display_the_novem_books() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("novel"));
	    
	}
	
	@When("user seach for Crime & Thriller")
	public void user_seach_for_crime_thriller() {
		driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
	}
	@Then("should display the Crime & Thriller books")
	public void should_display_the_crime_thriller_books() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("crime"));
	}
	
	@After
	public void attchscreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts =(TakesScreenshot)driver;
			
		byte[] b=ts.getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(b, "image/png", "failedscreenshot");
		}
	}

}
