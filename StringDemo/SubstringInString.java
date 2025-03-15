package StringDemo;

public class SubstringInString {

	
	public static boolean ispalindromicMethod2(String str) {	
			int i=0;
			int j= str.length()-1;
			while(i<j) {
				
				char ch1= str.charAt(i);
				char ch2= str.charAt(j);
				
				if(ch1 != ch2) {
					return false;
				}else {
					i++;
					j--;
				}
			}
			
			return true;
		}
	public static void subStringPrint(String str) {
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				
				
				System.out.print("Cut is from ( "+ i+ " "+ j+" ) ");
				System.out.println(str.substring(i, j+1));
				
				if(ispalindromicMethod2(str.substring(i, j+1))) {
					System.out.print("Cut is from ( "+ i+ " "+ j+" ) ");
					System.out.println(str.substring(i, j+1));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str= "abba";
          subStringPrint(str);
	}

}
