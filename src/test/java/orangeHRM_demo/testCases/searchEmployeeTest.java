package orangeHRM_demo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import orangeHRM_demo.pageObjects.searchEmployee;

public class searchEmployeeTest extends LoginTest {

	@Test(priority=1)
	public void searchEmployeeFunc() {
		
		//search employee object
		searchEmployee sEmp = new searchEmployee(driver);
		sEmp.visitPIMPg();
		
		//wait for the employee information section
		WebDriverWait waitForEmpInfo = new WebDriverWait(driver, 20);
		waitForEmpInfo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")));

		sEmp.addEmpName("Peter");//employee name
		sEmp.addEmpId("0007"); //employee id
		sEmp.selectEmpStatus();
		
	}

	
}
