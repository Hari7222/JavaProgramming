package oopsInheritance;
public class Parent2 {
	public Parent2() {
	}
	
	class Node{
		int data;
		Node next;
	    public Node(int data) {
		   this.data=data;
		   this.next=null;
     	}
	}
	public Node head=null;
	public Node tail=null;
	public void addAtStart(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //Node temp will point to head  
            Node temp = head;  
            //newNode will become new head of the list  
            head = newNode;  
            //Node temp(previous head) will be added after new head  
            head.next = temp;  
        }  
    }
}
