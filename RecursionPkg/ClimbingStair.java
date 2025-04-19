package RecursionPkg;

public class ClimbingStair {

	static int count=0;
	public static int  getPath(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			count++;
			return 1;
		}
//		if(n==1) {
//			System.out.println(ans+"1");
//			return;
//		}
		if(n<0) {
			return 0;
		}
		
		// 1 Ka kump
		int ans1=getPath(n-1,"1"+ans);
		// 2 ka jump
		int ans2=getPath(n-2, "2"+ans);
		
		int Meracount= ans1+ans2;
		return Meracount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int MeraCount= getPath(1, "");
        System.out.println("return type "+ MeraCount);
         System.out.println(count);
	}

}
