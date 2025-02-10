package ArrayQuestions;

import java.util.Scanner;

public class SumOfArray {

	public static int getSum(int [] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       int [] arr= new int[n];
       for(int i=0;i<arr.length;i++) {
    	   arr[i]=s.nextInt();
       }
       int sum= getSum(arr);
       System.out.println(sum);
	}

}
