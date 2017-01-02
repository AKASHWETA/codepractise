package graph;

public class TreeNode {
	TreeNode next = null;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode parent = null;
	
	int data;
	
	public TreeNode(int d){
		data =d;
	}
	void appendToTail(int d){
		TreeNode end = new TreeNode(d);
		TreeNode n = this;
		while(n.next!=null) {
			n = n.next;
		}
		n.next =end;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
}
