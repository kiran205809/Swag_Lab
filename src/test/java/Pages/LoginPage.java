package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.BaseClass;

public class LoginPage {
	
	
	WebDriver driver = BaseClass.driver;
     
	
	@FindBy(xpath="//input[@name='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']") 
	WebElement login;
	
	//WebElement username = driver.findElement(By.xpath("//input[@name='user-name']"));
	//WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	//WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void LoginFunction(String usval, String psval) {
		
		
		username.sendKeys(usval);
		password.sendKeys(psval);
		login.click();
	}

}



