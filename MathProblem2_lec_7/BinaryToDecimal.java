package MathProblem2_lec_7;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n= 100;
		int ans=0;
		int placeValue=1;
		
		while(n !=0) {
			int lastDigit= n%10;
			ans= ans+ lastDigit*placeValue;
			n=n/10;
			placeValue= placeValue*2;
		}
		System.out.println(ans);
	}

}
