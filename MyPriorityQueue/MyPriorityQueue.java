package MyPriorityQueue;

import java.util.ArrayList;

public class MyPriorityQueue {

	// state
	ArrayList<Integer> arr;

	MyPriorityQueue() {
		arr = new ArrayList();
	}

	// ParentIndex

	public int getPI(int ci) {
		return (ci - 1) / 2;
	}

	// LeftIndex
	public int getLCI(int pi) {
		return 2 * pi + 1;
	}

	// RightChild Index
	public int getRCI(int pi) {
		return 2 * pi + 2;
	}

	
	public int peek() {
		
		if(arr.size()==0) {
			// throw Exception 
			return -1;
		}
		return arr.get(0);
	}
	
	public void add(int val) {
		
		arr.add(val);
		upHeapify(arr.size()-1);
	}

	private void upHeapify(int ci) {
		// TODO Auto-generated method stub
		
	   if(ci==0) {
		   return;
	   }
	   int pi= getPI(ci);
	   
	   if(arr.get(pi)> arr.get(ci)) {
		   int temp= arr.get(pi);
		   arr.set(pi, arr.get(ci));
		   arr.set(ci, temp);
		   upHeapify(pi);
	   }
	} 
	
	
}
