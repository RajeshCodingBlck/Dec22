package StackQuestion;

import java.util.ArrayList;
import java.util.Stack;

public class InBuidStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<Integer> arr= new ArrayList();
		
		Stack<Integer> st= new Stack();
		
		st.push(12);
		st.push(13);
		System.out.println(st.peek());
		System.out.println(st.size());
		
		int popElement=st.pop();
		System.out.println(popElement);
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st.isEmpty());
		
		
		
		
	}

}
