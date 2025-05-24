package DynamicStackPkg;

import StackQuestion.MyStack;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyStack st= new DynoStack(5);
		
		st.push(12);
		st.push(2);
		st.push(120);
		st.push(13);
		st.push(14);
		st.push(15);
		
		System.out.println(st.peek());
		
	}

}
