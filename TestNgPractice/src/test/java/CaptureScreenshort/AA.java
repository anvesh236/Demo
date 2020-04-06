package CaptureScreenshort;

import org.testng.annotations.Test;

public class AA  {
	@Test
	public void add() throws ArithmeticException {
		
		//int a=0777;   //0787 is literal outof range
		
			try {
				Thread.sleep(200);
				System.out.println(10/0);
			
			} 
			catch (ArithmeticException e1) 
			{
				//System.out.println("ArithmeticException");
				  e1.printStackTrace();                   //mostally commom usesage oa this methode
				//System.out.println(e1);                //Four methods are equals are equal print the exception 
				//System.out.println(e1.toString());
				//System.out.println(e1.getMessage());
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
		}
		
	}


