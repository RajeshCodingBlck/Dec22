package StackQuestion;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {

	
	public static void insertAtBottom(Stack<Integer> st, int val) {
		
		Stack<Integer> newst= new Stack();
		
		while(st.size()>0) {
			int topElement= st.pop();
			newst.push(topElement);
		}
		
		st.push(val);
		
		while(newst.size()>0) {
			int ele= newst.pop();
			st.push(ele);
		}
		
		
	}
	
	public static void insertAtBottom2(Stack<Integer> st, int val) {
		
		if(st.size()==0) {
			st.push(val);
			return;
		}
		
		int topElement= st.pop();
		insertAtBottom2(st,val);
		st.push(topElement);
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st=new Stack();
		
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int ele= s.nextInt();
			st.push(ele);
		}
		System.out.println(st);
//		insertAtBottom(st,100);
		insertAtBottom2(st,100);

		System.out.println(st);
		
		
		
	}

}
