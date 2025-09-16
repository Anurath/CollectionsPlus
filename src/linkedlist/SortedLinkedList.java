package linkedlist;

public class SortedLinkedList extends LinkedList {

	public boolean addVal(Object val)
	{
		double num = Double.parseDouble(val.toString());
		
		
		Node start = head;
		
		while(start != null)
		{
			double num1 = Double.parseDouble(start.val.toString());
			if(num<=num1)
			{
				if(start.prevRef==null)
				{
	 				super.addVal(val);
					return true;
				}
				else
				{
					Node temp = new Node(val);
					start.prevRef.nextRef = temp;
					temp.prevRef = start.prevRef;
					start.prevRef = temp;
					temp.nextRef =start;
					return true;
				}
			}
			start = start.nextRef;
		}
		super.addVal(val);
		return true;
	}
	
	
	//Upcasting Sorted to Linkedlist 
	public boolean addAll(LinkedList s2)
	{
		Node start = s2.head;
		
		while(start!=null)
		{
			addVal(start.val);
			start = start.nextRef;
		}
		return true;
	}
	
}
