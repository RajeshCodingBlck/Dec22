package DP1;

import java.util.*;
public class fibonacciNumber {

	public static int fibo(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		System.out.println(" n is " + n);
		int chhotaAns1 = fibo(n - 1);
		int chhotaAns2 = fibo(n - 2);
		int meraAns = chhotaAns1 + chhotaAns2;
		return meraAns;

	}

	public static int fibo(int n, HashMap<Integer, Integer> brain) {

		if (n == 0 || n == 1) {
			return n;
		}
		
		if(brain.containsKey(n)) {
			return brain.get(n);
		}

		System.out.println(" n is " + n);
		int chhotaAns1 = fibo(n - 1, brain);
		int chhotaAns2 = fibo(n - 2, brain);
		int meraAns = chhotaAns1 + chhotaAns2;
		brain.put(n, meraAns);
		return meraAns;

	}

	public static int fibo(int n,  int [] brain) {

		if (n == 0 || n == 1) {
			return n;
		}
		
		// Kaam karne se pehle check karo ki mera Answer ban chukka he ya nahi
		if(brain[n] !=0 ) {
			return brain[n];
		}

		System.out.println(" n is " + n);
		int chhotaAns1 = fibo(n - 1, brain);
		int chhotaAns2 = fibo(n - 2, brain);
		int meraAns = chhotaAns1 + chhotaAns2;
		// Store kar lo
		brain[n]=meraAns;
		return meraAns;

	}
	
	public static int fiboTabulation(int n) {
	
		
		int [] dp= new int[n+1];
		
		// dp[i]= Answer of ith Fibo Number.
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			
			//Transition State
			dp[i]= dp[i-1]+ dp[i-2];
		}
		// final Ans
		return dp[n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
//		HashMap<Integer, Integer> brain= new HashMap();
		
		int [] brain= new int[n+1];
		System.out.println(fibo(n, brain));
		

	}

}
