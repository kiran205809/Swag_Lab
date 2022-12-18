package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

import Testcases.BaseClass;



public class HomePage {
	
	WebDriver driver = BaseClass.driver;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement filter;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	List<WebElement> itemList;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void filterfunctionality(int num) {
		
		Select s = new Select(filter);
		s.selectByIndex(num);	
		
	}
		public void verifyitems() {
			
			for(WebElement ele:itemList) {
				
				System.out.println(ele.getSize());
				System.out.println(ele.getText());
			}
			
			
			
		
	}
	

}
