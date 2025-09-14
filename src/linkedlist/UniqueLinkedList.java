package linkedlist;

public class UniqueLinkedList extends LinkedList {

	private int size;
	
	public UniqueLinkedList()
	{
		// No agrument constructor
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean addVal(Object val)
	{
		if(containsNode(val) == null)
		{
			if(head==null)
			{
				head = new Node(val);
				current = head;
				size++;
			}
			else {
				Node temp = new Node(val);
				current.nextRef = temp;
				temp.prevRef = current;
				current = temp;
				size++;
			}
			return true;
		}
		return false;
	}
	
	
	
}
