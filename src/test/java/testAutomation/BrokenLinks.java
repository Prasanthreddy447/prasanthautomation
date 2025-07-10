package testAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> ls =driver.findElements(By.tagName("a"));
		for(WebElement ll:ls)
		{
			String url =ll.getAttribute("href");
			if(url==null ||url.isEmpty())
			{
				System.out.println(url + " "+"is empty");
				continue;
			}
			
			URL link = new URL(url);//converting to url
			
			HttpURLConnection u = (HttpURLConnection)link.openConnection();
			u.connect();//connecting to database
			if(u.getResponseCode()>=400)
			{
				System.out.println("broken");
			}
			
		}

	}

}
