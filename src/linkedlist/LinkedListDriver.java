package linkedlist;

public class LinkedListDriver {

	public static void main(String[] args) {
		
//		LinkedList l1 = new LinkedList();
//		l1.addVal(10);
//		l1.addVal(20);
//		l1.addVal(30);
//		
//		System.out.println(l1.getFirst());
//		System.out.println(l1.getLast());
//		System.out.println(l1.isEmpty());
		
		UniqueLinkedList l1 = new UniqueLinkedList();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(10);
		
		l1.iterate();
	}
}
