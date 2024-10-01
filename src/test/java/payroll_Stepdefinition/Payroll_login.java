package payroll_Stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Payroll_login {
	

	public static WebDriver driver; 
	
	
    
	@Given("User is on payroll login {string}")
	public void user_is_on_payroll_login(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}
	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String userNAME, String passWORD) {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement username= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-0']")));
	               username.sendKeys(userNAME);
	    WebElement password= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-1']")));
	               password.sendKeys(passWORD);    
		
//		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(userNAME);
//		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(passWORD);
		
	}
	@Then("user able to see the message")
	public void user_able_to_see_the_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div/form/button")).click();
		
		 
		
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("user has been logged in successfully");
	    
	}
	@When("Click Master menu")
	public void click_master_menu() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement mastermenu= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-sidebar/div/ng-scrollbar/div/div/div/div/div/div/mat-accordion/mat-expansion-panel[3]/mat-expansion-panel-header/span[1]/mat-panel-title/span")));
	    mastermenu.click();
	}
	@When("Click user Management")
	public void click_user_management() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement usermanagement= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"cdk-accordion-child-2\"]/div/ul/li[1]/a")));
	    usermanagement.click();
	}
	@When("Click create New user button")
	public void click_create_new_user_button() {
	    // Write code here that turns the phrase above into concrete actions
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    WebElement createuser= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/app-user-management-master/mat-card/mat-card-header/button")));
	    createuser.click();
	}
	@When("Enter the Emp code {string}")
	public void enter_the_emp_code(String empcode) {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    WebElement employcode= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-4']")));
		    employcode.sendKeys(empcode);
	}
	@When("Enter the Employee name {string}")
	public void enter_the_employee_name(String empname) {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement employname= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mat-input-5']")));
		    employname.sendKeys(empname);
	}
	@When("Select the Gender")
	public void select_the_gender() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement gender=driver.findElement(By.id("mat-radio-8-input"));
		je.executeScript("arguments[0].scrollIntoView(true);",gender);
		gender.click();

	}
	@When("Select marital status from dropdown")
	public void select_marital_status_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
//		try {
//			Thread.sleep(5000);
//			Select dropdown=new Select(	driver.findElement(By.xpath("//div[@id='mat-select-value-3']/span")));
//			
//			dropdown.selectByVisibleText(" Married ");
//		}
//		catch(Exception e){
//			System.out.println(e);}
//		

		driver.findElement(By.xpath("//div[@id='mat-select-value-3']/span")).click();
		driver.findElement(By.xpath("//mat-option[@id=\"mat-option-9\"]/span")).click();
		
		
		
	}
	@When("Select date of birth")
	public void select_date_of_birth() throws InterruptedException {
	    // datepicker code
//WebElement date=driver.findElement(By.xpath("//div[@id=\"cdk-step-content-0-0\"]/form/div[2]/ak-date-picker[1]/mat-form-field/div[1]/div[2]/div[2]/mat-datepicker-toggle/button/span[4]"));
//		
//		List<WebElement> columns=date.findElements(By.tagName("span"));
//
//		for (WebElement cell: columns){
//		   //Select 13th Date 
//		   if (cell.getText().equals("20")){
//		      cell.findElement(By.linkText("20")).click();
//		      break;
//		 }
//		
//		}
		
		driver.findElement(By.xpath("//input[@id=\"mat-input-6\"]")).sendKeys("9/11/2024");
		
    	
	}
	@When("Enter the father name {string}")
	public void enter_the_father_name(String fathername) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys(fathername);
	}
	@When("Enter the mother name {string}")
	public void enter_the_mother_name(String mothername) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='mat-input-8']")).sendKeys(mothername);
	}
	@When("Enter email address {string}")
	public void enter_email_address(String email) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys(email);
	}
	@When("Enter mobile number {string}")
	public void enter_mobile_number(String mobile) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='mat-input-10']")).sendKeys(mobile);
	}
	@When("Enter the current address {string}")
	public void enter_the_current_address(String address) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='mat-input-11']")).sendKeys(address);
	}
	@When("Enter the residental address {string}")
	public void enter_the_residental_address(String address1) {
	    // Write code here that turns the phrase above into concrete actions
		
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement add=driver.findElement(By.xpath("//input[starts-with(@name,'mat-radio-group-1') and contains(@value,'0')]"));
		je.executeScript("arguments[0].scrollIntoView(true);",add);
		add.click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Residental address')]")).sendKeys(address1);
	}
	@When("Enter blood group")
	public void enter_blood_group() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='mat-select-value-5']/span")).click();
		driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text' and text()=' A positive (A+) ']")).click();	
			
	}
	@When("Select date of join")
	public void select_date_of_join() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/app-root/div/div/app-user-form/mat-card/mat-card-content/mat-horizontal-stepper/div/div[2]/div[1]/form/div[2]/ak-date-picker[2]/mat-form-field/div[1]/div[2]/div[1]/input")).sendKeys("9/11/2024");
	}
	@When("Select employee category")
	public void select_employee_category() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//div[@id='mat-select-value-7']/span")).click();
	    driver.findElement(By.xpath("//span[text()=' Newtech industries ']")).click();
	}
	@When("Select department")
	public void select_department() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//div[@id='mat-select-value-9']/span")).click();
	    driver.findElement(By.xpath("//span[text()=' PRODUCTION ']")).click();
	}
	@When("Select designation")
	public void select_designation() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//div[@id='mat-select-value-11']/span")).click();
	   driver.findElement(By.xpath("//span[text()=' MANAGER ']")).click();
	}
	
	@When("Enter gross salary {string}")
	public void enter_gross_salary(String salary) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@placeholder='Monthly Gross salary']")).sendKeys(salary);
	}
	@When("Select fixed working hours")
	public void select_fixed_working_hours() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 JavascriptExecutor je=(JavascriptExecutor)driver;
	   WebElement hours= driver.findElement(By.xpath("/html/body/app-root/div/div/app-user-form/mat-card/mat-card-content/mat-horizontal-stepper/div/div[2]/div[1]/form/div[2]/ak-select-field[6]/mat-form-field/div[1]/div[2]/div/mat-select/div/div[1]/span"));
	   je.executeScript("arguments[0].scrollIntoView(true);",hours);
	   hours.click();
	   
	    driver.findElement(By.xpath("//span[text()=' 8 Hour ']")).click();
	}
