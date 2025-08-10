package DP2;

public class LCS {

	class Solution {

	    public int helper(int i, int j, String text1, String text2, int [][] dp){


	        if(i== text1.length() || j== text2.length()){
	            return 0;
	        }
	        char ch1= text1.charAt(i);
	        char ch2= text2.charAt(j);


	        if(dp[i][j] != -1){
	            return dp[i][j];
	        }

	        if(ch1==ch2){

	          int ans = 1+ helper(i+1, j+1, text1, text2, dp);
	           dp[i][j]=ans;
	          return ans;
	        }else{

	          int ans1= helper(i, j+1, text1, text2, dp);
	          int ans2= helper(i+1, j, text1, text2, dp);
	           dp[i][j]=Math.max(ans1, ans2);
	          return Math.max(ans1, ans2);
	        }
	    }
	    public int longestCommonSubsequence(String text1, String text2) {
	        
	       int [][] dp= new int[text1.length()][text2.length()];
	       
	       for(int i=0;i<text1.length();i++){
	          for(int j=0; j<text2.length();j++){
	              dp[i][j]=-1;
	          }
	       }

	       return helper(0,0, text1, text2, dp);       


	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
