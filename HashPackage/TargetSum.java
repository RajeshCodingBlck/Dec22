package HashPackage;

import java.util.*;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 1, 4, 2, 3, 5, 7 };

		HashMap<Integer, Integer> hm = new HashMap();
		HashSet<Integer> hs = new HashSet();

		int target = 700;

		for (int i = arr.length - 1; i >= 0; i--) {

			int secondValue = target - arr[i];
			if (hs.contains(secondValue)) {
				System.out.println("Mil gaya");
				return;
			}
			hs.add(arr[i]);
		}

		for (int i =0; i <arr.length; i++) {

			int firstValue = target - arr[i];
			if (hs.contains(firstValue)) {
				System.out.println("Mil gaya");
				return;
			}
			hs.add(arr[i]);
		}
		System.out.println("Nahi Mila Sorry ji");

	}

}
