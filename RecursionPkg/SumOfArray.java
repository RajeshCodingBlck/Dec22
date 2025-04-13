package RecursionPkg;

public class SumOfArray {

	
	public static int getSum(int [] arr) {
		
		
		if(arr.length==1) {
			return arr[0];
		}
		
		if(arr.length==0) {
			return 0;
		}
		
		int [] smallerArray= new int [arr.length-1];
		for(int i=1;i<arr.length;i++) {
			 smallerArray[i-1]= arr[i];
		}
		
		int chhotaAns=getSum(smallerArray);
		int meraAns= arr[0]+ chhotaAns;
		return meraAns;
		
		
		
	}
	
	// Sum of Array which start from Index i. 
	public static int getSum(int [] arr, int i) {
		
		  if(i== arr.length-1) {
			   return arr[i];
		  }
//		  if(i== arr.length) {
//			  return 0;
//		  }
		
		  int chhotaAns =getSum(arr, i+1);
		  int meraAns= arr[i]+ chhotaAns;
		  return meraAns;
		  
		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {1,2,3,4,5};
		System.out.println(getSum(arr,0));
		
	}

}
