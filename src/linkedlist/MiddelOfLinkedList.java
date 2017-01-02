package linkedlist;

public class MiddelOfLinkedList {
	Node head;
	private class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public int middleOfLinkedList(){
		Node slowPointer = head;
		Node fast_pointer = head;
		while(fast_pointer!= null && fast_pointer.next!=null){
			
			fast_pointer = fast_pointer.next.next;
			slowPointer = slowPointer.next;
		}
		return slowPointer.data;
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void print(){
		Node node = head;
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}
	public static void main(String[] args) {
		MiddelOfLinkedList linkedList = new MiddelOfLinkedList();
		for(int i=5; i>0; i--)
			linkedList.push(i);
			linkedList.print();
			System.out.println(">>"+linkedList.middleOfLinkedList());
	}

}
