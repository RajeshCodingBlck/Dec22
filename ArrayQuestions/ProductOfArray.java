package ArrayQuestions;

public class ProductOfArray {
    
	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        
	      int [] ans= new int[nums.length];
	      int n= nums.length;
	      int [] left= new int[nums.length];
	      left[0]=1;
	      for(int i=1;i<nums.length;i++){
	        left[i]= left[i-1]*nums[i-1];
	      }

	      int [] right= new int[nums.length];
	      right[nums.length-1]=1;
	      for(int i=n-2; i>=0;i--){
	        right[i]= right[i+1]*nums[i+1];
	      }

	      for(int i=0;i<n;i++){
	         ans[i]= left[i]*right[i];
	      }
	      return ans;

	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
