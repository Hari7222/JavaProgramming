package binarySearchTree;

public class BSTexp {

	public static void main(String[] args) {
		node n=new node(33);
	    traversal bst=new traversal(n);
		bst.insert(30);
		bst.insert(20);
		bst.insert(90);
		bst.insert(80);
		bst.insert(60);
		bst.insert(50);
		bst.insert(40);
		
		int s1=90,s2=60,s3=55,s4=50;
		/*bst.search(s1);
		System.out.println(s1+" : "+bst.isAvailable);
		bst.search(s2);
		System.out.println(s2+" : "+bst.isAvailable);
		bst.search(s3);
		System.out.println(s3+" : "+bst.isAvailable);
		bst.search(s4);
		System.out.println(s4+" : "+bst.isAvailable);*/
		
		System.out.println(s1+" : "+bst.search(s1));
		System.out.println(s2+" : "+bst.search(s2));
		System.out.println(s3+" : "+bst.search(s3));
		System.out.println(s4+" : "+bst.search(s4));
		
	}

}
