package amazon_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase_one5 extends TestCase_one{
	@Test
	public void drop_down() {
		WebElement drop =	driver.findElement(By.id("searchDropdownBox"));
		drop.click();
		Select s1 = new Select(drop);
		s1.selectByVisibleText("Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
