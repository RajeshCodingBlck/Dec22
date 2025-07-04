package MyQueue;

public class MyQueue {

	// State
	int frontIndex;
	int rearIndex;
	int [] arr;
	MyQueue(int size){
		arr= new int[size];
		frontIndex=-1;
		rearIndex=-1;
	}
	
	public boolean isEmpty() {
	   
//		if(frontIndex==-1 && rearIndex ==-1 ) {
//			return true;
//		}
//		return false;
		
		return frontIndex==-1 && rearIndex ==-1;
	}
	
	
	public boolean isFull() {
		
		if((rearIndex+1)%arr.length == frontIndex) {
			return true;
		}
		return false;
//		if(rearIndex== arr.length-1) {
//			 return true;
//		}
//		return false;
			
	}
	
	public void enqueue(int val) {
		
		
		if(isFull()) {
			System.out.println("Queue to bhar Gaya");
			return;
		}else if(isEmpty()) {
//			frontIndex++;
//			rearIndex++;
			frontIndex= (frontIndex+1)%arr.length;
			rearIndex= (rearIndex+1)%arr.length;
			arr[rearIndex]=val;
		}else {
//			rearIndex++;
			rearIndex= (rearIndex+1)%arr.length;
			arr[rearIndex]=val;
		}
	}
	
	
	public void dequeue() {
		
		if(isEmpty()) {
			
			return;
		}else if(frontIndex == rearIndex) {
			frontIndex=-1;
			rearIndex=-1;
		}else {
//			frontIndex++;
//			frontIndex%=arr.length;
			frontIndex= (frontIndex+1)%arr.length;
		}
		
	}
	
	
	public int front() {
		
		if(isEmpty()) {
			return -1;
		}else {
			return arr[frontIndex];
		}
	}
	
	
	
	
	
	
	
	
	
	
}
