package linkedlist;

import java.util.Objects;

public class SmartLinkedList {

	private int size;
	SmartNode head ;
	SmartNode current;
	
	public SmartLinkedList()
	{
		//No argument constructor
	}
	
	public int getSize()
	{
		return size;
	}
	
	public SmartNode contains(Object val)
	{
		SmartNode start = head;
		
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
	
	public boolean addVal(Object val)
	{
		if(contains(val)!=null)
		{
			SmartNode temp =  contains(val);
			temp.setCnt(1);
			return true;
		}
		
		if(head==null)
		{
			SmartNode temp = new SmartNode(val);
			
			head = temp;
			current = temp;
			size++;	
		}
		else {
			SmartNode temp = new SmartNode(val);
			current.nextRef = temp;
			temp.prevRef = current;
			current = temp;
			size++;
		}
		
		return true;
	}
	
	public void clear()
	{
		head = null;
		current = null;
	}
	
	public boolean remove(Object val)
	{
		SmartNode temp = contains(val);
		if(temp!=null)
		{
			if(temp.getCnt()>1)
			{
				temp.setCnt(-1);
				return true;
			}
			else if(temp.prevRef == null && temp.nextRef == null)
			{
				head = null;
				current  = null;
				return true;
			}
			
			else if(temp.prevRef==null && temp.nextRef != null)
			{
				head = head.nextRef;
				head.prevRef = null;
				return true;
			}
			else if(temp.nextRef== null)
			{
				current = current.prevRef;
				current.nextRef = null;
				return true;
			}
		}
		
		return false;
	}
	
	public void iterator()
	{
		SmartNode start = head;
		System.out.print("[");
		while(start!=null)
		{
			int i = start.getCnt();
			
			while(i!=0)
			{
				System.out.print(start.val+",");
				i--;
			}
			start = start.nextRef;
		}
		System.out.println("]");
	}
	
	public boolean isEmpty()
	{
		return getSize() == 0;
	}
}
