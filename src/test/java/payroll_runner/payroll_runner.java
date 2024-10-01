package payroll_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		
		features = {"Featurefiles"},
		glue = {"payroll_Stepdefinition","hooks","payroll_runner"},			
        tags= "@Payrolllogin",
		plugin = {"pretty","html:report/WebReport","json:report/jsonreport.json" },
		monochrome=true,
		dryRun=false
		)
public class payroll_runner extends AbstractTestNGCucumberTests {

}
