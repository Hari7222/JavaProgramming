  package tree;

public class TreeTraversal {
	TreeNode<Integer> n;
	public TreeTraversal(TreeNode<Integer> root) {
		// TODO Auto-generated constructor stub
		this.n=root;
	}
	public void inOrder() {
		inOrder(n);
	}
	public void inOrder(TreeNode<Integer> currentRoot){
		if(currentRoot!=null) {
			inOrder(currentRoot.Left);
			System.out.println(currentRoot.data);
			inOrder(currentRoot.Right);
		}
	}
	public void preOrder() {
		preOrder(n);
	}
	public void preOrder(TreeNode<Integer> currentRoot){
		if(currentRoot!=null) {
			System.out.println(currentRoot.data);
			preOrder(currentRoot.Left);
			preOrder(currentRoot.Right);
		}
	}
	public void postOrder() {
		postOrder(n);
	}
	public void postOrder(TreeNode<Integer> currentRoot){
		if(currentRoot!=null) {
			postOrder(currentRoot.Left);
			postOrder(currentRoot.Right);
			System.out.println(currentRoot.data);
			
		}
	}


}
