package orangeHRM_demo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import orangeHRM_demo.pageObjects.Login;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() {
		
		//webdriver wait for login page
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img")));
		
		//login page object
		Login login = new Login(driver);
		login.setUserName("Admin");
		login.setPassword("admin123");
		login.submitLoginBtn();
		
		//webdriver wait for dashboard
		WebDriverWait waitD = new WebDriverWait(driver,3000);
		waitD.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p")));
		
		//dashboard page actual title
		 String pgAcTitle = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		//dashboard page expected title
		String expTitle = "Dashboard";
		
		//assertions for - dashboard
		SoftAssert s = new SoftAssert();
		s.assertEquals(pgAcTitle, expTitle);
		s.assertAll();
	}
}
