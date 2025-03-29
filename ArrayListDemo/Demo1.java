package ArrayListDemo;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<Integer>  arr= new ArrayList();
		System.out.println(arr);
		
		// CRUD
		// add the item
		arr.add(12);
		arr.add(10);
		arr.add(4);
		arr.add(15);
		System.out.println(arr);
		
		// Reading the Data		
		System.out.println(arr.get(1));
		System.out.println(arr.get(3));
		
	   System.out.println(arr);
	   
	   // Update the Data
	   arr.set(1, -100);
	   System.out.println(arr);
	   // removing the data 
	   arr.remove(1);
	   System.out.println(arr);
	}

}
