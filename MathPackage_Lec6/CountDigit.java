package MathPackage_Lec6;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		int n=123453;
		int count=0;
		
//		 System.out.println(n/10);
//		 System.out.println(n);
		
//		while(n>0) {
//			n=n/10;
//			count++;
//		     
//		}
		for(int n=123453;n>0;n=n/10;) {
			count++;
		}
		System.out.println(count);
		 
	}

}
