package Lec4;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=1;
		
		int nst=9;
		int nsp=0;
		
		while(row<=5) {
			
			// work
			// Work for Space
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+" ");
				i=i+1;
			}
			
			// Work for Star
			int j=1;
			while(j<=nst) {
				if(j%2 ==0) {
					System.out.print(" "+" ");
				}else {
					System.out.print("*"+" ");
				}
				j=j+1;
			}
			// preparation for Next Row
			nsp=nsp+1;
			nst=nst-2;

			row=row+1;
			System.out.println();
		}
	}

}
