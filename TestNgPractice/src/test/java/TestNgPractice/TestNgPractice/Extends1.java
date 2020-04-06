package TestNgPractice.TestNgPractice;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;

public class Extends1 {

		

		@Test
		public   void reports() throws IOException {
			//start reports
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/Anil1.html");
			
			//ExtentXReporter extentxReporter = new ExtentXReporter();
			ExtentReports extent=new ExtentReports();
		    extent.attachReporter(reporter);
		    
		    ExtentTest logger= extent.createTest("LoginTest");
			logger.log(Status.INFO, "Login to amazon");
			logger.log(Status.PASS, "title verify");
			extent.flush();
			
		    ExtentTest logger1= extent.createTest("Logoff Test");
		    logger1.log(Status.FAIL, "Title verify");
		    // log with snapshot
		    logger1.fail("Failed because of some issuse", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Anil Kumar\\Pictures\\202955-beautiful-windows-10-desktop-wallpaper-1920x1080-pc.jpg ").build());
		    logger1.pass("Failed because of some issuse", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Anil Kumar\\Pictures\\202955-beautiful-windows-10-desktop-wallpaper-1920x1080-pc.jpg ").build());
	        
	        // test with snapshot
		    //logger1.addScreenCaptureFromPath("C:\\Users\\Anil Kumar\\Pictures\\202955-beautiful-windows-10-desktop-wallpaper-1920x1080-pc.jpg  ");
			extent.flush();
			 
		}	
	}


