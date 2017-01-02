package linkedlist;


public class MergeSortLinkedList {
	
	Node startNode;
	
	private class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
	private Node mergeSortLinkedList(Node startNode){
		if(startNode == null || startNode.getNext()==null){
			return null;
		}
		
		Node middle = getMiddle(startNode);
		Node nextOfMiddle = middle.getNext();
		middle.setNext(null);
		
		Node left = mergeSortLinkedList(startNode);
		Node rigth = mergeSortLinkedList(nextOfMiddle);
		
		Node sortedLinkedList = mregeTwoList(left,rigth);
		return sortedLinkedList;
	}
	
	public Node mregeTwoList(Node leftNode, Node rightNode){
		if(leftNode == null)
			return rightNode;
		
		if(rightNode == null)
			return leftNode;
		
		Node temp = null;
		
		if(leftNode.getData() < rightNode.getData()){
			temp = leftNode;
			temp.setNext(mregeTwoList(leftNode.getNext(),rightNode));
		}else{
			temp = rightNode;
			temp.setNext(mregeTwoList(leftNode, rightNode.getNext()));
		}
		
		return temp;
	}
	
	public Node getMiddle(Node startNode){
		if(startNode == null) {
			return startNode;
		}
		
		Node slowPointer= startNode;
		Node fastPointer = startNode;
		while(fastPointer!=null && fastPointer.getNext()!=null && fastPointer.getNext().getNext() !=null){
			fastPointer = fastPointer.getNext().getNext();
			slowPointer = slowPointer.getNext();
		}
		
		return slowPointer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergeSortLinkedList();
	 }
	 
	 public MergeSortLinkedList() {
	  Node node1 = new Node(10);
	  Node node2 = new Node(1);
	  Node node3 = new Node(-2);
	  Node node4 = new Node(8);
	  Node node5 = new Node(9);
	  Node node6 = new Node(10);
	  Node node7 = new Node(1);
	 
	  node1.setNext(node2);
	  node2.setNext(node3);
	  node3.setNext(node4);
	  node4.setNext(node5);
	  node5.setNext(node6);
	  node6.setNext(node7);
	 
	  startNode = node1;
	 
	  Node sortedStartNode = mergeSortLinkedList(startNode);
	  printLinkList(sortedStartNode);
	}
	 private void printLinkList(Node startNode) {
		  Node temp = startNode;
		  while(temp!=null){
		   System.out.print(temp.getData() + " ");
		   temp = temp.getNext();
		  }
		 }
}
