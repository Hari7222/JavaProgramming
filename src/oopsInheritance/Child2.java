package oopsInheritance;

//import oopsInheritance.Parent2.Node;

public class Child2 extends Parent2 {
	public Child2() {
		super();
	}
	public void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
 			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	/*public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		//System.out.println("Nodes are singly linked list");
		while(current!=null) {
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}*/
	public void deletefirst() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			head=null;
			tail=null;
		}
	}
	
}
