package TestNgPractice.TestNgPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Utility {
	
	
	public void captureScreenshort(WebDriver driver, String screenshortName) {
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./Testscreenshort/OrangeHRM.png"+screenshortName+".png");
		FileUtils.copyFile(source, destination);
		
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("Exception while taking scroonshort"+e.getMessage());
			
		}
	}

	
	}


