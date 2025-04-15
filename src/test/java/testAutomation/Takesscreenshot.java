package testAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takesscreenshot {
	
	public static String screnshot(WebDriver driver)
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String desfile= System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		try {
			FileUtils.copyFile(src, new File(desfile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return desfile;
	}

}
