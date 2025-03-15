package TwoDArrayQuestions;

public class Transpose {

	public static int [][] helper(int [][] matrix) {
		 int noOfRows= matrix.length;
	        int noOfColumns= matrix[0].length;
	        int [][] transpose=new int[noOfColumns][noOfRows];

	        for(int i=0;i<matrix.length;i++){
	            for(int j=0;j<matrix[0].length;j++){
	                transpose[j][i]= matrix[i][j];
	            }
	        }
	        return transpose;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [][] arr= {
    		 {1,2,3,4},
    		 {5,6,7,8},
    		 {9,10,11,12}
        };
     int [][] transpose=helper(arr);
     
	} 

}
