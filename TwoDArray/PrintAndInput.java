package TwoDArray;

import java.util.Scanner;

public class PrintAndInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	  int [][] arr= new int[3][4];
	  Scanner s= new Scanner(System.in);
	  
	  System.out.println(arr.length);
	  System.out.println(arr[0].length);
	  
	  // row
	  for(int i=0;i<arr.length;i++) {
		  // col
		  for(int j=0;j<arr[0].length;j++) {
			  arr[i][j]= s.nextInt();
		  }
	  }
	  
	  // Row 
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0; j<arr[0].length;j++) {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	}

}
