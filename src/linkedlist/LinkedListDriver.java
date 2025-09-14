package linkedlist;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		
//		LinkedList l2 = new LinkedList();
//		l2.addVal(50);
//		l2.addVal(60);
//		l2.addVal(70);
//		l2.addVal(80);
		
		
		l1.iterate();
		
		l1.removeLast();
		
		l1.iterate();
	}
}
