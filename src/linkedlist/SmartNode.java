package linkedlist;

public class SmartNode {

	private short cnt=1;
	
	Object val;
	
	SmartNode prevRef;
	SmartNode nextRef;
	
	public SmartNode(Object val)
	{
		this.val = val;
	}
	
	public int getCnt()
	{
		return cnt;
	}
	
	public void  setCnt(int i)
	{
		cnt+=i;;
	}
	
	public SmartNode next()
	{
		return nextRef;
	}
	
	public SmartNode previous()
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
	public String toString()
	{
		return val.toString();
	}
}
