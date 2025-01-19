package MathProblem2_lec_7;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		int n=132;
		int n=66;
		int ans=0;
		int placeValue=1;
		while(n>0) {
			int rem= n%2;
			ans= ans+ rem*placeValue;
			n=n/2;
			placeValue=placeValue*10;
		}
		System.out.println(ans);
	}

}
