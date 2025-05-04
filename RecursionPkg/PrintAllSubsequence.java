package RecursionPkg;

public class PrintAllSubsequence {

	public static void printAllSubsequence(String str, 
			String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		String subProblem= str.substring(1);
		char ch= str.charAt(0);
		
		// ch ko aapne subsequence ka Part banayo
		printAllSubsequence(subProblem, ans+ch);
		// ch ko aapne subsequence ka Part Nahi banayo
		printAllSubsequence(subProblem, ans+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllSubsequence("abc", "");
	}

}
