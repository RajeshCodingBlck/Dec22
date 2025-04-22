package DoubtClassAssingment2;

public class BostonNumber {
   
//	import java.util.*;
//	public class Main {
//
//	   
//	   public static int digitSum(int n){
//
//	        int sum=0;
//	        while(n>0){
//	            sum+= n%10;
//	            n=n/10;
//	        }
//	        return sum;
//	   }
//	    
//	    public static boolean isPrime(int n){
//
//	        for(int i=2;i<n;i++){
//	             
//	             if(n%i==0){
//	                 return false;
//	             }
//	        }
//	        return true;
//	    }
//	    public static int sumOfDigitOfPrime(int n){
//	     
//	       int sum=0;
//	      for(int i=2;i<=n;i++){
//	           if(n%i==0 && isPrime(i)==true ){
//	              
//	               int count=0;
//	               while(n%i ==0){
//	                   count++;
//	                   n=n/i;
//	               }
//	           sum= sum+ digitSum(i)*count;
//	           }
//	      }
//	      return sum;
//	    }
//	    public static void main(String args[]) {
//	       
//	       Scanner s= new Scanner(System.in);
//	       int n= s.nextInt();
//
//	       int DigitSumOf_N= digitSum(n);
//	       int sumOfPrimeDigit= sumOfDigitOfPrime(n);
//
//	       if(DigitSumOf_N == sumOfPrimeDigit){
//	           System.out.println(1);
//	       }else{
//	           System.out.println(0);
//	       }
//
//
//	    }
//	}
}
