package TestNgPractice.TestNgPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TC_1 
{
	@Test

	public void main() throws IOException {
		
		File f1=new File("‪C:\\Users\\Anil Kumar\\Desktop\\anil.xlsx");
		FileInputStream f2=new FileInputStream(f1);
	    XSSFWorkbook  xs= new XSSFWorkbook(f2);
	    XSSFSheet   s=xs.getSheetAt(0);
	    
	    int rowcount = s.getLastRowNum();
		for(int i=1; i<=rowcount; i++)
		{
			String UserName = s.getRow(i).getCell(0).getStringCellValue();
			String Password = s.getRow(i).getCell(1).getStringCellValue();
				System.out.println("Username is "+UserName);
				System.out.println("Password is "+Password);
	    	}
	    }
	
}
