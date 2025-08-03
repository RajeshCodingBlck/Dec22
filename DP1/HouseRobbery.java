package DP1;

public class HouseRobbery {

	
	public static int helper(int []nums, int i, int [] dp){

	       if(i>=nums.length){
	            return 0;
	       }

	        if(dp[i] !=-1){
	            return dp[i];
	        }
	        // ith House par chori nahi karenge
	         int chhotaAns1= helper(nums, i+1, dp);

	        // ith House par chori karenge.
	        int chhotaAns2= nums[i]+ helper(nums, i+2, dp);

	        int meraAns= Math.max(chhotaAns1, chhotaAns2);
	        dp[i]= meraAns;
	        return meraAns;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] nums= {1,2,3,4};
		 int [] dp= new int[nums.length];

	        for(int i=0;i<nums.length;i++){
	             dp[i]=-1;
	        }
	        
	       int ans= helper(nums, 0, dp);
	       System.out.println(ans);
	       
	}

}
