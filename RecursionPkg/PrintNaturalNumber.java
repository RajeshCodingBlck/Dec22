package RecursionPkg;

public class PrintNaturalNumber {

	
	public static void DecPrint(int n) {
		
//		 if(n==1) {  // +ve Base Case
//			 System.out.println(1);
//			 return;
//		 }
		 
		 if(n==0) {
			 return;
		 }
		 System.out.println(n);
		 DecPrint(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 DecPrint(5);
	}

}
