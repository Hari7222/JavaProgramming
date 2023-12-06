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
	public int dia(TreeNode<Integer> currentRoot) {
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
		int n=11;
		if(currentRoot!=null) {
			postOrder(currentRoot.Left);
			postOrder(currentRoot.Right);
			Integer a=currentRoot.data;
			System.out.println(currentRoot.data);			
		}
		if(currentRoot.data==n) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	public int duplicate(TreeNode<Integer> currentRoot) {
		if(currentRoot==null) {
			return 0;
		}
		else {
			int leftnode=duplicate(currentRoot.Left);
			int rightnode=duplicate(currentRoot.Right);
			if(leftnode==rightnode) {
				return leftnode;
			}
			else {
				return 0;
			}
		}
	}
	public int findValue(TreeNode<Integer> currentRoot) {
		if(currentRoot!=null) {
		int leftnode=findValue(currentRoot.Left);
		int rightnode=findValue(currentRoot.Right);
		int value=31;
        if ((leftnode== value)||(rightnode==value))  {
            return 1; 
        }   
        if (currentRoot.data == value) {
                return 1;
        }
        }
		return 0;
    }
	boolean findValue1(TreeNode<Integer> currentRoot, int value) {
        if (currentRoot == null) {
            return false;
        }

        if (currentRoot.data == value) {
            return true;
        }
        return findValue1(currentRoot.Left, value) || findValue1(currentRoot.Right, value);
    }
}
	

