package circularDoublyLinkedList;

public class DoubleCircle implements CirDouFunc {
	Node data;
	public DoubleCircle(Node data) {
		this.data=data;
	}
	public Node head=null;
	public Node tail=null;
	public Node prev=null;
	
	@Override
	public void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			newNode.next=newNode;
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			newNode.prev=head;
			tail=newNode;
		}
		tail.next=head;
		head.prev=tail;
	}
	
	@Override
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			head.next=head;
		    head.prev=head;
		} else {
			newNode.next=head;
			newNode.prev=tail;
			head.prev=newNode;
			tail.next=newNode;
			head=newNode;
		}
	}
	@Override
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}else {
			System.out.println("Doubly circular linked list:");
			do {
				System.out.println(current.getData()+" ");
				current=current.getNext();
		    }while(current!=head);
			System.out.println();
		}
	}
}
