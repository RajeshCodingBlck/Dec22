package MyLinkedList;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Node head= new Node(10);
		Node n2= new Node(20);
		Node n3= new Node(30);
		Node n4= new Node(40);
		
		
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		
//		System.out.println(head.data);
//		System.out.println(n2.data);
//		System.out.println(n3.data);
//		System.out.println(n4.data);
		
		
	    Node temp=head;
	    while(temp !=null) {
	    	System.out.print(temp.data+" -> ");
	    	temp=temp.next;
	    }
	    
	    
		
		
		
		
		
	}

}
