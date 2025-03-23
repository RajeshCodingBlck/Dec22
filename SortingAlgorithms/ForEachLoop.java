package SortingAlgorithms;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 int [] arr= {1,10,3,2,10,3,2};
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 System.out.println("..................");
		 for ( int val : arr) {
			 System.out.print(val+" ");
		 }
		 
		 
		 String [] brr= {"abc", "def", "gfd"};
		 
		 System.out.println();
		 System.out.println("..................");
		 for ( String str: brr) {
			 System.out.println(str);
		 }
		 
		 String str ="abcdef";
		 for( char ch: str.toCharArray()) {
			 System.out.print(ch+" "); 
		 }
		 
		 System.out.println();
		 System.out.println("..................");
		 
		 int [][] mat= new int[4][5] ;
		 
		 for (int []  row : mat) {
			for(int val : row) {
				System.out.print(val+" ");
			}
			System.out.println();
		 }
		 
		 
		 
		 
		 
	}

}
