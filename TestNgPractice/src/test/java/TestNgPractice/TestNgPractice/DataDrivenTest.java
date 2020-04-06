package TestNgPractice.TestNgPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenTest {
	@Test
  	public void TC1() throws IOException
	{
	File x=new File("C:\\Users\\Anil Kumar\\Desktop\\ExcelSheet.xlsx");
	FileInputStream file=new FileInputStream(x);

	
	
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int rc=sh.getLastRowNum()-sh.getFirstRowNum();
	
	System.out.println(rc);
	XSSFRow rw=sh.getRow(1);
	
	String UID=rw.getCell(0).toString();
	String PW=rw.getCell(1).toString();  
	
	

	System.out.println(UID);
	System.out.println(PW);
	
	//System.setProperty("webdriver.chrome.driver","/DriverFiles/chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("http://apps.qaplanet.in/hrm/login.php");
	Driver.findElement(By.name("txtUserName")).sendKeys(UID);
	Driver.findElement(By.name("txtPassword")).sendKeys(PW);
	Driver.findElement(By.name("Submit")).click();
	Driver.close();

	}
	}






