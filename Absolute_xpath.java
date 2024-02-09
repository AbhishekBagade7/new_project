package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Absolute_xpath {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("abhishek");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abhi");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("abcd1@34");
		driver.findElement(By.xpath("/html/body/form[1]/input[1]")).sendKeys("abcdefgh");
		//driver.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("asdrftg");
		driver.findElement(By.xpath("/html/body/form[1]/input[3]")).click(); //submit button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/form[2]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form[2]/input[4]")).click();  // submit button
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		driver.findElement(By.xpath("/html/body/input[5]")).click();
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		
		

	}

}
