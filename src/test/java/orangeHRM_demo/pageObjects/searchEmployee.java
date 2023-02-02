package orangeHRM_demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchEmployee {

	public WebDriver driver;
	
	//properties
	By PIMPage = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"); //PIM page
	By empName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"); //emp name
	By empId = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"); //employee id
	By empStatus = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div"); //employee status
	By includeStatus = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"); //include 
	By supName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input"); //supervisor name
	By jobTitle = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div"); //job title
	By subUnit = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div"); //sub unit
	By searchBtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By resetBtn = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
	
	//constructor
	public searchEmployee(WebDriver d) {
		
		driver = d;
	}
	
	//visit PIM page
	public void visitPIMPg() {
		driver.findElement(PIMPage).click();
	}
	
	//add employee name
	public void addEmpName(String eName) {
		driver.findElement(empName).sendKeys(eName);
	}
	
	//add employee id
	public void addEmpId(String eID) {
		driver.findElement(empId).sendKeys(eID);
	}
	
	//select employee status
	public void selectEmpStatus() {
		driver.findElement(empStatus).click();
	}
	
	//select include field
	public void selectIncludeStatus() {
		driver.findElement(includeStatus).click();
		
	}
	
	//add supervisor name
	public void addSupName(String sName) {
		driver.findElement(supName).sendKeys(sName);
	}
	
	//select job title field
	public void selectJobField() {
		driver.findElement(jobTitle).click();
	} 
	
	//select sub unit
	public void selectSUnit() {
		driver.findElement(subUnit).click();
	}
	
	//save details
	public void submitDetails() {
		driver.findElement(searchBtn).click();
	}
	
	//reset details
	public void resetDetails() {
		driver.findElement(resetBtn).click();
	}
}
