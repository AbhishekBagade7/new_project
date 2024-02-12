package amazon_package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_one2 extends TestCase_one{
	@Test
	public void login_search_logout() {	
	WebElement find =	driver.findElement(By.id("twotabsearchtextbox"));
		find.sendKeys("Shoes");
		find.sendKeys(Keys.ENTER);		
	}
}
