package HashMap1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	public  WebDriver driver;
	public  String Credentials;
    public String  CredentialInfo[];	
	
	@BeforeMethod
	public  void setUp() 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://apps.qaplanet.in/hrm/index.php");
	}
	
	    @Test
		public void logindetails() 
		 {
			
		 Credentials=Data.getUserLogin().get("anil");   //we can call any name
		 CredentialInfo=Credentials.split("_");
		
		
		driver.findElement(By.name("txtUserName")).sendKeys(CredentialInfo[0]);  
		driver.findElement(By.name("txtPassword")).sendKeys(CredentialInfo[1]);
		WebElement login=driver.findElement(By.name("Submit"));
		
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",login); 
	    
	   } 
	
	    @AfterMethod
	    public void end() 
	    {
	    	driver.close();
	    }
	    
	
}
