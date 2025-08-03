package MyPriorityQueue;

import java.util.PriorityQueue;

public class MinimumCostTOConnectNRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   int [] arr= {4,3, 2, 6};
	   
	   PriorityQueue<Integer> pq= new PriorityQueue();
	   
	   for(int val : arr) {
		   pq.add(val);
	   }
	   
	   int cost=0;
	   while(pq.size()>1) {
		   
		   int r1= pq.remove();
		   int r2= pq.remove();
		   
		   cost+= (r1+r2);
		   pq.add(r1+r2);
		   
	   }
	   System.out.println(cost);
	   
	   
	}

}
