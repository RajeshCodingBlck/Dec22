package DP1;

public class ClimbingStair {

	
	public static int getCount(int n, int [] dp) {
		
		
		 if(n==0) {
			 return 1;
		 }
		 if(n==1) {
			 return 1;
		 }
		 
		 if(dp[n] !=0) {
			 return dp[n];
		 }
		
		// 1 ka Jump 
		int chhotaAns1=getCount(n-1, dp);
		
		// 2 ka Jump
		int chhotaAns2=getCount(n-2, dp);
		
		int meraAns= chhotaAns1+ chhotaAns2;
		
		dp[n]= meraAns;
		return meraAns;
		
		
	}
	
	public static int getCountTabulation(int n) {
		
		int [] dp= new int[n+1];
		
//		dp[i]= No of ways to reach 0th stair from ith Stair
		
		dp[0]=dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			
			dp[i]= dp[i-1]+ dp[i-2];
		}
		
		return dp[n];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        int [] dp= new int[n+1];
        System.out.println(getCount(n, dp));
	}

}
