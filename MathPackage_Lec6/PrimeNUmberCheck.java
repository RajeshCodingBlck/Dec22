package MathPackage_Lec6;

import java.util.Scanner;

public class PrimeNUmberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i=i+1) {
			
			if(n%i ==0) {
				count=count+1;
			}
			
			if(count>2) {
				break;
			}
		}
		if(count==2) {
			System.out.print("Prime");
		}else {
			System.out.print("Not Prime");
		}
		
	}

}
