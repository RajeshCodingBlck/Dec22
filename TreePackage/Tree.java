package TreePackage;

import java.util.LinkedList;
import java.util.Scanner;

public class Tree {
   
	
	TreeNode root;
	
	Scanner s= new Scanner(System.in);
	
	Tree(){
		root= build();
		System.out.println("PreOrder ................");
		preOrder(root);
		System.out.println();
		System.out.println("InOrder ................");
		InOrder(root);
		System.out.println();
		System.out.println("PostOrder ................");
		postOrder(root);
		
		System.out.println();
		System.out.println("Level Order Traversal ................");
		BFS(root);
	}
	
	
	
	public void BFS(TreeNode root) {
		
		LinkedList<TreeNode> q= new LinkedList();
		
		q.addLast(root);
		while(q.size()>0) {
			
			// remove the Node
			TreeNode rm=q.removeFirst();
			// work for the Node
			System.out.print(rm.data+ " ");
			
			// add their children
			if(rm.left !=null) {
				q.addLast(rm.left);
			}
			
			if(rm.right !=null) {
				q.addLast(rm.right);
			}
		}
	}
	
	
	public void preOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public void postOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public void InOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
		
		
	}
	public  TreeNode build() {
		
		
		System.out.println("Enter the data");
		int data= s.nextInt();
		
		if(data==-1) {
			return  null;
		}
		
		TreeNode abhiKaRoot= new TreeNode(data);
		
		 System.out.println("Enter the data for Left child of "+ data);
		// Left Subtree 
		 abhiKaRoot.left= build();
		
		  System.out.println("Enter the data for right child of "+ data);
		// right Subtree
		  abhiKaRoot.right= build();
		
		  return abhiKaRoot;
		
	}
	
	
}
