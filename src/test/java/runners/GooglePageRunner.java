package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//GooglePageSearch.feature",
		glue = "stepDefs",
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
				"html:target\\HtmlReport.html",
//				"rerun:target\\failedScenarios.txt"
//				"usage:target\\UsageReport",
//				"json:target\\JsonReport.json",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				
		}
		
		)
public class GooglePageRunner extends AbstractTestNGCucumberTests{
  
}
