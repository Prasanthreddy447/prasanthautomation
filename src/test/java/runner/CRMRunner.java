package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".//src//test//resources//TaggedFeatures//",
		glue= {"stepdef"},
		//monochrome=true,
		dryRun=false,
		
		//tags="@SmokeTest"
		//tags="@Regreesion and @SmokeTest"
		//tags="@Regreesion or @SmokeTest"
		//tags = "not @Regreesion and not @SmokeTest"
		//tags="@PhaseOne" //feature level
		//tags="@PhaseOne and @SmokeTest or @PhaseTwo and @SmokeTest"
		//tags="@PhaseOne and @SmokeTest"
		tags="@PhaseOne and @SmokeTest or @PhaseOne and @RegreesionTest"
		//tags="@PhaseOne and @RegreesionTest"
		
		)

public class CRMRunner extends AbstractTestNGCucumberTests{

}
