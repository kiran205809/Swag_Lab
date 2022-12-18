package Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void SuccesfullLogin() {
		
   LoginPage lp = new LoginPage();
   lp.LoginFunction("standard_user", "secret_sauce");
		
		
	}
	
	@Test
	public void LoginFailure() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("kiran", "kiran");
		
		WebElement errmsg = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		
		String actresult = "Epic sadface: Username and password do not match any user in this service";
		
		String expresult=errmsg.getText();
		
		System.out.println("ExpectError is "+expresult);
		
		
			
		Assert.assertEquals(actresult, expresult);		
	}
	
	
	   @Test
	   @Parameters({"param1","param2"})
	public void parameterizedTest(String username, String password) {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction(username, password);
		
	}
	   
	   @Test
	   public void LoginWithExternalData() {
		   
		   String username = sheet.getRow(0).getCell(0).getStringCellValue();
		   String password = sheet.getRow(0).getCell(1).getStringCellValue();
		   
		   
		   LoginPage lp = new LoginPage();
		   lp.LoginFunction(username, password);
		   
	   }

}
