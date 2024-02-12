package amazon_package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase_one4 extends TestCase_one {
	@Test
	public void wish_list() {
		WebElement find1 =	driver.findElement(By.id("twotabsearchtextbox"));
		find1.sendKeys("pen");
		find1.sendKeys(Keys.ENTER);
		WebElement pen=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
		pen.click();
		Set<String> handle =driver.getWindowHandles();
		Iterator<String> ite =handle.iterator();
		String parent =ite.next();
		String child =ite.next();
		driver.switchTo().window(child);
		WebElement ele =driver.findElement(By.id("add-to-cart-button"));  //add-to-cart-button
		ele.click();
		
	}

}
