package binarySearchTree;

public class traversal {
	node root;
	//boolean isAvailable=false;
	public traversal(node root) {
		this.root=root;
	}
		public void insert(int value) {
		insert(root,value);
	}
	
    public node insert(node root, int value) {
        if (root == null) {//checks root node is empty
        	root = new node(value);//if empty new value is taken as root
            return root;
        }

        if (value < root.data) {
        	root.left = insert(root.left, value);
        } else if (value > root.data) {
        	root.right = insert(root.right, value);
        }
		return root;   
    }
    /*public node search(int value) {
    	isAvailable=false;
		return search(root,value);
	}
    public node search(node currentRoot, int value) {
        if (currentRoot != null && currentRoot.data==value) {
        	isAvailable=true;
        	return currentRoot;
        }
        else if(currentRoot != null && currentRoot.data>value) {
        	return search(currentRoot.left, value);
        }else if(currentRoot != null && currentRoot.data<value) {
        	return search(currentRoot.right, value);
        }
        return currentRoot;
        }*/
    public boolean search(int value) {
    	return search(root,value);
    }
    public boolean search(node root,int value) {
    	if(root==null) {
    		 return false;
    	}
    	if(value<root.data) {
    		return search(root.left,value);
    	}if(value>root.data) {
    		return search(root.right, value);
    	}
		return true;
    }
 }
