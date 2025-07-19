package MyLinkedList;

public class MyLinkedList {

	
	// state
	Node head=null;

	// behaviour
	
	void InsertAtBegin(int val) {
		
		Node n1= new Node(val);
		n1.next=head;
		head=n1;
		
	}
	
	void InsertAtEnd(int val) {
		
		if(head==null) {
			
			InsertAtBegin(val);
			return;
		}
		// Reaching the tail Node
		Node temp=head;
		while(temp.next != null) {
			temp=temp.next;
		}
		
		// create a New Node
		Node newNode = new Node(val);
		temp.next=newNode;
		
	}
	
	
	void deleteAtBegin() {
		
		if(head==null) {
			return;
		}
//		head=head.next;
		
		Node temp=head;
		head=head.next;
		temp.next=null;
		
	}
	
	void deleteAtEnd() {
		
		if(head==null) {
			return;
		}
		
		if(head.next==null) {
			deleteAtBegin();
			return;
		}
		
		Node temp=head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		
		temp.next=null;
		
		
	}
	
	void insertAtAnyIndex(int index, int val) {
		
		
		if(head==null) {
			InsertAtBegin(val);
			return;
		}
		//Jump
		int jump= index-1;
		Node temp=head;
		while(jump>0) {
			temp=temp.next;
		    jump--;
		}
		
		// Create a NewNode
		Node newNode= new Node(val);
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	
	
	
	void display() {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
	}
}
