package Java;

import org.testng.annotations.Test;

public class BreakStatement {

	
	@Test
	//-------------------Break statement------------
/*	public void statement() {
		
		for(int i=1; i<=10; i++) {
			
			
			
			if(i==5) {
				
				break;
			}
			System.out.println(i);
		} */
	//-------------------------------------switch-------------	
		
	/*	public void switchStatement() {
		
		int number=20;
		
		switch(number) {
		
		case 10:
			System.out.println("10");
			break;
		case 20:
		   System.out.println("20");
			break;	
		case 30:
			System.out.println("30");
			break;
		
		default:
			System.out.println("Not in 10,20,or30");	
		}
		
	}*/
	 
	//===============================================
	public void Loop() {
		aa:
	 for(int i=1;i<=3;i++){    
         //inner loop  
		 bb:
         for(int j=1;j<=4;j++){    
             if(i==2&&j==2){       //only inner for loop 2 statement is break remaning statement is continue
                 //using break statement inside the inner loop  
                break bb;
             }    
             System.out.println(i+" "+j);    
         }    
 }    
}  
	
	}
