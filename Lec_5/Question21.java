package Lec_5;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int row=1;
		
		int leftStar=1;
		int rightStar=1;
		int space=7;
		
		while(row<=5) {
			
			// work
			int i=1;
			while(i<=leftStar) {
				System.out.print("*"+" ");
				i=i+1;
			}
			// Space
			int j=1;
			while(j<=space) {
				System.out.print(" "+" ");
				j=j+1;
			}
			// rightStar
			int k=1;
			
			if(row==5) {
				k=2;
			}
			while(k<=rightStar) {
				System.out.print("*"+" ");
				k=k+1;
			}
			
			// preparation for next row
			leftStar=leftStar+1;
			rightStar=rightStar+1;
			space= space-2;
			
		    row=row+1;
		    System.out.println();
		}
	}

}
