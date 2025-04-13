package RecursionPkg;

public class PrintTheString {

	public static void printTheString(String str, int i) {
		
		if(i== str.length() ) {
			return;
		}
		
		System.out.print(str.charAt(i));
		printTheString(str, i+1);
		
	}
	
	public static void printTheString(String str) {
		
		if(str.length()==0) {
			return ;
		}
		System.out.print(str.charAt(0));
		printTheString(str.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printTheString("abcdef");
		
	}

}
