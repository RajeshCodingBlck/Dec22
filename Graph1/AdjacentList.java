package Graph1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AdjacentList {

	
	public static void BFS(ArrayList<Integer> [] arr, int src
			,int [] visited) {
		
		LinkedList<Integer> q= new LinkedList();
		q.add(src);
		visited[src]=1;
		
		while(q.size()>0) {
			// remove
			int rm= q.removeFirst();
			
			// work
			System.out.print(rm+" ");
			
			// add Their Neighbours
			
			for(int nb : arr[rm]) {
				if(visited[nb]==0) {
					q.add(nb);
					visited[nb]=1;
				}
			}
		}
		
	}
	
	public static void dfs(ArrayList<Integer> [] arr, int src
			,int [] visited) {
		
		
		visited[src]=1;
		System.out.print(src +" ");
		
		for(int nb : arr[src]) {
			
			if(visited[nb]==0) {
				dfs(arr,nb, visited);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt(); // No of Nodes
		int e= s.nextInt(); // No of Edges
		
		ArrayList<Integer> [] arr= new ArrayList[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= new ArrayList();
//			System.out.println(arr[i]);
		}
		
		for(int i=0; i<e;i++) {	
			int u= s.nextInt();
			int v= s.nextInt();
			
			arr[u].add(v);
			arr[v].add(u);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+ " " + arr[i]);
		}
		
		
//		for( ArrayList<Integer> ls : arr) {
//			
//			 for ( int nb: ls) {
//				 System.out.print(nb+" ");
//			 }
//			 System.out.println();
//		}
		
		
//		for( int  nb :arr[2] ) {
//			System.out.print(nb+" ");
//		}
		
		int [] visited = new int[n];
		
//		for(int i=0;i<n;i++) {
//			if(visited[i]==0) {
//				BFS(arr, i, visited);
//			}
//		}
		
		dfs(arr, 0, visited);
		
		
		
		
		
		
	}

}
