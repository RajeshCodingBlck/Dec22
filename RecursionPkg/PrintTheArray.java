package RecursionPkg;

public class PrintTheArray {

	
	public static void printArray(int [] arr, int i) {
		
		if(i== arr.length-1) { // +ve  Base case
			System.out.print(arr[i]);
			return;
		}
		
		if(i==arr.length) { // -ve Base 
			return;
		}
		System.out.print(arr[i]+" ");
		printArray(arr, i+1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,10,3,2};
        printArray(arr, 0);
        
	}

}
