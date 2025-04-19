package RecursionPkg;

public class PrintAllPosibility {

	public static void getAll(int n, String ans) {
		
		  if(n==0) {
			  System.out.println(ans);
			  return;
		  }
		
		   getAll(n-1,ans+"H");
		   getAll(n-1, ans+"T");
		   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       getAll(3, "");
       
	}

}
