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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] dp= new int[3][3];
		
		int ans= pathCount(0,0, 2,2, dp);
		System.out.println(ans);
		
	}

}
