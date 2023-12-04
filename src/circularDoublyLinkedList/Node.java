package circularDoublyLinkedList;

public class Node {
	int data;
	Node prev;
	Node next;
	public Node(int data) {
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
