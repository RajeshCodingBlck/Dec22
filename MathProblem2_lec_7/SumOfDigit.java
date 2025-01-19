package MathProblem2_lec_7;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	    Scanner s= new Scanner(System.in);
	    int n= s.nextInt();
	    int sum=0;
	    while(n!=0) {
	    	int lastDigit= n%10;
	    	sum=sum+lastDigit;
	    	n=n/10;
	    }
	    System.out.println(sum);
	}

}
