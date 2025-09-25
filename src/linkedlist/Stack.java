package linkedlist;

public class Stack {
	
	private int size;

	Node head;
	
	public int size()
	{
		return size;
	}
	
	public boolean push(Object val)
	{
		Node newNode = new Node(val);
		if(head==null)
		{
			head = newNode;
			size++;
			return true;
		}
		
		newNode.nextRef = head;
		head = newNode;
		size++;
		return true;
	}
	
	public Object pop()
	{
		if(head!=null)
		{
			Object temp = head.val;
			head = head.nextRef;
			size--;
			return temp;
		}
		return null;
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
}
