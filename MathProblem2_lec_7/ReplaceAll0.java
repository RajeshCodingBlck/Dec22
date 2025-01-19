package MathProblem2_lec_7;

public class ReplaceAll0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n= 123002;
      int ans=0;
      int placeValue=1;
      while(n!=0) {
    	  int ld= n%10;  
    	  if(ld==0) {
    		  ld=9;
    	  }
    	  ans= ans+ ld*placeValue;
    	  n=n/10;
    	  placeValue= placeValue*10;
      }
      System.out.println(ans);
	}

}
