package linkedlist;

public class DoublyLinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	private class Node<E>{
		private Node<E> next;
		private Node<E> prev;
		private E element;
		
		public Node(E e, Node<E> n, Node<E> p){
			element = e;
			prev = p;
			next =n;
		}
		
		public E getElement(){
			return element;
		}
		
		public void setElement(E e){
			element =e;
		}
		
		public Node<E> getnext(){
			return next;
		}
		public void setNext(Node<E> n){
			next = n;
		}
		
		public Node<E> getPrev(){
			return prev;
		}
		
		public void setPrev(Node<E> p){
			prev =p;
		}
	}
	public DoublyLinkedList(){
		head = new Node<>(null,null,null);
		tail = new Node<>(null,head,null);
	}
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public E first(){
		if(isEmpty()) return null;
		return head.getnext().getElement();
	}
	
	public E last(){
		if(isEmpty()) return null;
		return tail.getPrev().getElement();
	}
	
	public void addFirst(E e){
		addBetween(e,head, head.getnext());
	}
	public void addLast(E e){
		addBetween(e,tail,tail.getPrev());
	}
	
	public E removeFirst(){
		if(isEmpty()) return null;
		return remove(head.getnext());
	}
	
	public E removeLast(){
		if(isEmpty()) return null;
		return remove(tail.getPrev());
	}
	
	public void addBetween(E e, Node<E> predecessor, Node<E> sucessor){
		Node<E> newest = new Node<>(e,head,tail);
		predecessor.setNext(newest);
		sucessor.setPrev(newest);
		size++;
	}
	
	public E remove(Node<E> node){
		Node<E> predecessor = node.getPrev();
		Node<E> sucessor = node.getnext();
		predecessor.setNext(sucessor);
		sucessor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
}
