package treeDiaLowestPath;
public class Logic {
	TreeNode n;
	public Logic(TreeNode root) {
		this.n=root;
	}
	public int height(TreeNode currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		else {
			int leftHeight=height(currentRoot.Left);
			//System.out.println("Left"+leftHeight);
			int rightHeight=height(currentRoot.Right);
			//System.out.println("right"+rightHeight);
			if(leftHeight>rightHeight) {
				return leftHeight+1;
			}
			else {
				return rightHeight+1;
			}
		}
		}
	public int dia(TreeNode currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		else {
			int leftHeight=height(currentRoot.Left);
			int rightHeight=height(currentRoot.Right);
			
			int leftDia=dia(currentRoot.Left);
			System.out.println(currentRoot.data+" Left dia:"+leftDia+" Left height:"+leftHeight);
			int rightDia=dia(currentRoot.Right);
			System.out.println(currentRoot.data+" Right dia:"+rightDia+" Right height:"+rightHeight);
			
			return Math.max((leftHeight+rightHeight+1),Math.max(leftDia, rightDia));
		}
	}
	public TreeNode LCA(TreeNode currentRoot,int a,int b) {
		if(currentRoot==null||currentRoot.data==a||currentRoot.data==b) {
			return currentRoot;
		}
		else {
			TreeNode left=LCA(currentRoot.Left, a, b);
			TreeNode right=LCA(currentRoot.Right, a, b);
			if(left==null) {
				return right;
			}else if(right==null) {
				return left;
			}else {
				return currentRoot;
			}
		}
	}
	public int distance(TreeNode currentRoot,int a,int b) {
		TreeNode lca=LCA(currentRoot, a, b);
		int distA=findDist(lca, a, 0);
		int distB=findDist(lca, b, 0);
		return distA+distB;
	}
	public int findDist(TreeNode node,int value, int level) {
		if(node==null) {
			return -1;
		}
		if(node.data==value) {
			return level;
		}
		int left=findDist(node.Left, value, level+1);
		int right=findDist(node.Right, value, level+1);
		return Math.max(left, right);
	}
}
