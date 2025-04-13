package RecursionPkg;

public class Replace5with0 {

	public static String  replace(String str) {
		
		 if(str.length()==0) {
			 return "";
		 }
		 
		
		 String chhotaAns= replace(str.substring(1));
		 String meraAns="";
		 if(str.charAt(0)=='5') {
			 meraAns= '0'+ chhotaAns;
		 }else {
			 meraAns= str.charAt(0)+ chhotaAns;
		 }
		 return meraAns;
	}
	
	public static void replacemethod2(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		if(str.charAt(0)=='5') {
			ans= ans+"0";
		}else {
			ans= ans+ str.charAt(0);
		}
		replacemethod2(str.substring(1),ans);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="92595534";
//		 System.out.println(replace(str));
		 
		 replacemethod2(str, "");
		 
	}

}
