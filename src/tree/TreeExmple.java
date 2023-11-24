package tree;

public class TreeExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> n=new TreeNode<Integer>(8);
		 n.Left=new TreeNode<Integer>(6);
		 n.Right=new TreeNode<Integer>(5);
		 n.Left.Left=new TreeNode<Integer>(9);
		 n.Left.Right=new TreeNode<Integer>(2);
		 n.Right.Left=new TreeNode<Integer>(7);
		 n.Right.Right=new TreeNode<Integer>(1);
		 n.Left.Left.Left=new TreeNode<Integer>(21);
		 n.Left.Left.Right=new TreeNode<Integer>(19);
		 n.Left.Right.Left=new TreeNode<Integer>(3);
		 n.Left.Right.Right=new TreeNode<Integer>(16);
		 n.Right.Left.Left=new TreeNode<Integer>(12);
		 n.Right.Left.Right=new TreeNode<Integer>(13);
		 
		 TreeTraversal traversal=new TreeTraversal(n);
		 System.out.println("Inorder");
		 traversal.inOrder();
		 System.out.println("-----------");
		 System.out.println("Preorder");
		 traversal.preOrder();
		 System.out.println("Postorder");
		 traversal.postOrder();
	}

}
