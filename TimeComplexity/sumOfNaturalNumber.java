package TimeComplexity;

public class sumOfNaturalNumber {
   
	public static int sum(int n) {
		
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans+=i;
		}
		return ans;
	}
	
	public static int sumMethod2(int n) {
		
		
		return  n*(n+1)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   long start= System.nanoTime();
	   int ans= sum(100);
       System.out.println(ans);
       long end= System.nanoTime();
       System.out.println(end-start);
       
	}

}
