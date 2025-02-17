package ArrayQuestions;

import java.util.*;

public class RunningSum {

	public static int[] runningSum(int [] arr) {
		
		int n= arr.length;
		int [] ans= new int[n];
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0; j<=i;j++) {
				sum+=arr[j];
			}
			ans[i]=sum;
		}
		return ans;
	}
	public static int [] runningSum2(int [] arr) {
		
		int n=arr.length;
		int [] ans= new int [n];
		ans[0]=arr[0];
		for(int i=1;i<n;i++) {
			ans[i]=ans[i-1]+arr[i];
		}
		return ans;
	}
	public static int [] runningMax(int [] arr) {
		
		int n= arr.length;
		int [] ans= new int[n];
		ans[0]= arr[0];
		for(int i=1;i<n;i++) {
//			if(ans[i-1]> arr[i]) {
//				ans[i]=ans[i-1];
//			}else {
//				ans[i]=arr[i];
//			}
			ans[i]= Math.max(ans[i-1], arr[i]);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n= s.nextInt();
      int [] arr= new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]= s.nextInt();
      }
      int [] ans= runningSum2(arr);
      for(int i=0;i<ans.length;i++) {
    	  System.out.print(ans[i]+" ");
      }
     
	}

}
