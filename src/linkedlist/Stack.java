package linkedlist;

public class Stack {

	Node head;
	
	public boolean push(Object val)
	{
		Node newNode = new Node(val);
		if(head==null)
		{
			head = newNode;
			return true;
		}
		
		newNode.nextRef = head;
		head = newNode;
		return true;
	}
	
	public Object pop()
	{
		if(head!=null)
		{
			Object temp = head.val;
			head = head.nextRef;
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
		return head==null;
	}
}
