package InterfacePackage;

import java.util.Arrays;
import java.util.Stack;

public class NgeInRightSide {

	
	public static int [] nge(int [] arr) {
		
		int[] result= new int[arr.length];
		Arrays.fill(result, -1);
		int n= arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n;j++) {
				if(arr[i]< arr[j]) {
					result[i]= arr[j];
					break;
				}
			}
		}
		return result;
		
	}
	
	public static int [] ngeMethod2(int [] arr) {
		
		int[] result= new int[arr.length];
		Arrays.fill(result, -1);
		int n= arr.length;
		
		Stack<Integer> st= new Stack();
		
		for(int i=n-1;i>=0;i--) {
			while(st.size()>0 && st.peek()< arr[i]) {
				st.pop();
			}
			
			if(st.size()==0) {
				result[i]=-1;
			}else {
				result[i]=st.peek();
			}
			// add the arr[i];
			st.push(arr[i]);
			
		}
		return result;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {5,3,6,4,1,2, 3,5};
      int [] result= ngeMethod2(arr);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(result[i]+" ");
      }
      
	}

}
