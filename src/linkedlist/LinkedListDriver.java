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
		
		
		
		
//		UniqueLinkedList l1 = new UniqueLinkedList();
//		
//		l1.addVal(10);
//		l1.addVal(20);
//		l1.addVal(30);
//		l1.addVal(10);
//		
//		l1.iterate();
//		System.out.println(l1.size());
//		
//		l1.removeFirst();
//		
//		System.out.println(l1.size());
//		l1.iterate();
		
		
		
//		SortedLinkedList s1 = new SortedLinkedList();
//		
//		s1.addVal(10);
//		s1.addVal(20);
//		s1.addVal(400);
//		s1.addVal(40);
//		s1.addVal(30);
//		
//		SortedLinkedList s2 = new SortedLinkedList();
//		s2.addVal(100);
//		s2.addVal(15);
//		s2.addVal(25);
//		s2.addVal(50);
//		
//		s1.iterate();
		
		
		SmartLinkedList sm1 = new SmartLinkedList();
		sm1.addVal(20);
		sm1.addVal(30);
		sm1.addVal(20);
		sm1.addVal(30);
		sm1.addVal(50);
		System.out.println(sm1.getSize());
		
		sm1.iterator();
	}
}
