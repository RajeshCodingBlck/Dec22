package Recursion;

public class PrintNaturalNumber {

	public static void printInc(int n) {

//		if(n==1) {
//			System.out.println(1);
//			return;
//		}

		if (n == 0) {
			return;
		}

		printInc(n - 1);
		System.out.println(n);

	}

	public static void printDec(int n) {

//		if(n==1) {
//			System.out.println(1);
//			return;
//		}

		if (n == 0) {
			return;
		}

		System.out.println(n);
		printDec(n - 1);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printInc(5);

	}

}
