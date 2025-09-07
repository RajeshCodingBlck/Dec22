package DP2;

public class NumberOfWays {

	public static int pathCount(int currRow, int currCol,
			int desRow, int desCol, int [][] dp) {
		
		if(currRow == desRow && currCol== desCol) { // +ve 
			return 1;
		}
		
		if(currRow> desRow || currCol > desCol) { // -ve Base Case
			return 0;
		}
		
		if(dp[currRow][currCol] !=0) {
			return dp[currRow][currCol];
		}
		
		// Right Move
		int ans1= pathCount(currRow, currCol+1, desRow, desCol, dp);
		
		// Down Move
		int ans2= pathCount(currRow +1, currCol, desRow, desCol, dp);
		
		
		int MeraAns= ans1+ans2;
		dp[currRow][currCol]= MeraAns;
		return MeraAns;
	}
	
	public static int countMethod2(int n, int m) {
		
		int [][] dp= new int[n][m];
		
//		dp[i][j]= (i,j) se (n-1, m-1) taak pahuchne ke ways.
				
		
		for(int i=0; i<n;i++ ) {
			dp[i][m-1]=1;
		}
		
		for(int j=0 ; j<m ;j++) {
			dp[n-1][j]=1;
		}
		
		for(int i=n-2;i>=0;i--) {
			
			for(int j=m-2;j>=0;j--) {
				
				dp[i][j]= dp[i+1][j] + dp[i][j+1];
			}
		}
		
		return dp[0][0];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] dp= new int[3][3];
		
		int ans= pathCount(0,0, 2,2, dp);
		System.out.println(ans);
		
	}

}
