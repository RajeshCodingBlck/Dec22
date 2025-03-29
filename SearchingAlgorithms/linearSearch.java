package SearchingAlgorithms;

public class linearSearch {

	
	public static int linearSearch(int [] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {1,3,2,4,6,5};
         System.out.println(linearSearch(arr, 40));
	}

}
