package FunctionDemo;

public class Demo2 {

	public static void add() {
		System.out.println("add is Start");
		int a=1;
		int b=99;
		int ans= a+b;
		sub();
		System.out.println("add is End");
	}
	public static void sub() {
		System.out.println("sub is Start");
		int a=1;
		int b=99;
		int ans= a-b;
		
		System.out.println("sub is End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Main is Start");
         add();
         System.out.println("Main is End");
	}

}
