@Payrolllogin
Feature: Payroll login feature

@credentials
Scenario: Login validation using with valid and invalid credentials
Given User is on payroll login "https://newtechpayroll.co.in/auth"
When user enter username as "admin" and password as "admin@123"
Then user able to see the message 



#@Add_user
#Scenario: Create new user
Given user is on login page
When Click Master menu
When Click user Management 
When Click create New user button
When Enter the Emp code "Emp3434"
When Enter the Employee name "TestEmployee"
When Select the Gender
When Select marital status from dropdown
When Select date of birth
When Enter the father name "Testfathername"
When Enter the mother name "Testmothername"
When Enter email address "Test@gmail.com"
When Enter mobile number "9778573727"
When Enter the current address "145,kumarakoil street, chennai"
When Enter the residental address "135,kumarakoil street, chennai"
When Enter blood group 
When Select date of join
When Select employee category 
When Select department
When Select designation
When Enter gross salary "12000"

When Select fixed working hours
#When select eligible for OT
#When Enter allowed leaves/month "10"
When Select epf applicable as yes 
When enter UAN number "7347834"
When Select ESIC applicable as yes
When enter ESIC "esic7484"
When Select canteen deduction required as yes
When enter canteen deduction amount "1200"
When Select payment type
When enter A/C name "Test"
When Enter A/C number "734784"
When Enter IFSC code "IFSC7473"
When Enter name of bank "test"
#When Enter no of holiday without salary cut "10"
When Alternate number with relationship "8473474734"
When Select work experience as yes
When enter number of years "5"
When enter previous company designation "test"
When enter previous company salary "10000"
And click the Next button
And click again the Next button
Then navigate to upload page

   