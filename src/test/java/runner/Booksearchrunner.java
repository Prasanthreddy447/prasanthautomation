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


//runner will be run by testng so we need cucumber testng 
//in glue we are giving package name y beacuase we are implementing so many stepdefinitions files so if we 
//we give package name it will take required step definition file
//AbstractTestNGCucumberTests this class will run the feature file as testng file
//pluin={"pretty"} this gives us which scenario and steps(report) ran in console with some random eeror symbols
//to remove these errors we use monocrome= true
//rerun is the plugin that it will genearate the failed scenarioes
//dryRun will tell us if any umimplemented scenarioes
//if we keep dryrun as true it willnot excute steps it will check steps
//we should keep dryrun false to excute
//add dependencies extentreportes and cucmber7-adapter in pom
//create file extent.properties file
//in that add some statemnets
//in step def take screenshot
//create cucumber.propertirs file their it will generate cloud report which will be availble 24 hrs in console reprt url will be there

