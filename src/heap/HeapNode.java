package heap;

public class HeapNode {
	int data;
	HeapNode Left;
	HeapNode Right;
	public HeapNode(int data) {
		this.data=data;
	}
	public int getData() {
		return data;
	}
	public HeapNode getLeft() {
		return Left;
	}
	public HeapNode getRight() {
		return Right;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setLeft(HeapNode left) {
		Left = left;
	}
	public void setRight(HeapNode right) {
		Right = right;
	}

}
