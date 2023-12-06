package binaryTree;

public class Traversal {
	TreeNode<Integer> n;
	public Traversal(TreeNode<Integer> root) {
		this.n=root;
	}
	/*public void inOrder() {
		inOrder(n);
	}
	
	public void inOrder(TreeNode<Integer> currentRoot){
		if(currentRoot!=null) {
			inOrder(currentRoot.getLeft());
			System.out.println(currentRoot.getData());
			inOrder(currentRoot.getRight());
		}
		
	}
	public void preOrder() {
		preOrder(n);
	}
	public void preOrder(TreeNode<Integer> currentRoot){
		if(currentRoot!=null) {
			System.out.println(currentRoot.getData());
			preOrder(currentRoot.getLeft());
			preOrder(currentRoot.getRight());
		}
	}
	public void postOrder() {
		postOrder(n);
	}
	public void postOrder(TreeNode<Integer> currentRoot){
		if(currentRoot!=null) {
			preOrder(currentRoot.getLeft());
			preOrder(currentRoot.getRight());
			System.out.println(currentRoot.getData());
		}
	}*/
	public int diameter(TreeNode<Integer> currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		else {
			int left=diameter(currentRoot.Left);
			int right=diameter(currentRoot.Right);
			return left+right;
		}
		

}
}