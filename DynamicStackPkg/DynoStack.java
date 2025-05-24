package DynamicStackPkg;

import StackQuestion.MyStack;

public class DynoStack extends MyStack {

	DynoStack(int size) {
		super(size);	
	}

	 @Override
	public void push(int val) throws Exception{
		
		
		 if(super.topIndex== arr.length-1) {
			 
			int [] newArr= new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				newArr[i]=arr[i];
			}
			super.arr= newArr;
		 }
		 
//		 super.push(val);
		 topIndex++;
		 arr[topIndex]=val;
	}
	  
}
