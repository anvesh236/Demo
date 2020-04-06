package TestNgPractice.TestNgPractice;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvidertest {
	
	WebDriver  driver;
	@Test(dataProvider="SearchProvider")
	 public void TC1(String uid,String pd)
	 {
		
   // System.setProperty("webdriver.chrome.driver","C:\\Users\\Anil Kumar\\Downloads\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     
	driver.get("http://apps.qaplanet.in/hrm/login.php");
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(uid);
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys(pd);
	driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
	driver.close();
	 }
	
	 @DataProvider(name="SearchProvider")
	 public Object[][] getlogincredentials()
	 {
		 //totally three rows and two coloums
	 Object[][] cred=new Object[3][2];
	 cred[0][0]="qaplanet1";
	 cred[0][1]="lab1"; 
	 cred[1][0]="qaplanet2";
	 cred[1][1]="lab2";
	 cred[2][0]="qaplanet3";
	 cred[2][1]="lab3";
	 return cred;  
	 
	 
	 }
} 
