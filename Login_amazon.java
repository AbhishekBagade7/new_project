package amazon_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_amazon {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().getImplicitWaitTimeout();
		Duration.ofSeconds(5);
		Actions a1 = new Actions(driver);
		WebElement  move =	driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		a1.moveToElement(move).perform();
		driver.findElement(By.linkText("Sign in")).click();
		 FileInputStream creds = new FileInputStream("C:\\Users\\DELL\\eclipse\\Selenium\\ExcelSheet\\New Excel Worksheet.xlsx");
	     Workbook w1 = WorkbookFactory.create(creds);
	    String un = NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
	    String Pw = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		WebElement Uname =driver.findElement(By.id("ap_email"));		
		Uname.sendKeys(un);
		driver.findElement(By.id("continue")).click();
		WebElement pw = driver.findElement(By.id("ap_password"));
		pw.sendKeys(Pw);
		driver.findElement(By.id("signInSubmit")).click();
		WebElement move1 = driver.findElement(By.id("nav-link-accountList"));
		a1.moveToElement(move1).perform();
		driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();
		
		

	}

	

	

	

}
