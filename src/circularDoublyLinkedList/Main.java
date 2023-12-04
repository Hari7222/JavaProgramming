package circularDoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		Node n=new Node(0);
		DoubleCircle dc=new DoubleCircle(n);
		dc.addNode(10);
		dc.addNode(20);
		dc.addNode(30);
		dc.addNode(40);
		dc.addFirst(100);
		dc.addFirst(99);
		dc.display();
		
	}

}
