package Recursion;

public class SumOfnaturalNumber {

	
	public static int sum(int n) { // n=5
		
		 if(n==1) { // +ve Base case
			  return 1;
		 }
		 
		 if(n==0) { // -ve Base case
			  return 0;
		 }
		
		 int chhotaAns= sum(n-1); // 4 -> 10
		 int meraAns= chhotaAns+n;
		 return meraAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum(5));
	}

}
