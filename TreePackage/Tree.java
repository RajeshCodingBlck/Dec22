package TreePackage;

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
