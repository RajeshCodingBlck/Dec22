package Lec4;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		   $$$$*
//         $$$**
//         $$***
//         $****
//         *****
		
		
		int row=1;
		// Oberseve the 1st Row
		int nst=1;
		int ndoller=4;
		while(row<=5) {
			// work
			int i=1; // ith doller Print karne Ja raha 
			while(i<=ndoller) {
				System.out.print(" "+" ");
				i=i+1;
			}
			int j=1; // jth Star ko Print karne Ja raha hu.
			while(j<=nst) {
				System.out.print("*"+" ");
				j=j+1;
			}
			// Preparation for Next Row
			nst= nst+1;
			ndoller= ndoller-1;
			 row=row+1;
			 System.out.println();
		}
		
	}

}
