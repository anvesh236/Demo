package TestNgPractice.TestNgPractice;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
;


public class JavaIO {
	//public static void main(String  args[]) throws Exception 
	@Test
   public void readData() throws IOException {
	
   File x=new File("‪F:\\Book1.xlsx");
   if(!(x.exists()))
   {
	   x.createNewFile();
   }
   if(x.exists())
   {
	   System.out.println("File exists");
	   
   }
	//To print absolute path
   System.out.println("x.getAbsulutepath");
   
}
}