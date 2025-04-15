package extentreports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import testAutomation.Takesscreenshot;

public class extentreport {
	
	//it is third party tool 
	//need to add dependency extentreport from avanstack
	//by deafult extent report will not capture failed test cses we need write
	//after completimng each method @after method will excute theor get the status of test case and note down fail test cases
	
WebDriver driver;

ExtentReports extentreports;
ExtentSparkReporter spark;
ExtentTest test;

@BeforeTest
public void startExtent()
{
	extentreports = new ExtentReports();
	spark = new ExtentSparkReporter("test-output/spartreport.html")
			.viewConfigurer()
			.viewOrder()
			.as(new ViewName[] {
					ViewName.DASHBOARD,
					ViewName.AUTHOR,
					ViewName.TEST
			}).apply();
	extentreports.attachReporter(spark); //extent reports to attach spark
	
}

@AfterTest
public void endreport()
{
	extentreports.flush();
}
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String Browser)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.get("https://danube-webshop.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	
	@AfterMethod
	public void teardown(ITestResult result)
	{
		
		test.assignAuthor("prasanth")
		.assignCategory("Regression")
		.assignDevice(System.getProperty("os.name"))
		.assignDevice(System.getProperty("os.version"));
		if(ITestResult.FAILURE==result.getStatus())
		{
			test.log(Status.FAIL,result.getThrowable().getMessage());
			String path=Takesscreenshot.screnshot(driver);
			test.addScreenCaptureFromPath(path);
			
			
		}
		driver.quit();
	}
	
	@Test
	public void novelstores()
	{
		
		test =extentreports.createTest("Novels & Stories");
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("noel"));
	}
	
	//test will exceuted based on alphabatic order if we don't give priority
	//enabled = false then test will not execute
	//dependsOnMethods="" 
	//failed test cases will be in testng-failed.xml
	//modify the failed testcase and run the failed.xml
	//in testng.xml file we have packagename.classname
	//alwaysRun = true -->this either dependonmethods fail or skipped i need to run that current test case
	//priority test case will be runned first later on in alphabtic order it will run
	//
	
	
	
	
	@Test
	public void crimestores()
	{
		test=extentreports.createTest("Crime & Thrillers");
		driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("crime"));
	}
	
	
	@Test
	public void Fantasy()
	{
		test=extentreports.createTest("Fantasy");
		driver.findElement(By.xpath("//a[contains(text(),'Fantasy')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("fantasy"));
	}
	
	
	@Test
	public void Horror()
	{
		test=extentreports.createTest("Horror");
		driver.findElement(By.xpath("//a[contains(text(),'Horror')]")).click();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("horror"));
	}
	

}
