package TestNgPractice.TestNgPractice;


//import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshort1 {
//	@Test
	
    public  void add( ) throws IOException
    {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/hrm/login.php");	
      /*  TakesScreenshot ts=(TakesScreenshot)driver;
	    File source =ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source, new File("D:\\Anil\\ANIL WORK SPACE\\TestNgPractice.png"));
		System.out.println("The Screenshort is taken");
		driver.close();  */
		
		
		
	
	      
	              File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           //The below method will save the screen shot in d drive with name "screenshot.png"
	              FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
	      
		 
		
		
    }
	
}
 
