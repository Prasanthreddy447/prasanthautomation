package testAutomation;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class concept {

	public static void main(String[] args) {
		
		/*
		 difference bw selenium 3 and selenium 4
		 selenium 3 --> we have full page screenshot
		 selenium 4 we have element wise screenshot
		 
		 */
		
		/*
		  FUll page Takesscreenshot
		 ------------------
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 File src =ts.getscreenshotAs(OutputType.FILE);
		 File des = new File(System.getProperty("user.dir")+"\\screen\\k.png");
		 FileUtils.copyFile(null, null);
		 */
		
		/*
		 element wise screenshot
		 -----------------------------
		 WebElement w = driver.findelemnet(By.id(""));
		 
		 File src =w.getscreenshotAs(OUTPUTTYPE.FILE);
		 
		 File des = new File(path);	
		 
		FileUtils.copyFile(src,desc); 	 */
		
		/*
		 Chromeoptions
		 ---------------
		 chromeoptions are used to customize and configure and control browser version 
		 if u want run headless mode then we use
		 ChromeOptions option = new ChromeOptions()
		 option.addArguents("--headless");
		 
		 if u want run in incoginto mode then use chrome options
		 
		 if u want run in particulat browser version the we use chrome options
		 options.setbrowserversion
		 options.addarguments("--");
		  
		 SSL Handling
		 ------------
		 secure socket layer ---> so u need to chromeoptions to accept certificate
		 
		 to disable automated message on screen then we use chromeoptions
		 
		 */
		
		/*
		 selenium 3 and selenium 4
		  selenium 3 uses json protocaol for communication purpose
		  selenium 3 have full page screenshot method
		  selenium 3 chrome driver  extends remote web driver class
		  testers have to start hub and node 
		  selenium ide run only in firefox
		  
		  selenium 4.34 version
		  selenium 4 w3c protocol
		  selenuim 4 element wise screenshot
		  selenium 4 chrome driver extends chrommium driver class
		  testers no need to start hub and node
		  have relative locators
		  selenium ide run in chrome and firefox
		 
		 */
		
		/*
		 
		 */
		
		/*
		 comparable and comparator
		 
		 comparable --> single sorting order
		     comapareTo()
		     implemeneted witinn the class
		     natural sorting order
		     
		     
		  comprator
		  multiple sorting orders
		  compare()
		  implemnetd in another class
		  custmized sorting order
		  
		 
		 */
		
		
		
	}
	

}
