package StringDemo;

import java.util.Scanner;

public class PalindromicString {

	public static boolean isPalindromic(String str) {
		
		String revStr="";
		
		for(int i= str.length()-1 ; i>=0;i--) {
			
			char ch =str.charAt(i);
			revStr+=ch;
		}
		
//		if(str == revStr) {  ==  check the address  for Non premitive data type
//			return 
//		}
		
		if(str.equals(revStr)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean ispalindromicMethod2(String str) {
		
		
		int i=0;
		int j= str.length()-1;
		while(i<j) {
			
			char ch1= str.charAt(i);
			char ch2= str.charAt(j);
			
			if(ch1 != ch2) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		String str= s.next();
		System.out.println(isPalindromic(str));
		
		
	}

}
