package orangeHRM_demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addEmployee {

	public WebDriver driver; //webdriver
	
	//properties

	By PIMPage = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"); //PIM page
	By addEmpBtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"); //add employee button
	By firstName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");//firstname
	By middleName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"); // middle name
	By lastName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"); //last name
	By empId = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"); //employee Id
	By submitBtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");//submit button

	//operations
	//constructor
	public addEmployee(WebDriver dr) {
		
		driver = dr;
	}
	
	//click pim tab
	public void clickPimTab() {
		
		driver.findElement(PIMPage).click();
	}
	
	//click add employee button
	public void clickAddEmpBtn() {
		
		driver.findElement(addEmpBtn).click();
	}
	
	//add firstname
	public void addEmpFirstName(String fName) {
		
		driver.findElement(firstName).sendKeys(fName);
	}
	
	//add middle name
	public void addEmpMiddleName(String mName) {
		
		driver.findElement(middleName).sendKeys(mName);
	}
	
	//add last name
	public void addEmpLastName(String lname) {
		
		driver.findElement(lastName).sendKeys(lname);
	}
	
	//add employee id
	public void addEmpId(String eId) {
		
		driver.findElement(empId).clear();
		driver.findElement(empId).sendKeys(eId);
	}
	
	//save button
	public void saveEmpDetails() {
		
		driver.findElement(submitBtn).click();
	}
}
