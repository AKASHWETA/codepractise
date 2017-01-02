package linkedlist;

public class SinglyLinkedList<E> {
	public Node<E> head;
	public Node<E> tail;
	public int size;
	
	private static class Node<E>{
		private E element;
		private Node<E> next;
		
		public Node(E e, Node<E> n){
			next = n;
			element = e;
		}
		
		public E getElement(){
			return element;
		}
		public void setElement(E e){
			element =e;
		}
		public void addNext(Node<E> n){
			next = n;
		}
		public Node<E> getNext(){
			return next;
		}
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size ==0;
	}
	
	
	public E first(){
		return head.getElement();
		
	}
	
	public E last(){
		return tail.getElement();
	}
	
	public void addFirst(E e){
		 head = new Node<>(e, head);
		if(size ==0)
			tail = head;
		size++;
	}

	public void addLast(E e){
		Node<E> newest = new Node<>(e, null);
		if(isEmpty()) head = newest;
		else tail.next = newest;
		size++;
	}
	
 public E removeFirst(){
	 if(isEmpty()) return null;
	  E answer = head.getElement();
	  head = head.getNext();
	  size--;
	  if(size ==0)
		  tail = null;
	  return answer;
 }
}
 