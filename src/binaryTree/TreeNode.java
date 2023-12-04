package binaryTree;

public class TreeNode<H> {
	H data;
	TreeNode<H> Left;
	TreeNode<H> Right;
	H temp=data;
	public TreeNode(H data){
		this.data=data;
	}
	public H getData() {
		return data;
	}
	public TreeNode<H> getLeft() {
		return Left;
	}
	public TreeNode<H> getRight() {
		return Right;
	}
	public void setData(H data) {
		this.data = data;
	}
	public void setLeft(TreeNode<H> left) {
		Left = left;
	}
	public void setRight(TreeNode<H> right) {
		Right = right;
	}

}
