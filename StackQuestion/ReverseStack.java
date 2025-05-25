package StackQuestion;

import java.util.Stack;

public class ReverseStack {

	
	public static void reverse(Stack<Integer> st) {
		
		if(st.size()==0) {
			return;
		}
		
		int topElement= st.pop();
		reverse(st);
		InsertAtBottom.insertAtBottom2(st, topElement);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st= new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
		
	}

}
