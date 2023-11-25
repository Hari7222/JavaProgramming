package tree;

public class TreeTraversal {
	TreeNode<Integer> n;
	public TreeTraversal(TreeNode<Integer> root) {
		this.n=root;
	}
	/*public void inOrder() {
		inOrder(n);
	}*/
	public void pattern(TreeNode<Integer> currentRoot) {
		
	}
	public int height(TreeNode<Integer> currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		else {
			Integer data=currentRoot.data;
			int leftHeight=height(currentRoot.Left);
			int rightHeight=height(currentRoot.Right);
			if(leftHeight>rightHeight) {
				return leftHeight+1;
			}
			else {
				return rightHeight+1;
			}
		}
		}
	public TreeNode<Integer> mirror(TreeNode<Integer> currentRoot){
		if(currentRoot==null) {
			return currentRoot;
		}
		else {
			TreeNode<Integer> left=mirror(currentRoot.Left);
			TreeNode<Integer> right=mirror(currentRoot.Right);
			 
			currentRoot.Left=right;
			currentRoot.Right=left;
			
			return currentRoot;
		}
			
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
