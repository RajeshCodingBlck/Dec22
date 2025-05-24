package InheritancePkg;

public class B extends A {

	int b=13;
	B(){
		super(12);
		System.out.println("B constructor is called");
		System.out.println(super.a);
	}
	
	
	
}