//	@When("select eligible for OT")
//	public void select_eligible_for_ot() {
//	    // Write code here that turns the phrase above into concrete actions
//		JavascriptExecutor je=(JavascriptExecutor)driver;		
//		WebElement OT=driver.findElement(By.xpath("//input[@id='mat-radio-13-input']"));
//		je.executeScript("arguments[0].scrollIntoView(true);",OT);
//		OT.click();
//
//	}
//	@When("Enter allowed leaves\\/month {string}")
//	public void enter_allowed_leaves_month(String leave) {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.xpath("//input[@id=\"mat-input-14\"]")).sendKeys(leave);
//	}
	@When("Select epf applicable as yes")
	public void select_epf_applicable_as_yes() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement epf=driver.findElement(By.xpath("/html/body/app-root/div/div/app-user-form/mat-card/mat-card-content/mat-horizontal-stepper/div/div[2]/div[1]/form/div[2]/ak-radio[3]/mat-radio-group/mat-radio-button[1]/div/div/input"));
		je.executeScript("arguments[0].scrollIntoView(true);",epf);
		epf.click();

	}
	@When("enter UAN number {string}")
	public void enter_uan_number(String UAN) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'UAN number')]")).sendKeys(UAN);
	}
	
	@When("Select ESIC applicable as yes")
	public void select_esic_applicable_as_yes() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement esic=driver.findElement(By.xpath("/html/body/app-root/div/div/app-user-form/mat-card/mat-card-content/mat-horizontal-stepper/div/div[2]/div[1]/form/div[2]/ak-radio[4]/mat-radio-group/mat-radio-button[1]/div/div/input"));
		je.executeScript("arguments[0].scrollIntoView(true);",esic);
		esic.click();

	}
	@When("enter ESIC {string}")
	public void enter_esic(String ESIC) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'ESIC')]")).sendKeys(ESIC);
	}
	
	@When("Select canteen deduction required as yes")
	public void select_canteen_deduction_required_as_yes() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement canteen=driver.findElement(By.xpath("/html/body/app-root/div/div/app-user-form/mat-card/mat-card-content/mat-horizontal-stepper/div/div[2]/div[1]/form/div[2]/ak-radio[5]/mat-radio-group/mat-radio-button[1]/div/div/input"));
		je.executeScript("arguments[0].scrollIntoView(true);",canteen);
		canteen.click();
	}
	@When("enter canteen deduction amount {string}")
	public void enter_canteen_deduction_amount(String Canteen) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Canteen Deduction amount')]")).sendKeys(Canteen);
	}
	@When("Select payment type")
	public void select_payment_type() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//div[@id='mat-select-value-15']/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()=' Bank ']")).click();
	}
	
	@When("enter A\\/C name {string}")
	public void enter_a_c_name(String accountname) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[contains(@placeholder,'A/C name')]")).sendKeys(accountname); 
	}
	@When("Enter A\\/C number {string}")
	public void enter_a_c_number(String accountnumber) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'A/c no')]")).sendKeys(accountnumber);
	}
	@When("Enter IFSC code {string}")
	public void enter_ifsc_code(String IFSC) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'IFSC Code')]")).sendKeys(IFSC);
	}
	@When("Enter name of bank {string}")
	public void enter_name_of_bank(String NOB) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Name of Bank')]")).sendKeys(NOB);
	}
