package linkedlist;

public class Node {

	Object val;
	
	Node nextRef;
	Node prevRef;
	
	public Node(Object val)
	{
		this.val = val;
	}
	
	public Node next()
	{
		return nextRef;
	}
	
	public Node previous()
	{
		return prevRef;
	}
	
	public boolean hasNext()
	{
		return nextRef != null;
	}
	
	public boolean hasPrevious()
	{
		return prevRef != null;
	}
}
