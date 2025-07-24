package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features=".//src//test//resources//features//datatableasmap.feature",
		glue= {"stepdef"},
		dryRun=false,
		plugin= {"pretty",
				"html:target/reports/htmlreport.html",
				//"json:target/reports/jsonreport.json",
				//"usage:target/reports/usagereport",
				//"rerun:target/failedScenariosss.txt"
				//this rerun plugin will generate failed scenarioes in target folder failedscenario.txt file
				
			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		monochrome=true
		)


public class Booksearchrunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
	
}


//runner will be run by testng so we need extend by abstracttestngcucumbertests 
//in glue we are giving package name y beacuase we are implementing so many stepdefinitions files so if we 
//we give package name it will take required step definition file
//AbstractTestNGCucumberTests this class will run the feature file as testng file
//pluin={"pretty"} this gives us which scenario and steps(report) ran in console with some random error symbols
//to remove these errors we use monocrome= true
//rerun is the plugin that it will genearate the failed scenarioes
//dryRun will tell us if any umimplemented scenarioes
//if we keep dryrun as true it will not excute steps it will check steps
//we should keep dryrun false to execute
//add dependencies extentreportes and cucmber7-adapter in pom
//create file extent.properties file
//in that add some statemnets
//in step def take screenshot
//create cucumber.propertirs file their it will generate cloud report which will be availble 24 hrs in console reprt url will be there

/*

Class Booksearchrunner:
This class extends AbstractTestNGCucumberTests, which is a base class provided by the Cucumber framework when using it with TestNG.

@DataProvider method named scenarios():

This method overrides the scenarios() method from the parent class.

It returns the result of super.scenarios(), meaning it calls the base implementation of scenarios().

The scenarios() method returns all the Cucumber scenarios (tests) to be run.

parallel=true in @DataProvider:

This indicates that the test scenarios should be run in parallel.

Each Cucumber scenario will be run as a separate TestNG test method, and by setting parallel=true, multiple scenarios can be executed simultaneously in different threads.

Summary
This class is a TestNG test runner for Cucumber tests, and it runs all the Cucumber scenarios in parallel, speeding up the execution by running multiple tests concurrently.

Typical use case:
You have a Cucumber feature file with many scenarios.

You want to run those scenarios using TestNG.

You want to speed up the test suite execution by running tests in parallel.

This runner class achieves exactly that.
*/