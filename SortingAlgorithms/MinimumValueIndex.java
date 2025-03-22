package SortingAlgorithms;

public class MinimumValueIndex {

	
	public static int minValueIndex(int [] arr) {
		
		  int minValue=arr[0];
		  int index=0;
		  
		  for(int i=1;i<arr.length;i++) {
			  
			  if(arr[i]< minValue) {
				  minValue=arr[i];
				  index=i;
			  }
		  }
		  return index;
	}
	
	public static int minValueIndex(int [] arr, int l, int r) {
		
		 int minValue=arr[l];
		 int index=l; // minimum Value ka index
		 
		 for(int i= l+1;i<=r;i++) {
			  if(arr[i]< minValue) {
				  minValue=arr[i];
				  index=i;
			  }
		 }
		 return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,-1,4,7,10,2};
       System.out.println(minValueIndex(arr, 3,5));
       
       
	}

}
