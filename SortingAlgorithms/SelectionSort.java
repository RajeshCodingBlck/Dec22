package SortingAlgorithms;

import java.util.*;

public class SelectionSort {

	
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
	public static void selectionSort(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int index= minValueIndex(arr, i, arr.length-1);
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {4,3,1,2,7,5};
		
		Arrays.sort(arr);
//		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}

}
