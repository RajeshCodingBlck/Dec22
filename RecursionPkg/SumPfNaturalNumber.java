package RecursionPkg;

public class SumPfNaturalNumber {

	public static int sumOfNaturalNumber(int n) {
		
		if(n==1) { // Valid SubProblem 
			return 1;   // +ve Base 
		}
		
		if(n==0) {
			return 0;
		}
		
		int chhotaAns= sumOfNaturalNumber(n-1);
		int meraAns= n+ chhotaAns;
		return meraAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(sumOfNaturalNumber(5));
	}

}
