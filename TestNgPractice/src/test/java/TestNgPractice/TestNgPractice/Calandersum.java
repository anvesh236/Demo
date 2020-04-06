package TestNgPractice.TestNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calandersum {

	WebDriver driver;	
	String month="";
	String date="";
	
	@Test
	public  void booking() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net/home");
	WebElement title=driver.findElement(By.xpath("//*[@class='imagelogo']"));
	System.out.println(title.getText());
    Thread.sleep(3000);
    
	String s1=title.getText();
	if(s1.equals("Travel Technology Partner")) {
		System.out.println("titile is currect");
	}else {
		System.out.println("title is in-currect");
		
	}
	
	    driver.findElement(By.id("checkin")).click();
		
		
	}
}
