package DoubtClass1;

import java.util.Scanner;

public class CodeSubmitInHackerBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       
       int row=1;
       int nsp=-1;
       int leftStar=(n+1)/2;
       int rightStar=(n+1)/2;
       while(row<=n) {
    	   // work
    	   // Print leftStar
    	   int i=1;
    	   while(i<=leftStar) {
    		   System.out.print("*"+"\t");
    		   i=i+1;
    	   }
    	   // print Space
    	   int j=1;
    	   while(j<=nsp) {
    		   System.out.print(" "+"\t");
    		   j=j+1;
    	   }
    	   // print RightStar
    	   int k=1;
    	   if(row==1 || row==n) {
    		   k=2;
    	   }
    	   while(k<=rightStar) {
    		   System.out.print("*"+"\t");
    		   k=k+1;
    	   }
    	   // Preparation for Next Row
    	   if(row <(n+1)/2) {
    		    leftStar-=1;
    		    rightStar-=1;
    		    nsp+=2;
    	   }else {
	    		leftStar+=1;
	   		    rightStar+=1;
	   		    nsp-=2;
    	   }
    	   
    	   row=row+1;
    	   System.out.println();
       }
      
	}

}
