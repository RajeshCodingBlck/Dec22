package ArrayDemo;

import java.util.Scanner;

public class InputandPrintTheArray {

	public static void input(int [] arr) {
		
		Scanner s= new Scanner(System.in);
		for(int i=0; i<5;i++) {
			arr[i]=s.nextInt();
		}
		
	}
	public static void Print(int [] arr) {
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner s= new Scanner(System.in);
	   int [] arr= new int[5];
	   input(arr);
	   Print(arr);
//       arr[0]=s.nextInt();
//       arr[1]=s.nextInt();
//       arr[2]=s.nextInt();
//       arr[3]=s.nextInt();
//       arr[4]=s.nextInt();
       
//       for(int i=0; i<5;i++) {
//    	   arr[i]=s.nextInt();
//       }
//       for(int i=0;i<5;i++) {
//    	   System.out.print(arr[i]+" ");
//       }
       
         
       
       
	}

}
