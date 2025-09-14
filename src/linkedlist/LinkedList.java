package linkedlist;

import java.util.Objects;

public class LinkedList {

	private int size;
	Node head;
	Node current;
	
	public boolean addVal(Object val)
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
	
	public void iterate()
	{
		Node start = head;
		System.out.print("[");
		while(start!=null)
		{
			System.out.print(start.val+",");
			start = start.nextRef;
		}
		System.out.print("]");
	}
	
	public Node containsNode(Object val)
	{
		Node start = head;
		while(start!=null)
		{
			if(Objects.equals(val, start.val))
			{
				return start;
			}
			start = start.nextRef;
		}
		return null;
	}
	
	public boolean removeNode(Object val)
	{
		Node temp = containsNode(val);
		
		if(temp.nextRef == null && temp.prevRef != null)
		{
			current = temp.prevRef;
			size--;
			return true;
		}
		else if(temp.prevRef== null && temp.nextRef!= null)
		{
			head = temp.nextRef;
			size--;
			return true;
		}
		else if(temp.prevRef != null && temp.nextRef !=null)
		{
			temp.prevRef.nextRef = temp.nextRef;
			temp.nextRef.prevRef = temp.prevRef;
			size--;
		}
		else if(temp.nextRef ==null && temp.prevRef == null)
		{
			head = null;
			current = null;
			size--;
		}
		return false;
	}
}
