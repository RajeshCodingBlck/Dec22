package SortingAlgorithms;

public class InsertionSortedAlgo {

	
	public static void insertAtCorrectPosition(int arr[] , int i,int temp) {
		
		while(i>=0 && arr[i]>temp ) {
			// shift
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {3,1,4,2,6,2};
       
       for(int i=0;i<arr.length-1;i++) {
    	   
    	   insertAtCorrectPosition(arr, i, arr[i+1]);
       }
       
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
