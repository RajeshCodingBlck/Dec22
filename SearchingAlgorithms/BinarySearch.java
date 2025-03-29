package SearchingAlgorithms;

import java.util.Arrays;

public class BinarySearch {

	public static int BinarySearch(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				// return mid;
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;

	}

	public static int lastIndex(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				// return mid;
				ans = mid;
				//high = mid - 1;
				low=mid+1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 4, 5, 5, 6, 10 };
		Arrays.sort(arr);
		System.out.println(lastIndex(arr, 5));

	}

}
