package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failedScenariosss.txt",
		glue= {"stepdef"},
		plugin= {"pretty",
				"html:target/reports/htmlreports.html",
		}
		)


public class Rerunrunner extends AbstractTestNGCucumberTests {


}
