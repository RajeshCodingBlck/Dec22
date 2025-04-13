package RecursionPkg;

public class Factorial {

	
	// Take n return n!
	public static int Fact(int n) {
		
		 if(n==0) {
			 return 1;
		 }
		 int chhotaAns= Fact(n-1);
		 int meraAns= n*chhotaAns;
		 return meraAns;
		 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(Fact(5));
		
	}

}
