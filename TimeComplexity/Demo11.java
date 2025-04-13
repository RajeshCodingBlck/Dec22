package TimeComplexity;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=10000000;
        
        for(int i=1;i<=n;i++) {
        	System.out.println("Hello");
        }
        // TC -> O(n)
        
        for(int i=1;i<=n;i+=2) {
        	System.out.println("Hello");
        }
        
//        TC -O(N)
        
        for(int i=1;i<=n;i*=2) {
        	System.out.println(i);
        }
        
//        TC O(logn base 2)
        
        for(int i=n; i>=1;i/=2) {
        	System.out.println("Hello");
        }
        
//        int j=1;
//        while(j<=n) {
//        	System.out.print("Hello");
//        	j=j*2;
//        	j=j*3;
//        }
        
        for(int i=1;i<=n;i++) {
        	for(int j=1; j<=n;j++) {
        		  System.out.println("Hello");
        	}
        }
        
        
        for(int i=1;i<=n;i++) {
        	for(int j=1; j<=n;j=j*2) {
        		  System.out.println("Hello");
        	}
        }
        
        for(int i=1;i<=n;i=i*2) {
        	for(int j=1; j<=n;j=j*2) {
        		  System.out.println("Hello");
        	}
        }
        
        for(int i=1;i<=n;i++) {
        	for(int j=1; j<=i;j++) {
        		  System.out.println("Hello");
        	}
        }
        
        for(int i=1;i<=n;i++) {
        	for(int j=i; j<=n;j++) {
        		  System.out.println("Hello");
        	}
        }
        
        
        for(int i=1;i<=n;i++) {
        	for(int j=1; j<=n;j+=i) {
        		  System.out.println("Hello");
        	}
        }
        
	}

}
