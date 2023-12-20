package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//taggedFeatures//",
		glue = "stepDefs",
		monochrome=true,
//		tags = "@SmokeTest"
//		tags = "@RegressionTest"
//		tags = "@SmokeTest and @RegressionTest"
//		tags = "@SmokeTest or @RegressionTest"
		
//		tags = "@PhaseTwo"
//		tags = "@PhaseOne and @SmokeTest"
		
//		tags = "@PhaseOne and not @SmokeTest"

//		tags = "@PhaseOne and @SmokeTest or @PhaseTwo and @RegressionTest"
//		tags = "@PhaseOne and @SmokeTest and @PhaseTwo and @RegressionTest"
//		tags = "@PhaseOne and @RegressionTest and @SmokeTest or @PhaseTwo"
//		tags = "@PhaseTwo and @RegressionTest or @PhaseTwo and @SmokeTest"
		tags = "@PhaseOne"
		)
public class CRMRunner extends AbstractTestNGCucumberTests {

}
