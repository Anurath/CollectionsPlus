package linkedlist;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
//		l1.addVal(10);
		l1.addVal(20);
		System.out.println(l1.removeNode(10));
		l1.iterate();
	}
}
