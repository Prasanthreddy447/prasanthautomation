package testAutomation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CDPTest {
		ChromeDriver chromedriver;
		DevTools devtols;
		
		@BeforeMethod
		public void setups() {
			chromedriver = new ChromeDriver();
			devtols=chromedriver.getDevTools();	
			devtols.createSession(chromedriver.getWindowHandle());
		}
		@Test
		public void devicemodetest() {
			Map ms= new HashMap()
					{{
						put("width", 800);
						put("height", 1200);
						put("deviceSclaeFactor", 50);
						put("mobile", true);
					}};
					chromedriver.executeCdpCommand("Emulation.setDeviceMetricsOverride", ms);
					chromedriver.get("https://www.selenium.dev/");
					
		}	
		@Test
		public void geolocation() {
			Map ms2= new HashMap()
					{{
						put("latitude", 33.7489);
						put("longitude", -39.63552);
						put("accuracy", 50);
						
					}};
					chromedriver.executeCdpCommand("Emulation.setDeviceMetricsOverride", ms2);
					chromedriver.get("https://oldnavy.gap.com/stores");
		
	}
		
}



