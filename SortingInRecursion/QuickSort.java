package SortingInRecursion;

public class QuickSort {

	public static int partition(int[] arr, int s, int e) {

		int n = arr.length;
		int pivot = arr[e];
		int index = s;
		for (int i = s; i < e; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}

		// swap
		int temp = arr[index];
		arr[index] = arr[e];
		arr[e] = temp;

		return index;
	}

	public static void quickSort(int[] arr, int s, int e) {

		
		if(s>=e) {
			return;
		}
		int PI=partition(arr, s, e);
		quickSort(arr,s, PI-1);
		quickSort(arr, PI+1, e);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 1, 5, 6, 4 };
		quickSort(arr, 0, arr.length - 1);
		for(int val :arr) {
			System.out.print(val+" ");
		}
		

	}

}
