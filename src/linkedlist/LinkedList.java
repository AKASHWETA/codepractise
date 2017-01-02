package linkedlist;

public class LinkedList {
 public Node head;
 public Node tail;
 
 public LinkedList(){
	 this.head = new Node("head");
	 this.tail = head;
 }
 
 public void add(Node node){
	 tail.next = node;
	 tail = node;
 }
 public Node head(){
	 return head;
 }
 public static class Node {
		public Node next;
		public String data;
		
		public Node(String data){
			this.data = data;
		}
		
		public void setData(String data){
			this.data = data;
		}
		
		public String getData(){
			return this.data;
		}
		
		public Node next(){
			return next;
		}
		
	}

}
