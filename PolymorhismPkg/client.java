package PolymorhismPkg;


//"static void main" must be defined in a public class.

//class A{
// int a=12;
// void fun(){
//     System.out.println("hello from A");
// }
//}
//
//class B extends A{
// int a=13;
//  void fun(){
//     System.out.println("hello from B");
// }
//}
//
//
//public class Main {
// public static void main(String[] args) {
//    
//     A obj= new B();
//     System.out.println(((B)obj).a);
//     obj.fun();
//     
//     
// }
//}
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo obj = new Demo();
        obj.fun("1",2);
        
        
	}

}
