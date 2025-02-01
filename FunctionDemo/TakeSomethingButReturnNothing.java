package FunctionDemo;

public class TakeSomethingButReturnNothing {

	public static void add(int x, int y) {
		System.out.println("Add is Start");
		int ans=x+y;
		System.out.println(ans);
		System.out.println("Add is End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main is Start");
        int a=12;
        int b=13;
        add(b,a);
        System.out.println("Main is End");
	}

}
