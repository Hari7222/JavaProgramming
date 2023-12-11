package heap;

public class HeapLogic {
	int[] heap;
	int maxSize;
	int size;
	public HeapLogic(int maxSize) {
		this.maxSize=maxSize;
		this.size=0;
		this.heap=new int[maxSize+1];
		this.heap[0]=123;
	}
	public int parentPos(int pos) {
		return pos/2;
	}
	public int leftchild(int pos) {
		return pos*2;
	}
	public int rightChild(int pos) {
		return (pos*2)+1;
	}
	public void swap(int pos1, int pos2) {
		int temp=heap[pos1];
		heap[pos1]=heap[pos2];
		heap[pos2]=temp;
	}
	public void maxHeap(int parentPos,int pos2) {
		if(parentPos !=0 && pos2 !=0 && heap[parentPos]>heap[pos2]) {
			swap(parentPos,pos2);
			maxHeap(parentPos, pos2);
	}
	public void minHeap(int pos) {
		while(pos>0 && parentPos(pos) > 0&& heap[parentPos(pos) > heap(pos)]) {
			swap(pos,parentPos(pos));
			pos=parentPos(pos);
	}
	}
	public void insert(int value) {
		heap[++size]=value;
		int currentSize=size;
		minHeap(currentSize);
		}
	}

}
