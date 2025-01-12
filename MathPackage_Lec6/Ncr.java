package MathPackage_Lec6;

import java.util.Scanner;

public class Ncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int r= s.nextInt();
		
		int nFactorial=1;
		int rFactorial=1;
		int nMinusrFactorial=1;
		
		for(int i=1; i<=n;i=i+1) {
			nFactorial= nFactorial*i;
		}
		
		for(int i=1;i<=r;i=i+1) {
			rFactorial=rFactorial*i;
		}
		
		for(int i=1; i<=(n-r);i=i+1) {
			nMinusrFactorial= nMinusrFactorial*i;
		}
		
		int ncr= nFactorial/ (nMinusrFactorial*rFactorial);
		System.out.println(ncr);
		
		
		
		
		
	}

}
