package linkedlist;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addFirst(30);
		
		l1.iterate();
	}
}
