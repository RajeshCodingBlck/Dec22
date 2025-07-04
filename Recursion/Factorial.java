package Recursion;

public class Factorial {

	
	// Take n and return n!
	public static int fact(int n) {
		
		 
		 if(n==0) {
				return 1;
		  }
		
		  int chhotaAns = fact(n-1);
		  int MeraAns= chhotaAns*n;
		  return MeraAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		System.out.println(fact(5));
		
	}

}
