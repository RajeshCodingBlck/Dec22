package ArrayQuestions;

public class PrintSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4};
      
      int sum=0;
      for(int st=0; st<arr.length;st++) {
    	  for(int ed= st; ed<arr.length;ed++) {
    		System.out.print(" Cut is from ( " +st+ " , " +ed +") ");
    		sum=0;
    		for(int k= st; k<=ed;k++) {
//    	    	 System.out.print(arr[k]+" ");
    	    	 sum+=arr[k];
    	     }
    		 
    	     System.out.println( "Sum is " +sum);
    	  }
      }
	}

}
