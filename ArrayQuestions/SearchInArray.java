package ArrayQuestions;

public class SearchInArray {

	public static boolean isPresent(int [] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,12,1,3,4,6};
//		char [] arr= {'a', 'b', 'c'};
		System.out.println(arr);
//       int target=300;
//       System.out.println(isPresent(arr, target));
	}

}
