package FunctionDemo;

public class TakeSomethigAndReturSomething {

	
	public static int  fun(int a){
        if(a==12){
            return 100;
        }else{
            return 200;
        }
    }
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int a=12;
//      int b=13;
////      System.out.println("🌝");
//      System.out.println(add(a,b));
		
		 System.out.println("Main is Start");
	        fun(12);
	        System.out.println("Main is End");
	}

}
