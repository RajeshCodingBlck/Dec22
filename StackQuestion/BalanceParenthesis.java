package StackQuestion;

import java.util.Stack;

public class BalanceParenthesis {

	public static boolean isBalance(String str) {
		
		
		Stack<Character> st= new Stack();
		
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(ch=='(') {
				st.push(ch);
			}else {
				if(st.isEmpty()) {
					return false;
				}else {
					st.pop();
				}
			}
		}
		
		return st.size()==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
