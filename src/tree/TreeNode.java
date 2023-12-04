package tree;

public class TreeNode<A> {
 	A data;
	public TreeNode<A> Left;
	public TreeNode<A> Right;
	A temp=data;
	public TreeNode(A data){
		this.data=data;
		this.Left=null;
		this.Right=null;
	}
	
}
 