//	@When("Enter no of holiday without salary cut {string}")
//	public void enter_no_of_holiday_without_salary_cut(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    
//	}
	@When("Alternate number with relationship {string}")
	public void alternate_number_with_relationship(String AN) {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.xpath("//input[contains(@placeholder,'Alternate number')]")).sendKeys(AN);
	}
	@When("Select work experience as yes")
	public void select_work_experience_as_yes() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor je=(JavascriptExecutor)driver;		
		WebElement we=driver.findElement(By.xpath("//input[contains(@name,'mat-radio-group-5') and @value='1']"));
		je.executeScript("arguments[0].scrollIntoView(true);",we);
		we.click();

		
	}
	@When("enter number of years {string}")
	public void enter_number_of_years(String noy) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[contains(@placeholder,'No of years')]")).sendKeys(noy); 
	}
	@When("enter previous company designation {string}")
	public void enter_previous_company_designation(String PCD) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[contains(@placeholder,'previous Company Designation')]")).sendKeys(PCD);
	}
	@When("enter previous company salary {string}")
	public void enter_previous_company_salary(String PCS) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[contains(@placeholder,'Previous Company Salary')]")).sendKeys(PCS);
	}
	@When("click the Next button")
	public void click_the_next_button() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor je=(JavascriptExecutor)driver;
	   WebElement button=driver.findElement(By.cssSelector("#cdk-step-content-0-0 > form > div:nth-child(2) > button > span.mdc-button__label"));
	   je.executeScript("arguments[0].scrollIntoView(true);",button);
	   button.click(); 
	}
	@When("click again the Next button")
	public void click_again_the_next_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		   WebElement button1=driver.findElement(By.cssSelector("#cdk-step-content-1-0 > form > div:nth-child(2) > button > span.mdc-button__label"));
		   je.executeScript("arguments[0].scrollIntoView(true);",button1);
		   button1.click(); 
	}
	@Then("navigate to upload page")
	public void navigate_to_upload_page() throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    WebElement upload= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"cdk-step-content-1-1\"]/form/ak-upload-file[2]/div/ngx-dropzone/ngx-dropzone-label")));
		    upload.click();
		    Thread.sleep(3000);
		    String file="C:\\Users\\Lakshmanan\\OneDrive\\Pictures\\133652426981481416.jpg";
			StringSelection selection= new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
			
			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			
			Thread.sleep(5000);
		    WebElement upload1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"cdk-step-content-1-1\"]/form/ak-upload-file[3]/div/ngx-dropzone/ngx-dropzone-label")));
		    upload1.click();
		    Thread.sleep(3000);
		    String file1="C:\\Users\\Lakshmanan\\OneDrive\\Pictures\\133652426981481416.jpg";
			StringSelection selection1= new StringSelection(file1);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1,null);
			
			Robot robot1= new Robot();
			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(5000);
		    WebElement upload2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"cdk-step-content-1-1\"]/form/ak-upload-file[5]/div/ngx-dropzone/ngx-dropzone-label")));
		    upload2.click();
		    Thread.sleep(3000);
		    String file2="C:\\Users\\Lakshmanan\\OneDrive\\Pictures\\133689022037186937.jpg";
			StringSelection selection2= new StringSelection(file2);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection2,null);
			
			Robot robot2= new Robot();
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_V);
			robot2.keyRelease(KeyEvent.VK_V);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot2.keyPress(KeyEvent.VK_ENTER);
			robot2.keyRelease(KeyEvent.VK_ENTER);
		    
		  WebElement Submitbutton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"cdk-step-content-1-1\"]/form/div/button[2]")));
		  Submitbutton.click();
	}


}
