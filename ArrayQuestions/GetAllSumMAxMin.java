package ArrayQuestions;

public class GetAllSumMAxMin {

	public static int [] getSumMaxMin(int [] arr){
		
		int sum=arr[0];
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int [] ans= new int[3];
		ans[0]=sum;
		ans[1]=max;
		ans[2]=min;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5};
//       int [] ans= getSumMaxMin(arr);
//       System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
       System.out.println(getSumMaxMin(arr));
	}

}
