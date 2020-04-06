package TestNgPractice.TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPralleltestingdemo {

	WebDriver driver;
	
/*	@Test(threadPoolSize=3,invocationCount=3, timeOut=1000)
	public void test1() {
		
   System.out.println("I am insede Test 1 |"+Thread.currentThread());
   driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.google.com/"); 
   
	}
	@Test
   public void test2() {
	 
	  System.out.println("I am nside Test 2 |"+Thread.currentThread());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/hrm/login.php");      
   }  */
	
	@BeforeMethod
	public void beforemethode() {
		System.out.println("I am in beforemethod");
	}
	@Test
	public void testone() {
		System.out.println("I am in testone");
	}
	@Test
	public void testtwo() {
		System.out.println("I am in testtwo");
	}
	
	@AfterMethod
	public void aftermethode() {
		System.out.println("I am in aftermethod");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
