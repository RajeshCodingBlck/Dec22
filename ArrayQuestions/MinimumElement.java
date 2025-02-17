package ArrayQuestions;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,3,-1,4,-10,5,6};
      
//      int AabhiTaakMinimum= arr[0];
//      for(int i=1;i<arr.length;i++) {
//    	  
//    	  if(arr[i]<AabhiTaakMinimum ) {
//    		  AabhiTaakMinimum=arr[i];
//    	  }
//      }
//      System.out.println(AabhiTaakMinimum);
      
      
      
      int AabhiTaakMinimum= Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++) { 
    	  if(arr[i]<AabhiTaakMinimum ) {
    		  AabhiTaakMinimum=arr[i];
    	  }
      }
      System.out.println(AabhiTaakMinimum);
	}

}
