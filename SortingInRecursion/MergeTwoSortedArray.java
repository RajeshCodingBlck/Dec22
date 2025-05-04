package SortingInRecursion;

public class MergeTwoSortedArray {

	
	public static int[] mergeTwoSortedArray(int [] arr1, 
			int [] arr2) {
		
		int n1= arr1.length;
		int n2= arr2.length;
		int [] result= new int[n1+n2];
		int index=0;
		
		int i=0; // Pointer for arr1
		int j=0; // Pointer for arr2
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				result[index]=arr1[i];
				index++;
				i++;
			}else {
				result[index]=arr2[j];
				index++;
				j++;
			}
		}
		while(i<arr1.length) {
			result[index]=arr1[i];
			i++;
			index++;
		}
		while(j<arr2.length) {
			result[index]=arr2[j];
			j++;
			index++;
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr1= {1,2,3,4,5,100};
     int [] arr2= {2,3,4,5,10,13};
     
      int [] result= mergeTwoSortedArray(arr1, arr2);
      for(int  val : result) {
    	  System.out.print(val+" ");
      }
      
	}

}
