package RecursionPkg;

public class fibonacciNumber {

	public static int fibo(int n) {
		
		 if(n==0) {
			 return 0;
		 }
		 if(n==1) {
			 return 1;
		 }
		 int ans1= fibo(n-1);
		 int ans2= fibo(n-2);
		 
		 int ans= ans1+ans2;
		 return ans;	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.out.println(fibo(5));
		
	}

}
