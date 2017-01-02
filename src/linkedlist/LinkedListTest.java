package linkedlist;

public interface LinkedListTest {
	
	public static void main(String args[]){

		LinkedList linkedListTest = new LinkedList();
		LinkedList.Node head = linkedListTest.head();
		linkedListTest.add(new LinkedList.Node("1"));
		linkedListTest.add(new LinkedList.Node("2"));
		linkedListTest.add(new LinkedList.Node("3"));
		linkedListTest.add(new LinkedList.Node("4"));
		linkedListTest.add(new LinkedList.Node("5"));
		linkedListTest.add(new LinkedList.Node("6"));
		
		LinkedList.Node current  = head;
		int length = 0;
		LinkedList.Node middle = head;
		
		while(current.next!=null){
			length++;
			if(length%2 ==0){
				middle = middle.next();
			}
			
			current = current.next();
		}
		
		if(length % 2 == 1){
			middle = middle.next();
		}
		System.out.println("length of LinkedList: " + length);
	      System.out.println("middle element of LinkedList : " + middle.data);

	
	}
}
