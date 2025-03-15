package StringDemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		int [] arr= new int[4];
//		System.out.println(arr);
//		String str = new String("Hello"); // String Object
//		System.out.println(str);
//		
//		String str2= "Hello";  // String literal
//		System.out.println(str2);
		
		
//		Scanner s= new Scanner(System.in);
//		
//		String str= s.next(); // Take input of Single Word.
//		// s.nextLine(); Take input of Sentence.
//		System.out.println(str);
		
		// By default String always create in Heap .
		// .intern() help us to create String in String pool.
//		String str2= s.next().intern();
		
		// How we can access any index character.
//		 arr[i];
		
		  String str= "Rajesh"; 
		  System.out.println(str.charAt(0));
		  System.out.println(str.length());
		  
	}

}
