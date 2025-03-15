package StringDemo;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str1= new String("Hello");
		String str2= new String("Hello");
		
		String str3="Hello";
		String str4= "Hello";
		
		if(str1==str2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if(str3==str4) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
		// Not Equal
		// Equal
//		== check the address 
		
		if(str1.equals(str2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		if(str3.equals(str4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		// Equal
		// Equal
//		.equals() always check the content of String
		
		
		
	}

}
