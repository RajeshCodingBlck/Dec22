package MyPriorityQueue;

import java.util.PriorityQueue;

public class HeepSort {
   
	
	public static void main(String [] args) {
		int [] arr= {3,2,1,5,3,7,10,2};
		
		PriorityQueue<Integer> pq= new PriorityQueue();
		
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= pq.peek();
			pq.remove();
		}
		
		for(int val : arr) {
			System.out.print(val+" ");
		}
		
	}
}
