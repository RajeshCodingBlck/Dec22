package Graph1;

import java.util.Scanner;

public class GraphDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt(); // No of Vertex
		int e= s.nextInt(); // No of Edges
		
		// Edge List
//		int [][] arr= new int[e][2];
//		
//		for(int i=0;i<e;i++) {
//			
//			int u= s.nextInt();
//			int v=s.nextInt();
//			arr[i][0]=u;
//			arr[i][1]=v;
//		}
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i][0]+ " "+ arr[i][1]);
//		}
		
		
		// Adjacent Matrix
		int [][] arr= new int[n][n];
		for(int i=0;i<e;i++) {
			
			int u=s.nextInt();
			int v=s.nextInt();
			
			arr[u][v]=1;
			arr[v][u]=1;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
