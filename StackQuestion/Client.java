package StackQuestion;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MyStack st= new MyStack(5);
		
		// add
		try {
			st.push(200);
			System.out.println(st.peek());
			st.push(300);
			System.out.println(st.peek());
			st.push(400);
			st.push(2000);
			st.push(4000);
			System.out.println(st.peek());
			st.push(-10);
		}catch(Exception e) {
			
			System.out.println("Ho gya resolve");
		}
		
		System.out.println("Hello");
		
//		int val= (int)(1e12);
//		int [] arr= new int[val];
//		System.out.println(arr[100]);
		
		
		
	}

}
