package TestNgPractice.TestNgPractice;


import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TakeFullscreenshort {
	
	
	

	@Test
	
	public void takescreenshort()  throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://automationtesting.in");

		
	//Shutterbug.shootPage(driver,ScrollStrategy.BOTH_DIRECTIONS,500,true).withName("FullPageScreenshot").save();
	    
	    
	    
	 		
	}

}
