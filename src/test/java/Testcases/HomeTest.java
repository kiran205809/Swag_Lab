package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class HomeTest extends BaseClass {
	
    @Test 
	public void succesfullFilter() {
		
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		
		HomePage hp = new HomePage();
		hp.filterfunctionality(3);
		hp.verifyitems();
		
		
		driver.manage().timeouts().implicitlyWait(1000000000, TimeUnit.MILLISECONDS);
			
		
		
		
	}
	
	
}
