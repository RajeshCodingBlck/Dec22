package RecursionPkg;

public class RecursionOn2DArray {

	public static void getPath(int currRow, int currCol, 
			int desRow, int desCol,String ans) {
		
		if(currRow==desRow && currCol==desCol) {
			System.out.println(ans);
			return;
		}
		
		if(currRow> desRow || currCol>desCol) {
			return ;
		}
		
		// right Move
		getPath(currRow, currCol+1 ,desRow, desCol, ans+"R");
		
		// Down Move
		getPath(currRow+1, currCol ,desRow, desCol, ans+"D");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getPath(0,0,2,2,"");
	}

}
