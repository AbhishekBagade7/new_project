package amazon_package;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase_one3 extends TestCase_one{
	@Test
	public void amozn() {
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
		
	}
	

}
