package ArrayQuestions;

public class ReverseTheArray {

	public static void reverse(int [] arr) {
		
//		for(int i=arr.length-1; i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		int n= arr.length;
		int [] temp= new int[n];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[index]=arr[i];
			index++;
		}
		
		for(int i=0; i<temp.length;i++) {
			arr[i]=temp[i];
		}
		
	}
	
	public static void reverse2(int [] arr) {
		
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,4,5,6};
        
        reverse2(arr);
       // System.out.println("\n...................");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
