package linkedlist;

public class ArrayList {

	private int size ;
	private int index;
	private Object[] arr;
	
	public ArrayList()
	{
		size = 10;
		arr = new ArrayList[10];
	}
	
	public ArrayList(int initialCapacity)
	{
		size = initialCapacity;
		arr = new ArrayList[initialCapacity];
	}
	
	public boolean add(Object val)
	{
		arr[index++] = val;
		if(index==size)
			size*=2;
		return true;
	}
	
	public void iterator()
	{
		System.out.print('[');
		for(int i=0;i<=index;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
}
