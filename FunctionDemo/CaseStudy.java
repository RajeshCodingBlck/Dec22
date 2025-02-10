package FunctionDemo;

public class CaseStudy {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		  public static void fun(int a){
//		        System.out.println("fun is Start");
//		        a++;
//		        System.out.println("fun is End");
//		        
//		    }
//		    public static void main(String[] args) {
//		       System.out.println("Main is Start");
//		        fun();
//		        System.out.println("Main is End");
//		        
//		    }
//		// eror due fun();
//        ^
//  required: int
//  found:    no arguments
//  reason: actual and formal argument lists differ in length
		
		
//		Case Study 2
//		public static void fun(int a){
//	        System.out.println("fun is Start");
//	        a++;
//	        System.out.println("fun is End");
//	        return ; 
//	    }
//	    public static void main(String[] args) {
//	       System.out.println("Main is Start");
//	        fun(12);
//	        System.out.println("Main is End");
//	        
//	    }
//		Work fine .
		
		
		// Case Study 3
//		public static int  fun(int a){
//	        if(a==12){
//	            return 100;
//	        }
//	        System.out.println("fun is Start");
//	        a++;
//	        System.out.println("fun is End");
//	    }
		// Error because of conditional return...
//		Compiler need confirm return statement.
		
		// Case Study 4
//		public static int  fun(int a){
//	        if(a==12){
//	            return 100;
//	        }
//	        
		    // This is reachable code.
//	        System.out.println("fun is Start");
//	        a++;
//	        System.out.println("fun is End");
//	        return 12;
//	        
//	    }
		
		// work fine . if there is change of reaching any code. then it means it is reachable code.
		
		
//		public static void swap(int a, int b){
//	         int temp=a;
//	         a=b;
//	         b=temp;
//	    }
//	    public static void main(String[] args) {
//	       int a=12;
//	       int b=13;
//	       System.out.println("Before Swap "+a+" "+b);
//	       swap(a,b);
//	       System.out.println("After Swap "+a+" "+b);
//	    }
		
		// Stack ke Ander change Persist nahi karte.
		
		
	}

}
