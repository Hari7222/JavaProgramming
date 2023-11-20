package oopsInheritance;
public class Child22 extends Child2 {
	public Child22() {
		super();
	}
	
	public void display() {
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
	}
}
