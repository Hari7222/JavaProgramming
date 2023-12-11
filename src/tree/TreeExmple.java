package tree;

public class TreeExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> n=new TreeNode<Integer>(7);
		 n.Left=new TreeNode<Integer>(16);
		 n.Right=new TreeNode<Integer>(12);
		 n.Left.Left=new TreeNode<Integer>(17);
		 n.Left.Right=new TreeNode<Integer>(19);
		 n.Right.Left=new TreeNode<Integer>(8);
		 n.Right.Right=new TreeNode<Integer>(77);
		 n.Left.Left.Left=new TreeNode<Integer>(12);
		 n.Left.Left.Right=new TreeNode<Integer>(31);
		 n.Left.Right.Left=new TreeNode<Integer>(39);
		 //n.Left.Right.Right=new TreeNode<Integer>(32);
		 //n.Right.Left.Left=new TreeNode<Integer>(29);
		 //n.Right.Left.Right=new TreeNode<Integer>(6);
		 n.Left.Left.Left.Left=new TreeNode<Integer>(5);
		 //n.Left.Left.Left.Right=new TreeNode<Integer>(29);
		 n.Left.Left.Right.Left=new TreeNode<Integer>(9);
		 n.Right.Right.Left=new TreeNode<Integer>(17);
		 //n.Right.Right.Right=new TreeNode<Integer>(11);
		 //n.Right.Right.Left.Right.Right=new TreeNode<Integer>(1);
		 //n.Right.Right.Left.Right.Right.Right=new TreeNode<Integer>(3);
		/*n.Left=new TreeNode<Integer>(7);
		n.Right=new TreeNode<Integer>(8);
		n.Left.Left=new TreeNode<Integer>(1);
		n.Left.Right=new TreeNode<Integer>(9);
		n.Left.Right.Right=new TreeNode<Integer>(2);*/
		 TreeTraversal traversal=new TreeTraversal(n);
		 System.out.println("Height: "+traversal.height(n));
		 System.out.println("Diameter: "+traversal.dia(n));
			
		 /*TreeNode<Integer> mirrorRoot=traversal.mirror(n);
		 System.out.println("Inorder");
		 traversal.inOrder(n);
		 System.out.println("-----------");
		 System.out.println("Preorder");
		 traversal.preOrder();
		 System.out.println("Postorder");
		 traversal.postOrder();
		 System.out.println("Mirror: "+traversal.mirror(n));*/
		 /*int found=traversal.findValue(n);
		 if(found==1)
			 System.out.println("True");
		 else
			 System.out.println("False");*/
		 int value=11,val=10;
		 boolean found1 = traversal.findValue1(n,value);
		 boolean found2 = traversal.findValue1(n,val);
	        if (found1) {
	            System.out.println("Value " + value + ": True.");
	        } else {
	            System.out.println("Value " + value + ": False.");
	        }
	        if (found2) {
	            System.out.println("Value " + val + ": True.");
	        } else {
	            System.out.println("Value " + val + ": False.");
	        }
	    }
		 
		 
		 
	}


 