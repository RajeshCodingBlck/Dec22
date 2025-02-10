// "static void main" must be defined in a public class.
public class Main {
    
    
    public static void swap(int []a, int [] b){
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
    }
    public static void main(String[] args) {
     int [] a={1,2,3};
     int [] b={10,12,13};
     System.out.println("Before Swap "+a[0]+" "+b[0]);
     swap(a,b);
     System.out.println("Before Swap "+ a[0]+" "+b[0]);
    }
    // Swap in a and b because change  persist when we do change in Heap.
}
