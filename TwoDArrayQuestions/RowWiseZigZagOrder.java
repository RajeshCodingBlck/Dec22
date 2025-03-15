package TwoDArrayQuestions;

public class RowWiseZigZagOrder {

	public static void reverse(int [] arr) {
		
		int i=0;
		int j= arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][] arr= {
    		{1,2,3,4},
    		{5,6,7,8},
    		{10,11,12,13},
    		{14,15,16,17}
        };
    
//      for(int i=0;i<arr.length;i++) {
//    	  
//    	   if(i%2==0) { // even
//    		   for(int j=0; j<arr[0].length; j++) {
//    			   System.out.print(arr[i][j]+" ");
//    		   }
//    	   }else {// odd
//    		   for(int j=arr[0].length -1; j>=0; j--) {
//    			   System.out.print(arr[i][j]+" ");
//    		   }
//    	   }
//      }
    
       for(int i=0;i<arr.length;i++) {
    	   if(i%2==0) {
    		   continue;
    	   }else {
    		   reverse(arr[i]);
//    		   int p1=0;
//    		   int p2=arr[0].length-1;
//    		   while(p1<=p2) {
//    			   
//    			   int temp=arr[i][p1];
//    			   arr[i][p1]=arr[i][p2];
//    			   arr[i][p2]=temp;
//    			   p1++;
//    			   p2--;
//    		   }
    		   
    	   }
       }
       
       for(int i=0;i<arr.length;i++) {
     	  for(int j=0; j<arr[i].length;j++) {
     		 System.out.print(arr[i][j]+" ");
     	  }
     	  System.out.println();
       }
      
      
	}

}
