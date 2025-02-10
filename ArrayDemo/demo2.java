package ArrayDemo;

import java.util.Scanner;

public class demo2 {

	public static void input(int [] arr) {
		
		int n=arr.length;
		Scanner s= new Scanner(System.in);
		for(int i=0; i<n;i++) {
			arr[i]=s.nextInt();
		}
	}
	public static void print(int [] arr) {
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int [] arr= new int [n];
		System.out.println(arr.length);
		input(arr);
		print(arr);
		
	}
}
