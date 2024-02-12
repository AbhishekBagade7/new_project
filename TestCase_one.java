package amazon_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase_one {
	public ChromeDriver driver;
	 
	@BeforeMethod
	public void Launch() throws EncryptedDocumentException, IOException {
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement elem = driver.findElement(By.id("nav-link-accountList"));
	elem.click();
	FileInputStream creds = new FileInputStream(
			"C:\\Users\\DELL\\eclipse\\Selenium\\ExcelSheet\\New Excel Worksheet.xlsx");
	Workbook w1 = WorkbookFactory.create(creds);
	String un = NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
	WebElement Uname = driver.findElement(By.id("ap_email"));
	Uname.sendKeys(un);
	WebElement Un = driver.findElement(By.id("continue"));
	Un.click();
	String Pw = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();	
	WebElement pw = driver.findElement(By.id("ap_password"));
	pw.sendKeys(Pw);
	driver.findElement(By.id("signInSubmit")).click();

	}
	@AfterMethod
	public void logout() {
		Actions a2 = new Actions(driver);
     	WebElement move1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		a2.moveToElement(move1).perform();
		driver.findElement(By.xpath("//span[.='Sign Out']")).click();
		driver.close();
	}	
}
