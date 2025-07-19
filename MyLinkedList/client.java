package MyLinkedList;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Node n1= new Node(60);
		Node n2= new Node(70);
		Node n3= new Node(80);
		
		
		// creation on Link between Nodes.
		
		n1.next= n2;
		n2.next=n3;
		
		Node head=n1;
		
		
		Node temp=head;
		System.out.println(temp.data);
		temp= temp.next;
		System.out.println(temp.data);
		temp=temp.next;
		System.out.println(temp.data);
		
		
		
	}

}
