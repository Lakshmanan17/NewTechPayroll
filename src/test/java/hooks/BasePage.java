package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class BasePage {
	public static WebDriver driver;    
	public static void main(String args[]) throws Throwable {
		try {
			Main.main(new String[]{
				"-g","hooks",
				"-g", "payroll_Stepdefinition",
				"-g","payroll_runner",
				"Featurefiles",
				
				"t","@Payrolllogin",
				
				"p","pretty",
				"p","html:report/WebReport",
				"p","json:report/jsonreport.json",
				
				"m"
				
			}
		);
		}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Main method Exception: " +e);
	}
	
}
}	
