package SortingInRecursion;

public class MergerSort {

	
	public static int[] mergeTwoSortedArray(int [] arr1, 
			int [] arr2) {
		
		int n1= arr1.length;
		int n2= arr2.length;
		int [] result= new int[n1+n2];
		int index=0;
		
		int i=0; // Pointer for arr1
		int j=0; // Pointer for arr2
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				result[index]=arr1[i];
				index++;
				i++;
			}else {
				result[index]=arr2[j];
				index++;
				j++;
			}
		}
		while(i<arr1.length) {
			result[index]=arr1[i];
			i++;
			index++;
		}
		while(j<arr2.length) {
			result[index]=arr2[j];
			j++;
			index++;
		}
		
		return result;
		
	}
	public static int [] mergeSort(int [] arr, int s, int e) {
		
		if(s==e) {
			
			int [] baseCaseArray= new int[1];
			baseCaseArray[0]=arr[s];
			return baseCaseArray;
		}
		
		int mid= (s+e)/2;
		int [] left= mergeSort(arr,s, mid );
		int [] right=mergeSort(arr, mid+1, e);
		int [] result=mergeTwoSortedArray(left, right);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {3,1,4,2,1,5,3};
		int [] result=mergeSort(arr, 0, arr.length-1);
		for(int val :result) {
			System.out.print(val+" ");
		}
		
	}

}
