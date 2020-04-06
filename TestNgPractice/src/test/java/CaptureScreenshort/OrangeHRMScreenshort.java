package CaptureScreenshort;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import TestNgPractice.TestNgPractice.Utility;


public class OrangeHRMScreenshort {

	public static WebDriver driver;
	Utility utility=new Utility();
	
	@Test
	public void initialization() {
	
		//System.setProperty("webdriver.chrome,.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/hrm/login.php");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet2");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
    
		utility.captureScreenshort(driver, "Type");
	
		}
} 

 
