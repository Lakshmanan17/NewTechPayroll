package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Start_browser extends BasePage{
	public static WebDriver driver;       
    public final static int TIMEOUT = 10;
	
//@BeforeSuite
    @Before
public void Openbrowser() {
	  WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();        
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
}
//@AfterSuite
    @After
public void closebrowser() {
	//driver.close();
}
}
