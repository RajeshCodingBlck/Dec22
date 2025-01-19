package MathProblem2_lec_7;

public class reverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n= 12345;
        
        int ans=0;
        while(n !=0) {
        	int ld= n%10;
        	ans= ans*10+ld;
        	n=n/10;
        }
        System.out.println(ans);
	}

}
