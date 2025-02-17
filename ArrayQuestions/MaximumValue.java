package ArrayQuestions;

public class MaximumValue {

	public static int  maxElement(int [] arr) {
		
		int ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(ans< arr[i]) {
				ans=arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,3,2,5,10,3};
       int maxElement=maxElement(arr);
       System.out.println(maxElement);
	}

}
