package linkedlist;

public class Stack {
	
	private int size;

	Node head;
	Node current;
	
	public int size()
	{
		return size;
	}
	
	public boolean push(Object val)
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
	
	public Object pop()
	{
//		if(head!=null)
//		{
//			Object temp = head.val;
//			head = head.nextRef;
//			size--;
//			return temp;
//		}
//		return null;
		
		if(current == null)
		{
			return null;
		}
		else if(current.prevRef == null)
		{
			Node temp = current;
			head = null;
			current = null;
			size--;
			return temp;
		}
		else {
			Node temp = current;
			current = current.prevRef;
			current.nextRef = null;
			size--;
			return temp;
			
		}
	}
	
	public Object peek() {
		if(head!=null)
		{
			return head.val;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public String toString()
	{
		Node start = head;
		String modRef = "";
		while(start!=null)
		{
			modRef+= start.val+",";
			start = start.nextRef;
		}
		modRef = "["+modRef+"]";
		return modRef;
	}
	
	
	//Pending work
	public int search(Object val)
	{
		Node start = current;
		int temp = size;
		while(start!=null)
		{
			if(start.val.equals(val));
			{
				ret;
			}
		}
			
	}
}
