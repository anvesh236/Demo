package TestNgPractice.TestNgPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExelSheet {

	@Test
	public void Readdata () throws IOException
	{
File a1=new File("C:\\Users\\Anil Kumar\\Desktop\\ExcelSheet.xlsx");
FileInputStream file=new FileInputStream(a1); 

XSSFWorkbook wbook=new XSSFWorkbook(file);
XSSFSheet sh=wbook.getSheet("Sheet1");   //String sheet name
//XSSFSheet sh=wbook.getSheetAt(0);     //int sheet numbetr

/*int rowcount=sh.getLastRowNum();
for(int i=1; i<=rowcount; i++)
{
	String UserName = sh.getRow(0).getCell(i).getStringCellValue();
	String Password = sh.getRow(1).getCell(i).getStringCellValue();

		System.out.println("Username is "+UserName);
		System.out.println("Password is "+Password);
		
	} */
	



		
   int rowcount=sh.getLastRowNum();             //return row count
	int colcount=sh.getRow(0).getLastCellNum();  //return column/cell count
	
	for(int i=0; i<rowcount; i++)
	{
		XSSFRow countrow=sh.getRow(i);       //focused on count row
		
		for(int j=0; j<colcount; j++) 
		{
		String countvalue=countrow.getCell(j).toString();
		System.out.print(" " +countvalue);
			
		}
		System.out.println();
	}     
	    
	

	}
	
	}


