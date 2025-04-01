package SearchingAlgorithms;

public class Find_x_forGivenEquation {

	public static int getX(int N) {
		
		int low=0;
		int high=N;
		int ans=0;
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(mid*mid<=N) {
				ans= mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int N=1000;
		System.out.println(getX(N));
		System.out.println((int)Math.sqrt(N));
	}

}
