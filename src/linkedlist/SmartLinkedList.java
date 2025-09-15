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
			temp.setCnt();
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
}
