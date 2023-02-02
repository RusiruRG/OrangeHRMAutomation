package orangeHRM_demo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import orangeHRM_demo.pageObjects.addEmployee;

public class addEmployeeTest extends LoginTest {

	@Test(priority=1)
	public void addEmployeeFunc() {
		
		//add employee object
		addEmployee adEmp = new addEmployee(driver); 
		adEmp.clickPimTab(); //click pim tab
		
		//wait for PIM page title
		WebDriverWait waitForPIM = new WebDriverWait(driver, 30);
		waitForPIM.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")));
		
		adEmp.clickAddEmpBtn(); //click add employee button
	
		//wait for Add Employee Page title
		WebDriverWait waitForAddEmp = new WebDriverWait(driver, 30);
		//waitForAddEmp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")));
		//waitForAddEmp.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/h6")));
		waitForAddEmp.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")));
		//waitForAddEmp.until(ExpectedConditions.elementToBeSelected(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")));
		
		//call addEmployee page functions
		adEmp.addEmpFirstName("Peter"); // add employee first name
		adEmp.addEmpMiddleName("Pan"); //add employee middle name
		adEmp.addEmpLastName("Paul"); //add employee last name
		adEmp.addEmpId("0123"); // add emp id
		
		adEmp.saveEmpDetails(); // save details
		
		//wait for direct to the employee page
		WebDriverWait waitForEmpPg = new WebDriverWait(driver,30);
		waitForEmpPg.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")));
		
		
	}
	
}
