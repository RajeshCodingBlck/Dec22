package TwoDArrayQuestions;

public class TransposeForSqaureMatrix {

	public static void tranpose(int [][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr[0].length;j++) {
				
//				if(j<i) {
//					continue;
//				}
				//System.out.println("( "+ i+ " "+j +" ) "+ "Swap with "+ "( "+ j +" "+i+" )");
				
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] [] arr= {
    		   {1,2,3,4},
    		   {5,6,7,8},
    		   {9,10,11,12},
    		   {13,14,15,16}
       };
       tranpose(arr);
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0; j<arr[0].length;j++) {
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
       int p1=0;
       int p2= arr.length-1;
       while(p1<p2) {
    	   int [] temp=arr[p1];
    	   arr[p1]=arr[p2];
    	   arr[p2]=temp;
    	   p1++;
    	   p2--;
       }
       System.out.println("...................................");
       for(int i=0;i<arr.length;i++) {
    	   for(int j=0; j<arr[0].length;j++) {
    		   System.out.print(arr[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
       
       
	}

}
