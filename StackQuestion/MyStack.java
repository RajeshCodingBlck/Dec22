package StackQuestion;

public class MyStack {

	 // state
	protected int topIndex;
	protected int [] arr;
	
	public MyStack(int size){
		 arr= new int [size];
		 topIndex=-1;
	 }
	
	  // behavour
	 
	 public boolean isEmpty() {
		 
//		 if(topIndex==-1) {
//			 return true;
//		 }
//		 return false;
		 
		 return topIndex==-1;
	 }
	 
	 public void push(int val) throws Exception {
		 
		 if(topIndex==arr.length-1) {
//			 System.out.println(" Kyu daal raha he");
			  throw new Exception("kyu daal rahe ho");
//			 return;
		 }
//		 topIndex++;
//		 arr[topIndex]=val;
		 arr[++topIndex]=val;
	 }

	 public void pop() {
		 
		 if(isEmpty()==true) {
			 System.out.println("kyu nikal raha he");
			 return;
		 }
		 topIndex--;
	 }
	 
	 
	 public int peek() {
		 
		 if(isEmpty()==true) {
			 System.out.println("kyu Dekh raha he");
			 return -1;
		 }
		 
		 return arr[topIndex];
		 
	 }
	 
	 
}
