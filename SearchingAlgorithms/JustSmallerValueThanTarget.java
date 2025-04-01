package SearchingAlgorithms;

public class JustSmallerValueThanTarget {

	public static int justSmaller(int [] arr, int target) {
		
		
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]<target) {
				ans= arr[mid];
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,3,5,7,10,13,15,19};
     System.out.println(justSmaller(arr, -1));
	}

}
