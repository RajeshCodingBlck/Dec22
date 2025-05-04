package RecursionPkg;

import java.util.ArrayList;

public class SubSequenceOFArray {

	public static void getAll(int[] arr, int i, String ans) {

		if (i == arr.length) {
			System.out.println(ans);
			return;
		}

		// ith Index ko Pick karunga
		getAll(arr, i + 1, ans + arr[i] + ",");
		// ith Index ko pick nahi karunga
		getAll(arr, i + 1, ans + ",");

	}

	public static void getAll(int[] arr, int i, ArrayList<Integer> ans) {

		if (i == arr.length) {
			System.out.println(ans);
			return;
		}

		// ith Index ko Pick karunga
		ans.add(arr[i]);
		getAll(arr, i + 1, ans);

		ans.remove(ans.size() - 1);
		// ith Index ko pick nahi karunga
		getAll(arr, i + 1, ans);
	}

	public static void getAllSubsequence(int[] arr, 
			int i, ArrayList<Integer> ans,
			int targetSum, int currSum) {

		if(currSum> targetSum) {
			return ;
		}
		
		if (i == arr.length) {
//			if(currSum<=targetSum) {
//				System.out.println(ans);
//			}
			System.out.println(ans);
			return;
		}
		
		
		
		// ith Index ko Pick karunga
		ans.add(arr[i]);
		getAllSubsequence(arr, i + 1, ans, 
				targetSum, currSum+arr[i]);

		ans.remove(ans.size() - 1);
		// ith Index ko pick nahi karunga
		getAllSubsequence(arr, i + 1, ans, 
				targetSum, currSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 3, 2, 1 };
		int targetSum = 6;
		ArrayList<Integer> ans = new ArrayList();
//		getAll(arr, 0, ans);
		getAllSubsequence(arr, 0, ans, targetSum, 0);

	}

}
