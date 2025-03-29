package ArrayListDemo;

import java.util.*;
public class ReverseTheArrayList {

	public static void reverse(ArrayList<Integer> arr) {
		
		int i=0;
		int j= arr.size()-1;
		while(i<=j) {
			
			int temp= arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			
			i++;
			j--;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> arr= new ArrayList();
     Scanner s= new Scanner(System.in);
     int n= s.nextInt();
     for(int i=0;i<n;i++) {
    	 int val= s.nextInt();
    	 arr.add(val);
     }
//     reverse(arr);
     Collections.reverse(arr);
     Collections.sort(arr);
     System.out.println(arr);
     
	}

}
