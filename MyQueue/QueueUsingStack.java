package MyQueue;

import java.util.*;

import StackQuestion.InsertAtBottom;

public class QueueUsingStack {

	Stack<Integer> st;

	QueueUsingStack() {
		st = new Stack();
	}

	public boolean isEmpty() {

		return st.isEmpty();
	}

	public void enqueue(int val) {
		InsertAtBottom.insertAtBottom2(st, val);
	}

	public void dequeue() {

		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		st.pop();
	}

	public int front() {
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return st.peek();
	}
	
	public String toString() {
		
		 return ""+st;
	}
	
	

}
