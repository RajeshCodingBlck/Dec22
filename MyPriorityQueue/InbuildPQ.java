package MyPriorityQueue;

import java.util.PriorityQueue;

public class InbuildPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq= new PriorityQueue();
		
		pq.add(-1*1);
		pq.add(-1*4);
		pq.add(-1*20);
		pq.add(-1 *-3);
		
		
		System.out.println(-1 *pq.peek());
		pq.remove();
		System.out.println(-1*pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.size());
		
		
		
	}

}
