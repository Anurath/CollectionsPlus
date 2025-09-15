package linkedlist;

import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList {

	public int size;
	Node head;
	Node current;
	
	public LinkedList()
	{
		//No argument constructor
	}
	
	public int size()
	{
		return size;
	}
	
	public Object getFirst()
	{
		if (head == null) {
	        throw new NoSuchElementException("List is empty");
	    }
	    return head.val;
	}
	
	public Object getLast()
	{
		if (current == null) {
	        throw new NoSuchElementException("List is empty");
	    }
	    return current.val;
	}
	

	public boolean isEmpty() {
		return head == null;
	}
	
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
		System.out.println("]");
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
		if(temp==null)
		{
			return false;
		}
		else if(temp.nextRef == null && temp.prevRef != null)
		{
			current = temp.prevRef;
			current.nextRef = null;
			size--;
			return true;
		}
		else if(temp.prevRef== null && temp.nextRef!= null)
		{
			head = temp.nextRef;
			head.prevRef = null; 
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
	
	public boolean removeFirst()
	{
		if(head == null)
		{
			return false;
		}
		else if(head.nextRef!=null)
		{
			head = head.nextRef;
			head.prevRef= null;
			size--;
		}
		else
		{
			head = null;
			current = null;
			size --;
		}
		return true;
	}
	
	public boolean removeLast()
	{
		if(current == null)
		{
			return false;
		}
		else if(current.prevRef == null)
		{
			head = null;
			current = null;
			size--;
		}
		else {
			current = current.prevRef;
			current.nextRef = null;
			size--;
		}
		return true;
	}
	
	
	private boolean addFirst(Object val)
	{
		if(head == null)
		{
			head = new Node(val);
			current = head;
			size++;
		}
		else {
			Node temp = new Node(val);
			head.prevRef = temp;
			temp.nextRef = head;
			head = temp;
			size++;
		}
		return true;
	}
	
	private boolean addLast(Object val)
	{
		addVal(val);
		return true;
	}
	
	public boolean addAll(LinkedList list)
	{
		Node start = list.head;
		
		while(start!=null)
		{
			addVal(start.val);
			start = start.nextRef;
		}
		return true;
	}
}