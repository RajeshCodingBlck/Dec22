package Lec_5;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int row=1;
		int nst=1;
		int nsp=4;
		
		
		
		while(row<=5) {
			
			// work
			int i=1;
			while(i<=nsp) {
				System.out.print(" "+"\t");
				i=i+1;
			}
			// Star
			int j=1;
			int count=1;
			while(j<=nst) {
				System.out.print(count+"\t");
				
				if(j<(nst+1)/2) {
					count++;
				}else {
					count--;
				}
				j=j+1;
			}
			
			// preparation
			nst=nst+2;
			nsp=nsp-1;
			row=row+1;
			System.out.println();
		}
	}

}
