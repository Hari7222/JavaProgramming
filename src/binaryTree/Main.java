package binaryTree;
public class Main {
	public static void main(String[] args) {
	TreeNode<Integer> n=new TreeNode<Integer>(7);
	 n.Left=new TreeNode<Integer>(16);
	 n.Right=new TreeNode<Integer>(12);
	 n.Left.Left=new TreeNode<Integer>(17);
	 n.Left.Right=new TreeNode<Integer>(19);
	 n.Right.Left=new TreeNode<Integer>(8);
	 n.Right.Right=new TreeNode<Integer>(7);
	 n.Left.Left.Left=new TreeNode<Integer>(12);
	 n.Left.Left.Right=new TreeNode<Integer>(31);
	 n.Left.Right.Left=new TreeNode<Integer>(39);
	 n.Left.Right.Right=new TreeNode<Integer>(32);
	 Traversal traversa=new Traversal();
	 /*System.out.println("Inorder");
	 traversa.inOrder();
	 System.out.println("-----------");
	 System.out.println("Preorder");
	 traversa.preOrder();
	 System.out.println("Postorder");
	 traversa.postOrder();*/
	 System.out.println("Diameter: "+traversa.diameter(n));
	 
	
	}
}
