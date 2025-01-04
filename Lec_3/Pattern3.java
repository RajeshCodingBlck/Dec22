package Lec_3;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int row=1;
		while(row<=5) {

			int col=1;
			while(col<=(6-row)) {
				System.out.print("*");
				col=col+1;
			}
			
			
			System.out.println();
			row=row+1;
		}
	}

}
