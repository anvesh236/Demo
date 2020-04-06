package TestNgPractice.TestNgPractice;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelUsingApachePoi2 
{
   @Test
	public void readData() throws Exception 
	{

	   //File f = new File("‪E:\\ReadData.xlsx");
	   
	  // System.out.println(f.exists());
			   
	   FileInputStream  fis = new FileInputStream("C:\\Users\\Anil Kumar\\Desktop\\ExcelSheet.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet  s1=wb.getSheetAt(0);  	
		int rowcount = s1.getLastRowNum();
		for(int i=1; i<=rowcount; i++)
		{
			String UserName = s1.getRow(i).getCell(0).getStringCellValue();
			String Password = s1.getRow(i).getCell(1).getStringCellValue();
				System.out.println("Username is "+UserName);
				System.out.println("Password is "+Password);
			
		}
		  
	}
}
