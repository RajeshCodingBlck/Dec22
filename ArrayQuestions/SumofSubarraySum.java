package ArrayQuestions;

public class SumofSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,1,2};
      
      int sum=0;
      for(int i=0;i<arr.length;i++) {
    	   
    	  int currValContribution= arr[i]*(i+1)*(arr.length-i);
          sum+=currValContribution;
      }
      System.out.println(sum);
	}

}
