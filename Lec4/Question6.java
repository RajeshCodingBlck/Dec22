package Lec4;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int row=1;
		   int nsp=0;
		   int nst=5;
		   
		   while(row<=5) {
			   
			   // work
			   // work for Space
			   int i=1;
			   while(i<=nsp) {
				   System.out.print(" "+" ");
				   i=i+1;
			   }
			   
			   // work for Star
			   int j=1;
			   while(j<=nst) {
				   System.out.print("*"+" ");
				   j=j+1;
			   }
			   
			   // Preparation for Next row
			   nst=nst-1;
			   nsp= nsp+2;
			   row=row+1;
			   System.out.println();
		   }
		}
	
	}


