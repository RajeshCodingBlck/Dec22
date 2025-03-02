package ArrayQuestions;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {1,2,3,4};
	      
	      int sum=0;
	      int totalSum=0;
	      for(int st=0; st<arr.length;st++) {
	    	  sum=0;
	    	  for(int ed= st; ed<arr.length;ed++) {
	    		//System.out.print(" Cut is from ( " +st+ " , " +ed +") ");
	    		  sum+=arr[ed];
	    		  totalSum+=sum;
	    	     System.out.println( "Sum is " +sum);
	    	  }
	      }
	      
	      System.out.println(totalSum);
	}

}
