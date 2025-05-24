package PolymorhismPkg;

public class Demo {

	
	
	public void fun(int a) {
		System.out.println("fun is called "+a);
	}
	
	public void fun(int a, int b) {
		System.out.println("Hello World");
	}
	
	public void fun(String a, int c) {
		System.out.println("Hello World from " +a+ " "+c);	
	}
	
	
	public void fun(int c, String a) {
		System.out.println("Hello World from " +a+ " "+c);
	}
	
	
//	public int fun(int c, String a) {
//		System.out.println(123);
//	}  // this is not Method overloading...
	
	
}
