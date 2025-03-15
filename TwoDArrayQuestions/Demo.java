package TwoDArrayQuestions;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][] arr= new int[3][4];
     
     // No of rows
      System.out.println(arr.length);
      // No of colums
      System.out.println(arr[0].length);
      
      Scanner s= new Scanner(System.in);
      // Input 
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0; j<arr[i].length;j++) {
    		  arr[i][j]= s.nextInt();
    	  }
      }
      
      // print
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0; j<arr[i].length;j++) {
    		 System.out.print(arr[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
	}

}
