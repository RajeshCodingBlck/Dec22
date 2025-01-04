package Lec_3;

public class Pattern3_Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//	 *
//	 **
//	 ***
//	 ****
//	 *****
		
	// 1 Observe the first Row
		
	   int row=1;
	   int nst=1;
	   while(row<=5) {
		   
		   // work
		   int i=1;
		   while(i<=nst) {
			   System.out.print("*");
			   i=i+1;
		   }
		   
		   // Preparation for Next row
		   nst=nst+1;
		   System.out.println();
		   row=row+1;
	   }
	}

}
