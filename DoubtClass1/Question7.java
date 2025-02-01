 package DoubtClass1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int row=1;
		
		int leftStar=1;
		int rightStar=1;
		int nsp=3;
		while(row<=5) {
			// work
			if(row==1 || row==5) {
				int i=1;
				while(i<=5) {
					System.out.print("*"+" ");
					i=i+1;
				}
			}else {
				// leftStar
				int i=1;
				while(i<=leftStar) {
					System.out.print("*"+" ");
					i=i+1;
				}
				
				// Space
				int j=1;
				while(j<=nsp) {
					System.out.print(" "+" ");
					j=j+1;
				}
				// rightStar
				int k=1;
				while(k<=rightStar) {
					System.out.print("*"+" ");
					k=k+1;
				}
				
				// preparation for Next Row
				
			}
			row=row+1;
			System.out.println();
		}
	}

}
