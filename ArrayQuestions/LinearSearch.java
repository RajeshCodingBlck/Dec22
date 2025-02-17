package ArrayQuestions;

import java.util.Scanner;

public class LinearSearch {

	
	public static boolean isPresent(int [] arr, int target) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n=s.nextInt(); // Size of an Array
       int [] arr= new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=s.nextInt(); // element of an Array
       }
       int target=s.nextInt();
       
       boolean ans= isPresent(arr, target);
       System.out.println(ans);
	}

}
