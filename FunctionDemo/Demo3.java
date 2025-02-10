package FunctionDemo;

public class Demo3 {

	
	public static void add(int a, int b) {
		System.out.println("Add is Start");
		int ans=a+b;
		System.out.println(ans);
		System.out.println("Add is end");
	}
	public static void fun1(int a,int b) {
		System.out.println("fun1 is Start");
		int ans=a+b;
		substract();
		System.out.println(ans);
		System.out.println("fun1 is End");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Main is Start");
       int x=12;
       int y=13;
       add(x,y);
       System.out.println("Main is End");
       
	}
	public static void substract() {
		System.out.println("substract is Start");
		int a=12;
		int b=13;
		int ans= b-a;
		System.out.println(ans);
		System.out.println("substract is End");
	}

}
