package SortingInRecursion;

public class PartitionAlgorithms {

	public static void partition(int [] arr, int pivot) {
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<pivot) {
				// work
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		
		 
	}
	
	public static int partition(int [] arr) {
		
		int n=arr.length;
		int pivot= arr[n-1];
		int index=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<pivot) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		
		// swap
		int temp=arr[index];
		arr[index]=arr[n-1];
		arr[n-1]=temp;
		
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,2,1,5,6,4};
      int pivot= 4;
     int pivotIndex= partition(arr);
     System.out.println(pivotIndex);
      for(int val : arr) {
    	  System.out.print(val+" ");
      }
      
	}

}
