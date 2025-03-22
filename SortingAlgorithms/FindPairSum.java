package SortingAlgorithms;

import java.util.Arrays;

public class FindPairSum {

	public static boolean pairSum(int [] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				System.out.println(i+ " "+ j+ "  , "+ arr[i]+" , "+ arr[j]);
			   if(arr[i]+arr[j]==target) {
				   return true;   
			   }
			}
		}
		return false;
	}
	
	public static boolean pairSumMethod2(int [] arr, int target) {
		
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			
			int sum=arr[i]+arr[j];
			
			if(sum==target) {
				return true;
			}else if(sum<target) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4,5};
      System.out.println(pairSum(arr,10));
      
	}

}
