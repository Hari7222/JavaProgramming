package treeDiaLowestPath;

public class MainPrg {
	public static void main(String[] args) {
		TreeNode n=new TreeNode(5);
		n.Left=new TreeNode(3);
		n.Right=new TreeNode(6);
		n.Left.Left=new TreeNode(1);
		n.Left.Right=new TreeNode(2);
		//n.Left.Left.Left=new TreeNode(2);
		//n.Left.Right.Left=new TreeNode(8);
		//n.Left.Right.Left.Right=new TreeNode(1);
		n.Right.Right=new TreeNode(10);
		//n.Right.Right.Right=new TreeNode(10);
		n.Right.Left=new TreeNode(8);
		//n.Left.Left.Right=new TreeNode(12);
		Logic logic=new Logic(n);
		TreeNode LCA= logic.LCA(n,3,10);
		if(LCA!=null)
			System.out.println("Shortest path b/w 3 & 10 :"+LCA.data);
		else
			System.out.println("No path found");
		System.out.println("Distance: "+logic.distance(n, 1, 10));
	}

}
