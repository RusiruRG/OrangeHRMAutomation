package orangeHRM_demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	//web driver
	public WebDriver driver;
	
	//properties - Login Page
	
	By userName = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"); //username
	By password = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"); //password
	
	By LoginBtn = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"); //login button
	
	//constructor
	public Login(WebDriver d) {
		
		driver = d;
	}
	
	//operations - Login Page
	//set username
	public void setUserName(String uName) {
		
		driver.findElement(userName).sendKeys(uName);
	}
	
	//set password
	public void setPassword(String pwd) {
		
		driver.findElement(password).sendKeys(pwd);
	}
	
	//login button - click
	public void submitLoginBtn() {
		
		driver.findElement(LoginBtn).click();
	}
}
