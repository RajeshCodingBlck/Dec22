package DoubtClass1;

public class Question19Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int row=1;
		
		int leftStar=4;
		int rightStar=4;
		int nsp=-1;
		
		while(row<=7) {
			
			// work
			  // LeftStar
			  int i=1;
			  while(i<=leftStar) {
				  System.out.print("*"+" ");
				  i=i+1;
			  }
			  
			  // work
			  int j=1;
			         
			  while(j<=nsp) {
				  System.out.print(" "+" ");
				  j=j+1;
			  }
			  
			  int k=1;
			  
			  if(row==1 || row==7) {
				  k=2;
			  }
			  
			  while(k<=rightStar) {
				  System.out.print("*"+" ");
				  k=k+1;
			  }
			  
			  // preparation for Next row
			  if(row<4) {
				  leftStar=leftStar-1;
				  rightStar=rightStar-1;
				  nsp= nsp+2;
			  }else {
				  leftStar=leftStar+1;
				  rightStar=rightStar+1;
				  nsp= nsp-2;
			  }
			  
			row=row+1;
			System.out.println();
		}
	}

}
