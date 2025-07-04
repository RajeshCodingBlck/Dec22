package MyQueue;

import java.util.ArrayList;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		MyQueue q= new MyQueue(5);
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.enqueue(50);
//		q.dequeue();
//		q.dequeue();
////		q.dequeue();
//		q.enqueue(60);
//		System.out.println(q.front());
//		
//		System.out.println(q);
//		
//		String str="Hello";
//		System.out.println(str);
		
		
		
		QueueUsingStack q= new QueueUsingStack();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());
		
		System.out.println(q);
		
		
		Object obj;
//		
//		ArrayList<Integer> arr= new ArrayList();
//		arr.
		
	}

}
